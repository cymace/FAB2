package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Plate;

public class PlateDAOImpl implements PlateDAO{
	
	public void add(Plate plate) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(plate);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du plate " + plate + " : " + e.getMessage());
		}
	}
	
	public void update(Plate plate) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(plate);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du plate " + plate + " : " + e.getMessage());
		}
	}
	
	public void delete(Plate plate) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.remove(plate);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de la delete du plate " + plate + " : " + e.getMessage());
		}
	}
	
	public List<Plate> findAll() {
		String req = "Select Object(p) from Plate p";
		return DAOUtil.getEntityManager().createQuery(req, Plate.class).getResultList();
	}
	
	/*public List<Plate> findPlatesOfRestaurant(int idRest) {
		String req = "Select Object(i) from Plate p WHERE p.auteur LIKE :aut"";
		return DAOUtil.getEntityManager().createQuery(req, Plate.class).getResultList();
	}*/

}
