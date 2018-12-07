package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.exceptions.DAOException;

public interface CommentDAO {
	
	public int add(Comment comment) throws DAOException;
	
	public void update(Comment comment) throws DAOException;
	
	public void delete(int id) throws DAOException;
	
	public List<Comment> findAll() throws DAOException;
	
	public Comment selectById(int id) throws DAOException;

}
