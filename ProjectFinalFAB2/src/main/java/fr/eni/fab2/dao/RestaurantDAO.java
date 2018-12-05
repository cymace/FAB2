package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Restaurant;

public interface RestaurantDAO {
	
	public int add(Restaurant restaurant) ;

	public void delete(int id);

	public void update(Restaurant restaurant) ;

	public List<Restaurant> findAll() ;
	
	//public List<Plate> getPlateByRestaurant(int idRestaurant) throws Exception;
	
	public Restaurant selectById(int id);

}
