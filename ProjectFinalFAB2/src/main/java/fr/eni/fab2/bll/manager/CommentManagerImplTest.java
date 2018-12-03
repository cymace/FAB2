package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Comment;

 class CommentManagerImplTest implements CommentManager {

	@Override
	public Comment add(Comment comment) {
		comment.setId(1);
		return comment;
	}

	@Override
	public void delete(Comment comment) {

	}

	@Override
	public Comment getById(int id) {
		Comment comment = new Comment();
		comment.setId(id);
		comment.setText("coucou");
		return comment;
	}

	@Override
	public void update(Comment comment) {

	}

	@Override
	public List<Comment> getAll() {
		List<Comment> comments = null;
		return comments;
	}

}
