package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Restaurant;

public interface RestaurantDAO {
	
	public void add(Restaurant restaurant) throws Exception;

	public void delete(int id);

	public void update(Restaurant restaurant) throws Exception;

	public List<Restaurant> findAll() throws Exception;
	
	//public List<Plate> getPlateByRestaurant(int idRestaurant) throws Exception;
	
	public Restaurant selectById(int id);

}
