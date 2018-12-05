package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.dao.CommentDAO;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.exceptions.BLLException;

class CommentManagerImpl implements CommentManager {

	CommentDAO commentDao = DaoFactory.getCommentDAO();

	@Override
	public Comment add(Comment comment, int idUser) throws BLLException {
		comment.setUser(BllManagerFactory.getUserManager().getById(idUser));
		comment.setDateComment(LocalDateTime.now().withNano(0));

		int id = commentDao.add(comment);

		return this.getById(id);
	}

	@Override
	public void delete(Comment comment) throws BLLException {
		commentDao.delete(comment.getId());
	}

	@Override
	public Comment getById(int id) throws BLLException {
		Comment comment = commentDao.selectById(id);
		return comment;
	}

	@Override
	public void update(Comment comment) throws BLLException {
		comment.setDateComment(LocalDateTime.now().withNano(0));
		commentDao.update(comment);
	}

	@Override
	public List<Comment> getAll() throws BLLException {
		 List<Comment> comments = commentDao.findAll();
		 return comments;
	}

}
