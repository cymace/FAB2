package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.BLLException;

class ReservationManagerImplTest implements ReservationManager {

	@Override
	public Reservation add(Reservation reservation, int userId) throws BLLException {
		reservation.setId(1);
		
		reservation.setDateReservation(LocalDateTime.now().withNano(0));
		reservation.setUser(BllManagerFactory.getUserManager().getById(userId));
		
		System.out.println("ajout reservation ");
		
		
		
		return reservation;
	}
	@Override
	public void delete(Reservation reservation) throws BLLException {

	}

	@Override
	public Reservation getById(int id) throws BLLException {
		Reservation reservation = new Reservation();
		reservation.setId(id);
		reservation.setUser(new User("gobron", "fabien", "07.78.76.28.35", "fabiengobron@outlook.com", "password", true));

		return reservation;
	}

	@Override
	public void update(Reservation reservation) throws BLLException {

	}

	@Override
	public List<Reservation> getAll() throws BLLException {
		List<Reservation> reservations = new ArrayList<>();
		reservations.add(this.getById(1));
		reservations.add(this.getById(2));

		return reservations;
	}

	

}
