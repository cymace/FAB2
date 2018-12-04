package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Plate;

public interface PlateDAO {
	
	public void add(Plate plate);
	
	public void update(Plate plate);
	
	public void delete(Plate plate);
	
	public List<Plate> findAll();

}
