package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.DAOException;

public interface PlateDAO {
	
	public int add(Plate plate) throws DAOException;
	
	public void update(Plate plate) throws DAOException;
	
	public void delete(int id) throws DAOException;
	
	public List<Plate> findAll() throws DAOException;
	
	public Plate selectById(int id) throws DAOException;
	
	public List<Plate> selectByRestaurant(Restaurant restaurant) throws DAOException;

}
