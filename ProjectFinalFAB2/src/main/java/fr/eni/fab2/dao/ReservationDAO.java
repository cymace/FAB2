package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.exceptions.DAOException;

public interface ReservationDAO {
	
	public int add(Reservation reservation);
	
	public void update(Reservation reservation);
	
	public void delete(int id);
	
	public List<Reservation> findAll();
	
	public Reservation selectById(int id);

}
