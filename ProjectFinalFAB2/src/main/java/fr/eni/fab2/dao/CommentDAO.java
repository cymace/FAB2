package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.Comment;

public interface CommentDAO {
	
	public int add(Comment comment);
	
	public void update(Comment comment);
	
	public void delete(int id);
	
	public List<Comment> findAll();
	
	public Comment selectById(int id);

}
