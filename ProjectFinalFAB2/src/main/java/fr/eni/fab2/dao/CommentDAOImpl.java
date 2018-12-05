package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.User;

public class CommentDAOImpl implements CommentDAO{
	
	public int add(Comment comment) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
			//throw new DAOException("Erreur lors de l'ajout du comment " + comment + " : " + e.getMessage());
		}
		return comment.getId();
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
	
	public void delete(int id) {
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			Comment commentDelete;
			commentDelete = em.find(Comment.class, id);
			em.remove(commentDelete);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		}
	}
	
	public List<Comment> findAll() {
		String req = "Select Object(c) from Comment c";
		return DAOUtil.getEntityManager().createQuery(req, Comment.class).getResultList();
	}
	
	public Comment selectById(int id) {
		return DAOUtil.getEntityManager().find(Comment.class, id);
			
	}

}
