package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.RestaurantDAO;
import fr.eni.fab2.exceptions.BLLException;
import fr.eni.fab2.exceptions.DAOException;

public class RestaurantManagerImpl implements RestaurantManager {
	RestaurantDAO restaurantDAO = DaoFactory.getRestaurantDAO();

	@Override
	public Restaurant add(Restaurant restaurant) throws BLLException {
		int id;
		try {
			id = restaurantDAO.add(restaurant);
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		}			
		restaurant = this.getById(id);
		return restaurant;
	}

	@Override
	public Restaurant addPlate(int restaurantId, int plateId) throws BLLException {
		Restaurant restaurant = this.getById(restaurantId);
		List<Plate> plates = (restaurant.getPlates() == null) ? new ArrayList<>() : restaurant.getPlates();
		Plate plate = BllManagerFactory.getPlateManager().getById(plateId);
		plates.add(plate);
		restaurant.setPlates(plates);

		this.update(restaurant);

		List<Restaurant> restaurants = (plate.getRestaurants() == null) ? new ArrayList<>() : plate.getRestaurants();
		restaurants.add(restaurant);
		plate.setRestaurants(restaurants);
		plate.getRestaurants();

		BllManagerFactory.getPlateManager().update(plate);

		return restaurant;
	}

	@Override
	public void delete(Restaurant restaurant) throws BLLException {
		try {

		for(Plate plate : restaurant.getPlates()){
			List<Restaurant> restaurants=plate.getRestaurants();
			restaurants.remove(plate.getOrders().indexOf(restaurant));
			plate.setRestaurants(restaurants);
			BllManagerFactory.getPlateManager().update(plate);	
		}
		restaurantDAO.delete(restaurant.getId());
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
			}
	}

	@Override
	public Restaurant getById(int id) throws BLLException {
		Restaurant restaurant;
		try {
			restaurant = restaurantDAO.selectById(id);
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		
		}
		return restaurant;
	}

	@Override
	public void update(Restaurant restaurant) throws BLLException {

		try {
			restaurantDAO.update(restaurant);
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		
		}

	}

	@Override
	public List<Restaurant> getAll() throws BLLException {
		List<Restaurant> restaurants;
		try {
			restaurants = restaurantDAO.findAll();
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		}
		return restaurants;
	}

	@Override
	public Restaurant getByOrder(Order order) throws BLLException {
		Restaurant restaurant = order.getRestaurant();

		return restaurant;
		
	
	}

}
