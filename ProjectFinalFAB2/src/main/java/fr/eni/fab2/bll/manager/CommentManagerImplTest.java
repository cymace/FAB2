package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.exceptions.BLLException;

 class CommentManagerImplTest implements CommentManager {

	@Override
	public Comment add(Comment comment) throws BLLException {
		comment.setId(1);
		return comment;
	}

	@Override
	public void delete(Comment comment) throws BLLException {

	}

	@Override
	public Comment getById(int id) {
		Comment comment = new Comment();
		comment.setId(id);
		comment.setText("coucou");
		return comment;
	}

	@Override
	public void update(Comment comment) throws BLLException {

	}

	@Override
	public List<Comment> getAll() throws BLLException {
		List<Comment> comments = null;
		return comments;
	}

}
