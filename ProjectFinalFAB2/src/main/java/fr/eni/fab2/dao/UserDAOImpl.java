package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.DAOException;

public class UserDAOImpl implements UserDAO{
	
	public int add(User user) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(user);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du user : " + e.getMessage());
		}
		em.close();
		return user.getId();
	}
	
	public void update(User user) throws DAOException {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(user);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du user : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException {
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
			throw new DAOException("Erreur lors de la delete du user : " + e.getMessage());
		}
		em.close();
	}
	
	public List<User> findAll() throws DAOException {
		List<User> users;
		try {
			String req = "Select Object(u) from User u";
			users = DAOUtil.getEntityManager().createQuery(req, User.class).getResultList();
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la findAll du user : " + e.getMessage());
		} 
		DAOUtil.getEntityManager().close();
		return users;
	}
	
	public User selectById(int id) throws DAOException {
		User user;
		try {
			user = DAOUtil.getEntityManager().find(User.class, id);
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la selectById du user : " + e.getMessage());
		}		
		DAOUtil.getEntityManager().close();
		return user;
		
	}
	
	public User selectByEmail(String email) throws DAOException {
		User user;
		try {
			String req = "Select Object(u) from User u WHERE u.mail LIKE :mail";
			user = DAOUtil.getEntityManager().createQuery(req, User.class).setParameter("mail", "%" + email + "%").getSingleResult();
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la selectByEmail du user : " + e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return user;
			
	}

}
