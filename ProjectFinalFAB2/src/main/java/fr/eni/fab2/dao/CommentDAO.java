package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Comment;

public interface CommentDAO {
	
	public void add(Comment comment);
	
	public void update(Comment comment);
	
	public void delete(Comment comment);
	
	public List<Comment> findAll();

}
