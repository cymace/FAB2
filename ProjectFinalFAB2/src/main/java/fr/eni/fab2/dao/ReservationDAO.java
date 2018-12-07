package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.exceptions.DAOException;

public interface ReservationDAO {
	
	public int add(Reservation reservation) throws DAOException;
	
	public void update(Reservation reservation) throws DAOException;
	
	public void delete(int id) throws DAOException;
	
	public List<Reservation> findAll() throws DAOException;
	
	public Reservation selectById(int id) throws DAOException;

}
