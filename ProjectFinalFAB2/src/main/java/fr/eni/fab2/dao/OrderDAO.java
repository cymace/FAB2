package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Order;

public interface OrderDAO {
	
	public void add(Order order);
	
	public void update(Order order);
	
	public void delete(int id);
	
	public List<Order> findAll();

}
