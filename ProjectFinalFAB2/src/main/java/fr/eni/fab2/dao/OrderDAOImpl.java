package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.exceptions.DAOException;

public class OrderDAOImpl implements OrderDAO{
	
	public int add(Order order) throws DAOException{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(order);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du order : " + e.getMessage());
		}
		em.close();
		return order.getId();
	}
	
	public void update(Order order) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(order);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du order : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException {
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
			throw new DAOException("Erreur lors de la delete du order : " + e.getMessage());
		}
		em.close();
	}
	
	public List<Order> findAll() throws DAOException {
		List<Order> orders;
		try {
			String req = "Select Object(o) from Order o";
			orders = DAOUtil.getEntityManager().createQuery(req, Order.class).getResultList();			
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find all orders : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return orders;
	}
	
	public Order selectById(int id) throws DAOException {
		Order order;
		try {
			order = DAOUtil.getEntityManager().find(Order.class, id);
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find all orders : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return order;
	}
	
	public List<Plate> getPlatesForOrder(Order order) throws DAOException {
		List<Plate> plates;
		try {
			
			plates = order.getPlates();
			/*int idOrder = order.getId();
			List<Integer> listeIdPlates = new ArrayList<>();
			
						
			String req = "select pl.id from order_db o NATURAL JOIN plate_order_db po NATURAL JOIN plate pl WHERE o.id= :idDone";
			listeIdPlates = DAOUtil.getEntityManager().createQuery(req, Order.class).getResultList().setParameter("idDone", idOrder);
			*/
		} catch (Exception e) {
		throw new DAOException("Erreur lors de la find all plates for order : "+ e.getMessage());
		}
		return plates;
	} 

}
