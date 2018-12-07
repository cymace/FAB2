package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.ReservationDAO;
import fr.eni.fab2.exceptions.BLLException;
import fr.eni.fab2.exceptions.DAOException;

public class ReservationManagerImpl implements ReservationManager {
	ReservationDAO reservationDAO = DaoFactory.getReservationDAO();

	@Override
	public Reservation add(Reservation reservation, int userId) throws BLLException {
		//reservation.setDateReservation(LocalDateTime.now().withNano(0));
		reservation.setUser(BllManagerFactory.getUserManager().getById(userId));
		try {
			int id = reservationDAO.add(reservation);
			reservation = this.getById(id);
			
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}	
		return reservation;	
	}

	@Override
	public void delete(Reservation reservation) throws BLLException {
		try {
			reservationDAO.delete(reservation.getId());
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}			
	}

	@Override
	public Reservation getById(int id) throws BLLException {
		Reservation reservation;
		try {
			reservation = reservationDAO.selectById(id);
		} catch (DAOException e) {
			throw new BLLException(e.getMessage());
		}			
		return reservation;
	}

	@Override
	public void update(Reservation reservation) throws BLLException {
		try {
			reservationDAO.update(reservation);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}	
	
	}

	@Override
	public List<Reservation> getAll() throws BLLException {
		List<Reservation> reservations;
		try {
			reservations = reservationDAO.findAll();
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		return reservations;
	}

}
