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
		int id ;
		try {
			 id = commentDao.add(comment);
				} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}		
		return this.getById(id);
	}

	@Override
	public void delete(Comment comment) throws BLLException {
		try {
			commentDao.delete(comment.getId());
		} catch (Exception e) {
			throw new BLLException(e.getMessage());
			}		
	}

	@Override
	public Comment getById(int id) throws BLLException {
		Comment comment;
		try {
			comment = commentDao.selectById(id);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
		return comment;		
	}

	@Override
	public void update(Comment comment) throws BLLException {
		comment.setDateComment(LocalDateTime.now().withNano(0));
		try {
			commentDao.update(comment);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}		
	}

	@Override
	public List<Comment> getAll() throws BLLException {
		List<Comment> comments;
		try {
			comments = commentDao.findAll();
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		return comments;
	}

}
