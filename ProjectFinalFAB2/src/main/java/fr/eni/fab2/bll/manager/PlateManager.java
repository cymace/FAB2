package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.BLLException;

public interface PlateManager {
	
    public Plate add(Plate plate , int id) throws BLLException;
	
	public void delete(Plate plate) throws BLLException;
	
	public Plate getById(int id) throws BLLException;
	
	public void update(Plate plate) throws BLLException;

	public List<Plate> getAll() throws BLLException;
	
	public List<Plate> getByRestaurant(Restaurant restaurant) throws BLLException;

}
