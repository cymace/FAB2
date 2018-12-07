package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.DAOException;

public interface RestaurantDAO {
	

	public int add(Restaurant restaurant) throws DAOException;


	public void delete(int id) throws DAOException;


	public void update(Restaurant restaurant) throws DAOException;

	public List<Restaurant> findAll() throws DAOException;

	//public List<Plate> getPlateByRestaurant(int idRestaurant) throws DAOException;
	
	public Restaurant selectById(int id) throws DAOException;

}
