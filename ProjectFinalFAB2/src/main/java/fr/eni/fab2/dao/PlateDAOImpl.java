package fr.eni.fab2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.DAOException;

public class PlateDAOImpl implements PlateDAO{
	
	public int add(Plate plate) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(plate);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du plate: " + e.getMessage());
		}
		em.close();
		return plate.getId();
	}
	
	public void update(Plate plate) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {			
			em.merge(plate);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du plate : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			Plate plateDelete;
			plateDelete = em.find(Plate.class, id);
			em.remove(plateDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de la delete du plate : " + e.getMessage());
		}
		em.close();
	}
	
	public List<Plate> findAll() throws DAOException {
		List<Plate> plates;
		try {
			String req = "Select Object(p) from Plate p";
			plates = DAOUtil.getEntityManager().createQuery(req, Plate.class).getResultList();
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find all plates : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return plates;		
	}
	
	public Plate selectById(int id) throws DAOException {
		Plate plate; 
		try {
			plate = DAOUtil.getEntityManager().find(Plate.class, id);
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find by id des plates : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return plate;			
	}
	
	public List<Plate> selectByRestaurant(Restaurant restaurant) throws DAOException {
		List<Plate> plates;
		try {
			plates = restaurant.getPlates();
						
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find by id des plates : "+ e.getMessage());
		}
		return plates;		
	}

}
