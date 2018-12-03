package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Order;

public interface OrderManager {
	
    public Order add(Order order);
	
	public void delete(Order order);
	
	public Order getById(int id);
	
	public void update(Order order);

	public List<Order> getAll();
}
