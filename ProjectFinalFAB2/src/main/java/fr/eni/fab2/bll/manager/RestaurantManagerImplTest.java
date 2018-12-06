package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.BLLException;

class RestaurantManagerImplTest implements RestaurantManager {

	@Override
	public Restaurant add(Restaurant restaurant) throws BLLException {
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

	}

	@Override
	public Restaurant getById(int id) throws BLLException {
		return new Restaurant("monRestoGetById", "8 rue leo lagrange", 150, null, null);
	}

	@Override
	public void update(Restaurant restaurant) throws BLLException {

	}

	@Override
	public List<Restaurant> getAll() throws BLLException {
		List<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new Restaurant("monResto", "8 rue leo lagrange", 150, null, null));

		return restaurants;
	}

	@Override
	public Restaurant getByOrder(Order order) throws BLLException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
