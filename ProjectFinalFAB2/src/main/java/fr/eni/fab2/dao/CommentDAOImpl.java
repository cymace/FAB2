package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Comment;

public class CommentDAOImpl implements CommentDAO{
	
	public void add(Comment comment) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'ajout du comment " + comment + " : " + e.getMessage());
		}
	}
	
	public void update(Comment comment) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de l'update du comment " + comment + " : " + e.getMessage());
		}
	}
	
	public void delete(Comment comment) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.remove(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			//throw new DAOException("Erreur lors de la delete du comment " + comment + " : " + e.getMessage());
		}
	}
	
	public List<Comment> findAll() {
		String req = "Select Object(c) from Comment c";
		return DAOUtil.getEntityManager().createQuery(req, Comment.class).getResultList();
	}

}
