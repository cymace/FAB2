package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Comment;

public interface CommentManager {
	
	public Comment add(Comment comment);
	
	public void delete(Comment comment);
	
	public Comment getById(int id);
	
	public void update(Comment comment);

	public List<Comment> getAll();
}
