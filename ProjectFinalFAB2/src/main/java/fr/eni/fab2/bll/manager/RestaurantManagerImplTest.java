package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Restaurant;

 class RestaurantManagerImplTest implements RestaurantManager {

	@Override
	public Restaurant add(Restaurant restaurant) {
		return restaurant;
	}

	@Override
	public void delete(Restaurant restaurant) {
		
	}

	@Override
	public Restaurant getById(int id) {
		return new Restaurant();
	}

	@Override
	public void update(Restaurant restaurant) {
		
	}

	@Override
	public List<Restaurant> getAll() {
List<Restaurant> restaurants=null;
return restaurants;
	}

}
