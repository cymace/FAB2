package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;

public interface PlateDAO {
	
	public int add(Plate plate);
	
	public void update(Plate plate);
	
	public void delete(int id);
	
	public List<Plate> findAll();
	
	public Plate selectById(int id);
	
	public List<Plate> selectByRestaurant(Restaurant restaurant);

}
