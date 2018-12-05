package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.exceptions.BLLException;

public interface CommentManager {
	
	public Comment add(Comment comment, int idUser) throws BLLException;
	
	public void delete(Comment comment)  throws BLLException;
	
	public Comment getById(int id)  throws BLLException;
	
	public void update(Comment comment)  throws BLLException;

	public List<Comment> getAll() throws BLLException;
}
