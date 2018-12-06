package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.OrderDAO;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.exceptions.BLLException;

public class OrderManagerImpl implements OrderManager {
	OrderDAO orderDao = DaoFactory.getOrderDAO();
	

	@Override
	public Order add(Order order, int userId, int restaurantsId, int plateId) throws BLLException {
		order.setDateOrder(LocalDateTime.now().withNano(0));

		Restaurant restaurant = BllManagerFactory.getRestaurantManager().getById(restaurantsId);
		User user = BllManagerFactory.getUserManager().getById(userId);
		order.setUser(user);
		order.setRestaurant(restaurant);
		List<Plate> plates;
		if (order.getPlates() == null) {
			plates = new ArrayList<>();
		} else {
			plates = order.getPlates();
		}
		Plate plate = BllManagerFactory.getPlateManager().getById(plateId);
		plates.add(plate);
		order.setPlates(plates);

		int id = orderDao.add(order);
		order = this.getById(id);

		List<Order> ordersResto;
		List<Order> ordersPlates;
		ordersResto = (restaurant.getOrders() == null) ? new ArrayList<>() : restaurant.getOrders();
		ordersPlates = (plate.getOrders() == null) ? new ArrayList<>() : plate.getOrders();
		ordersResto.add(order);
		ordersPlates.add(order);
		restaurant.setOrders(ordersResto);
		plate.setOrders(ordersPlates);
		BllManagerFactory.getRestaurantManager().update(restaurant);
		BllManagerFactory.getPlateManager().update(plate);

		return order;
	}

	@Override
	public Order addPlate(Order order, int plateId) throws BLLException {
		List<Plate> plates = (order.getPlates() == null) ? new ArrayList<>() : order.getPlates();
		Plate plate = BllManagerFactory.getPlateManager().getById(plateId);
		plates.add(plate);
		order.setPlates(plates);
		this.update(order);
		return order;
	}

	@Override
	public void delete(Order order) throws BLLException {
		for(Plate plate : order.getPlates()){
			List<Order> orders=	plate.getOrders();
			orders.remove(plate.getOrders().indexOf(order));
			plate.setOrders(orders);
			BllManagerFactory.getPlateManager().update(plate);	
		}
		Restaurant restaurant = order.getRestaurant();
		List<Order> orders= restaurant.getOrders();
		orders.remove(restaurant.getOrders().indexOf(order));
		restaurant.setOrders(orders);
		BllManagerFactory.getRestaurantManager().update(restaurant);	
		orderDao.delete(order.getId());
	}

	@Override
	public Order getById(int id) throws BLLException {
		Order order = orderDao.selectById(id);
		return order;
	}

	@Override
	public void update(Order order) throws BLLException {
		orderDao.update(order);
	}

	@Override
	public List<Order> getAll() throws BLLException {
		return orderDao.findAll();
	}

}
