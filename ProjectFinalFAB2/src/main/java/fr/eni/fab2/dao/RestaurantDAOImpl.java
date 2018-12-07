package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.exceptions.DAOException;


public class RestaurantDAOImpl implements RestaurantDAO{
	
	/*public RestaurantDAOImpl(){
		daoRestaurant = new GenericDaoImpl<>();
	}*/
	
	public int add(Restaurant restaurant) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(restaurant);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du restaurant : " + e.getMessage());
		}
		em.close();
		return restaurant.getId();
	}
	
	public void update(Restaurant restaurant) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(restaurant);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du restaurant : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			Restaurant restaurantDelete;
			restaurantDelete = em.find(Restaurant.class, id);
			em.remove(restaurantDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de la delete du restaurant : " + e.getMessage());
		}
		em.close();
	}
	
	public List<Restaurant> findAll() throws DAOException {
		List<Restaurant> restaurants;
		try {
			String req = "Select Object(r) from Restaurant r";
			restaurants = DAOUtil.getEntityManager().createQuery(req, Restaurant.class).getResultList();
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la findAll du restaurant : " + e.getMessage());
		}		
		DAOUtil.getEntityManager().close();
		return restaurants;
	}
	
	public Restaurant selectById(int id) throws DAOException {
		Restaurant restaurant;
		try {
			restaurant = DAOUtil.getEntityManager().find(Restaurant.class, id);
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la selectById du restaurant : " + e.getMessage());
		}		
		DAOUtil.getEntityManager().close();
		return restaurant;			
	}
	
	/*public List<plates> selectPlates(Restaurant restaurant) {
		return DAOUtil.getEntityManager().			
	}*/
	
	
	
	

}
