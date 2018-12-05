package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.User;

public class ReservationDAOImpl implements ReservationDAO{
	
	public int add(Reservation reservation) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(reservation);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du reservation " + reservation + " : " + e.getMessage());
		}
		return reservation.getId();
	}
	
	public void update(Reservation reservation) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(reservation);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du reservation " + reservation + " : " + e.getMessage());
		}
	}
	
	public void delete(int id) {
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
			e.printStackTrace();
		}
	}
	
	public List<Reservation> findAll() {
		String req = "Select Object(res) from Reservation res";
		return DAOUtil.getEntityManager().createQuery(req, Reservation.class).getResultList();
	}
	
	public Reservation selectById(int id) {
		return DAOUtil.getEntityManager().find(Reservation.class, id);
			
	}

}
