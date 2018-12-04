package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Order;

public class OrderDAOImpl implements OrderDAO{
	
	public void add(Order order) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(order);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du order " + order + " : " + e.getMessage());
		}
	}
	
	public void update(Order order) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(order);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du order " + order + " : " + e.getMessage());
		}
	}
	
	public void delete(Order order) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.remove(order);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de la delete du order " + order + " : " + e.getMessage());
		}
	}
	
	public List<Order> findAll() {
		String req = "Select Object(o) from Order o";
		return DAOUtil.getEntityManager().createQuery(req, Order.class).getResultList();
	}

}
