package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.exceptions.BLLException;

 class CommentManagerImplTest implements CommentManager {

	@Override
	public Comment add(Comment comment , int idUser) throws BLLException {
		
		comment = new Comment();
		comment.setId(1);
		comment.setUser(BllManagerFactory.getUserManager().getById(idUser));
		comment.setDateComment(LocalDateTime.now().withNano(0));
		
		System.out.println("add comment");
	
		
		
		return comment;
	}

	@Override
	public void delete(Comment comment) throws BLLException {
		System.out.println("delete comment");

	}

	@Override
	public Comment getById(int id) {
		System.out.println("getById comment");

		Comment comment = new Comment();
		comment.setId(id);
		comment.setText("coucou");
		return comment;
	}

	@Override
	public void update(Comment comment) throws BLLException {
		comment.setDateComment(LocalDateTime.now().withNano(0));
		System.out.println("update comment");
	}

	@Override
	public List<Comment> getAll() throws BLLException {
		System.out.println("getAll comment");
		List<Comment> comments = new ArrayList<>();
		comments.add(new Comment(LocalDateTime.now().withNano(0), 4, "test", null));
		return comments;
	}

}
