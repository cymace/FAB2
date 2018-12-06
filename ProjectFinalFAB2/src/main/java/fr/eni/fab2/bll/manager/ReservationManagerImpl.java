package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.List;

import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.ReservationDAO;
import fr.eni.fab2.exceptions.BLLException;

public class ReservationManagerImpl implements ReservationManager {
	ReservationDAO reservationDAO = DaoFactory.getReservationDAO();

	@Override
	public Reservation add(Reservation reservation, int userId) throws BLLException {
		//reservation.setDateReservation(LocalDateTime.now().withNano(0));
		reservation.setUser(BllManagerFactory.getUserManager().getById(userId));
		int id = reservationDAO.add(reservation);
		reservation = this.getById(id);
		return reservation;
	}

	@Override
	public void delete(Reservation reservation) throws BLLException {
		reservationDAO.delete(reservation.getId());
	}

	@Override
	public Reservation getById(int id) throws BLLException {
		Reservation reservation=  reservationDAO.selectById(id);
		return reservation;
	}

	@Override
	public void update(Reservation reservation) throws BLLException {
		reservationDAO.update(reservation);
	}

	@Override
	public List<Reservation> getAll() throws BLLException {
		List<Reservation> reservations = reservationDAO.findAll();
		return reservations;
	}

}
