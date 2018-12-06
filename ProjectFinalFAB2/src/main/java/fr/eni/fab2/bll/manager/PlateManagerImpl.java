package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.PlateDAO;
import fr.eni.fab2.exceptions.BLLException;
import fr.eni.fab2.exceptions.DAOException;

public class PlateManagerImpl implements PlateManager {

	PlateDAO plateDao = DaoFactory.getPlateDAO();

	@Override
	public Plate add(Plate plate, int id) throws BLLException {

		RestaurantManager restaurantManager = BllManagerFactory.getRestaurantManager();
		Restaurant restaurant = restaurantManager.getById(id);
		List<Restaurant> restaurants;
		List<Plate> plates;

		if (plate.getRestaurants() == null) {
			restaurants = new ArrayList<>();
		} else {
			restaurants = plate.getRestaurants();
		}

		if (restaurant.getPlates() == null) {
			plates = new ArrayList<>();
		} else {
			plates = restaurant.getPlates();
		}

		restaurants.add(restaurant);
		plate.setRestaurants(restaurants);

		try {
			int idplate = plateDao.add(plate);
			plate = this.getById(idplate);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
		plates.add(plate);
		restaurant.setPlates(plates);
		restaurantManager.update(restaurant);

		return plate;
	}

	@Override
	public void delete(Plate plate) throws BLLException {

		try {
			plateDao.delete(plate.getId());
		
		for (Restaurant restaurant : plate.getRestaurants()){
		List<Plate> plates=	restaurant.getPlates();
		plates.remove(restaurant.getPlates().indexOf(plate));
		restaurant.setPlates(plates);
		BllManagerFactory.getRestaurantManager().update(restaurant);		
		}
		for(Order order : plate.getOrders()){
			List<Plate> plates=	order.getPlates();
			plates.remove(order.getPlates().indexOf(plate));
			order.setPlates(plates);
			BllManagerFactory.getOrderManager().update(order);	
		}
		plateDao.delete(plate.getId());
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
			}
			

	}

	@Override
	public Plate getById(int id) throws BLLException {
		 Plate plate;
		try {
			plate = plateDao.selectById(id);
		} catch (DAOException e) {
		
			throw new BLLException(e.getMessage());
			}
		
		return plate;
	}

	@Override
	public void update(Plate plate) throws BLLException {
		try {
			plateDao.update(plate);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public List<Plate> getAll() throws BLLException {
		List<Plate> plates;
		try {
			plates = plateDao.findAll();
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		return plates;
	}

	@Override
	public List<Plate> getByRestaurant(Restaurant restaurant) throws BLLException {
		List<Plate> plates;
		try {
			plates = plateDao.selectByRestaurant(restaurant);
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		
		}
		return plates;
	}

	@Override
	public List<Plate> getByOrder(Order order) throws BLLException {
				List<Plate> plates = order.getPlates();
		return plates;
	}

}
