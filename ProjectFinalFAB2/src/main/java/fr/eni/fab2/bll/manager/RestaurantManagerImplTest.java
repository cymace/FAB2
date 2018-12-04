package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.BLLException;

class RestaurantManagerImplTest implements RestaurantManager {

	@Override
	public Restaurant add(Restaurant restaurant) throws BLLException {
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

}
