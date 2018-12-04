package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.DAOException;

public class UserDAOImpl implements UserDAO{
	
	public void add(User user) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(user);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du user " + user + " : " + e.getMessage());
		}
	}
	
	public void update(User user) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(user);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du user " + user + " : " + e.getMessage());
		}
	}
	
	public void delete(int id) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			User userDelete;
			userDelete = em.find(User.class, id);
			em.remove(userDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
	}
	
	public List<User> findAll() {
		String req = "Select Object(u) from User u";
		return DAOUtil.getEntityManager().createQuery(req, User.class).getResultList();
	}
	
	public User selectById(int id) {
		return DAOUtil.getEntityManager().find(User.class, id);
			
	}

}
