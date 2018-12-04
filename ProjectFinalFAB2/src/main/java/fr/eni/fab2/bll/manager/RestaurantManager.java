package fr.eni.fab2.bll.manager;

import java.util.List;


import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.BLLException;

public interface RestaurantManager {
	
	 public Restaurant add(Restaurant restaurant) throws BLLException;
		
		public void delete(Restaurant restaurant) throws BLLException;
		
		public Restaurant getById(int id) throws BLLException;
		
		public void update(Restaurant restaurant) throws BLLException;

		public List<Restaurant> getAll() throws BLLException;
	
	
}
