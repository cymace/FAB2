package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.User;

 class ReservationManagerImplTest implements ReservationManager {

	@Override
	public Reservation add(Reservation reservation) {
		reservation.setId(1);
		return reservation;
	}

	@Override
	public void delete(Reservation reservation) {
		
	}

	@Override
	public Reservation getById(int id) {
		Reservation reservation = new Reservation();
				reservation.setId(id);
				reservation.setUser(new User("gobron", "fabien", "07.78.76.28.35", "fabiengobron@outlook.com", "password", true));
		return reservation ;
	}

	@Override
	public void update(Reservation reservation) {
		
	}

	@Override
	public List<Reservation> getAll() {
List<Reservation> reservations =null;
		return reservations;
	}

}
