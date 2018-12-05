package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.User;

public interface OrderDAO {
	
	public int add(Order order);
	
	public void update(Order order);
	
	public void delete(int id);
	
	public List<Order> findAll();
	
	public Order selectById(int id);

}
