package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.DAOException;

public interface OrderDAO {
	
	public int add(Order order)  throws DAOException;
	
	public void update(Order order)  throws DAOException;
	
	public void delete(int id)  throws DAOException;
	
	public List<Order> findAll()  throws DAOException;
	
	public Order selectById(int id)  throws DAOException;

}
