package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.User;

public class OrderDAOImpl implements OrderDAO{
	
	public int add(Order order) {
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
		return order.getId();
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
	
	public void delete(int id) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			Order orderDelete;
			orderDelete = em.find(Order.class, id);
			em.remove(orderDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
	}
	
	public List<Order> findAll() {
		String req = "Select Object(o) from Order o";
		return DAOUtil.getEntityManager().createQuery(req, Order.class).getResultList();
	}
	
	public Order selectById(int id) {
		return DAOUtil.getEntityManager().find(Order.class, id);
			
	}

}
