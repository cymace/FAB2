package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Reservation;

public class ReservationDAOImpl implements ReservationDAO{
	
	public void add(Reservation reservation) {
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
	
	public void delete(Reservation reservation) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.remove(reservation);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de la delete du reservation " + reservation + " : " + e.getMessage());
		}
	}
	
	public List<Reservation> findAll() {
		String req = "Select Object(res) from Reservation res";
		return DAOUtil.getEntityManager().createQuery(req, Reservation.class).getResultList();
	}

}
