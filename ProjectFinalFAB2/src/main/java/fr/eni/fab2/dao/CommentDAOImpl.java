package fr.eni.fab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.exceptions.DAOException;

public class CommentDAOImpl implements CommentDAO{
	
	public int add(Comment comment) throws DAOException{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.persist(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'ajout du comment : " + e.getMessage());
		}
		em.close();
		return comment.getId();
	}
	
	public void update(Comment comment) throws DAOException{
		EntityManager em = DAOUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		try {
			em.merge(comment);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw new DAOException("Erreur lors de l'update du comment : " + e.getMessage());
		}
		em.close();
	}
	
	public void delete(int id) throws DAOException{
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
			throw new DAOException("Erreur lors de la delete du comment : "+ e.getMessage());
		}
		
		em.close();
	}
	
	public List<Comment> findAll() throws DAOException{
		List<Comment> comments;
		try {
			
			String req = "Select Object(c) from Comment c";
			comments = DAOUtil.getEntityManager().createQuery(req, Comment.class).getResultList();
		} catch (Exception e) {
			throw new DAOException("Erreur lors de la find all comments : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return comments;
	}
	
	public Comment selectById(int id) throws DAOException{
		Comment comment;
		try {
			comment = DAOUtil.getEntityManager().find(Comment.class, id);
		} catch (Exception e) {
		throw new DAOException("Erreur lors de la selectById comments : "+ e.getMessage());
		}
		DAOUtil.getEntityManager().close();
		return comment;		
	}

}
