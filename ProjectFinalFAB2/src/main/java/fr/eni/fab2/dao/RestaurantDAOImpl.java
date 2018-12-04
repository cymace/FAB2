package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Restaurant;


public class RestaurantDAOImpl implements RestaurantDAO{
	
	/*public RestaurantDAOImpl(){
		daoRestaurant = new GenericDaoImpl<>();
	}*/
	
	public void add(Restaurant restaurant) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(restaurant);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du restaurant " + restaurant + " : " + e.getMessage());
		}
	}
	
	public void update(Restaurant restaurant) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(restaurant);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du restaurant " + restaurant + " : " + e.getMessage());
		}
	}
	
	public void delete(Restaurant restaurant) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.remove(restaurant);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de la delete du restaurant " + restaurant + " : " + e.getMessage());
		}
	}
	
	public List<Restaurant> findAll() {
		String req = "Select Object(r) from Restaurant r";
		return DAOUtil.getEntityManager().createQuery(req, Restaurant.class).getResultList();
	}
	
	public Restaurant selectById(int id) {
		return DAOUtil.getEntityManager().find(Restaurant.class, id);
			
	}
	
	/*public List<plates> selectPlates(Restaurant restaurant) {
		return DAOUtil.getEntityManager().			
	}*/
	
	
	
	

}
