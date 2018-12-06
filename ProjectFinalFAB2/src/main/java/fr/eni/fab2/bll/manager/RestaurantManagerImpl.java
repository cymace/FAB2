package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.RestaurantDAO;
import fr.eni.fab2.exceptions.BLLException;

public class RestaurantManagerImpl implements RestaurantManager {
	RestaurantDAO restaurantDAO = DaoFactory.getRestaurantDAO();

	@Override
	public Restaurant add(Restaurant restaurant) throws BLLException {
		// TODO Auto-generated method stub
		return null;
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
			restaurantDAO.delete(restaurant.getId());
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public Restaurant getById(int id) throws BLLException {
//Restaurant restaurant = restaurantDAO.findById(id);
return null;
	}

	@Override
	public void update(Restaurant restaurant) throws BLLException {

	//restaurantDAO.update(restaurant);

	}

	@Override
	public List<Restaurant> getAll() throws BLLException {
		 //List<Restaurant> restaurants = restaurantDAO.findAll();
		return null;
	}

}
