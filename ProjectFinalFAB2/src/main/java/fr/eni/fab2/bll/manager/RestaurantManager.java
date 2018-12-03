package fr.eni.fab2.bll.manager;

import java.util.List;


import fr.eni.fab2.bean.Restaurant;

public interface RestaurantManager {
	
	 public Restaurant add(Restaurant restaurant);
		
		public void delete(Restaurant restaurant);
		
		public Restaurant getById(int id);
		
		public void update(Restaurant restaurant);

		public List<Restaurant> getAll();
	
	
}
