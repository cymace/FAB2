package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.BLLException;
import javassist.expr.NewArray;

class OrderManagerImplTest implements OrderManager {

	
	private static Order orderTest;
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

		System.out.println("ajout plates");

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

		// WARNING a supprimer
					orderTest=order;
		return order;
	}

	@Override
	public Order addPlate(Order order, int plateId) throws BLLException {
		//WARNING a supprimer			
		order=orderTest;	
		List<Plate> plates = (order.getPlates() == null) ? new ArrayList<>() : order.getPlates();
		Plate plate = BllManagerFactory.getPlateManager().getById(plateId);
		plates.add(plate);
		order.setPlates(plates);
		this.update(order);
		//WARNING a supprimer	
		orderTest=order;
		return order;
	}

	@Override
	public void delete(Order order) throws BLLException {

	}

	@Override
	public Order getById(int id) throws BLLException {
		return new Order(LocalDateTime.now(), new User());
	}

	@Override
	public void update(Order order) throws BLLException {
		//WARNING a supprimer			
		order=orderTest;
		order.setDateOrder(LocalDateTime.now().withNano(0));
	}

	@Override
	public List<Order> getAll() throws BLLException {
		List<Plate> plates = new ArrayList<>();
		plates.add(new Plate());

		List<Order> orders = new ArrayList<>();
		orders.add(new Order(LocalDateTime.now(), new User(), plates, new Restaurant()));
		return orders;
	}

}
