package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.User;

public class PlateDAOImpl implements PlateDAO{
	
	public int add(Plate plate) {
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
		return plate.getId();
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
	
	public void delete(int id) {
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
			e.printStackTrace();
		}
	}
	
	public List<Plate> findAll() {
		String req = "Select Object(p) from Plate p";
		return DAOUtil.getEntityManager().createQuery(req, Plate.class).getResultList();
	}
	
	public Plate selectById(int id) {
		return DAOUtil.getEntityManager().find(Plate.class, id);
			
	}
	
	/*public List<Plate> findPlatesOfRestaurant(int idRest) {
		String req = "Select Object(i) from Plate p WHERE p.auteur LIKE :aut"";
		return DAOUtil.getEntityManager().createQuery(req, Plate.class).getResultList();
	}*/

}
