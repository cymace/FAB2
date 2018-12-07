package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.DAOException;

public class ReservationDAOImpl implements ReservationDAO{
	
	public int add(Reservation reservation) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(reservation);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du reservation : " + e.getMessage());
		}
		em.close();
		return reservation.getId();
	}
	
	public void update(Reservation reservation) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(reservation);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du reservation : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			Reservation reservationDelete;
			reservationDelete = em.find(Reservation.class, id);
			em.remove(reservationDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de la delete du reservation : " + e.getMessage());
		}
		em.close();
	}
	
	public List<Reservation> findAll() throws DAOException {
		List<Reservation> reservations;
		try {
			String req = "Select Object(res) from Reservation res";
			reservations = DAOUtil.getEntityManager().createQuery(req, Reservation.class).getResultList();						
		} catch (Exception e) {
		throw new DAOException("Erreur lors de la findAll du reservation : " + e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return reservations;
	}
	
	public Reservation selectById(int id) throws DAOException {
		Reservation reservation;
		try {		
			reservation = DAOUtil.getEntityManager().find(Reservation.class, id);
		} catch (Exception e) {
		throw new DAOException("Erreur lors de la selectById du reservation : " + e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return reservation;		
	}

}
