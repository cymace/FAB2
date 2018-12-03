package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Reservation;

public interface ReservationManager {


    public Reservation add(Reservation reservation);
	
	public void delete(Reservation reservation);
	
	public Reservation getById(int id);
	
	public void update(Reservation reservation);

	public List<Reservation> getAll();
	
}
