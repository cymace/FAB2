package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.exceptions.BLLException;

public interface ReservationManager {


    public Reservation add(Reservation reservation,int userId) throws BLLException;
	
	public void delete(Reservation reservation) throws BLLException;
	
	public Reservation getById(int id) throws BLLException;
	
	public void update(Reservation reservation) throws BLLException;

	public List<Reservation> getAll() throws BLLException;
	
}
