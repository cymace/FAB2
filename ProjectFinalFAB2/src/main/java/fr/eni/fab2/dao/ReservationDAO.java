package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Reservation;

public interface ReservationDAO {
	
	public void add(Reservation reservation);
	
	public void update(Reservation reservation);
	
	public void delete(int id);
	
	public List<Reservation> findAll();

}
