package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;

public interface RestaurantDAO {
	
	public void add(Restaurant restaurant) throws Exception;

	public void delete(Restaurant restaurant) throws Exception;

	public void update(Restaurant restaurant) throws Exception;

	public List<Restaurant> findAll() throws Exception;
	
	//public List<Plate> getPlateByRestaurant(int idRestaurant) throws Exception;
	
	public Restaurant selectById(int id);

}
