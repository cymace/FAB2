package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.exceptions.BLLException;

public interface OrderManager {
	
    public Order add(Order order,int userId,int restaurantsId,int plateId) throws BLLException;
    
    public Order addPlate(Order order,int plateId) throws BLLException; // SERVICE uniquement en BLL
	
	public void delete(Order order) throws BLLException;
	
	public Order getById(int id) throws BLLException;
	
	public void update(Order order) throws BLLException;

	public List<Order> getAll() throws BLLException;
}
