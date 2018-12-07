package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.UserDAO;
import fr.eni.fab2.exceptions.BLLException;

public class UserManagerImpl implements UserManager {
	UserDAO userDAO = DaoFactory.getUserDAO();

	@Override
	public User add(User user) throws BLLException {
		try {
			int id = userDAO.add(user);
			user = this.getById(id);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
		return user;
	}

	@Override
	public void delete(User user) throws BLLException {
		try {
			userDAO.delete(user.getId());
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public User getById(int id) throws BLLException {
		User user;
		try {
			user = userDAO.selectById(id);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
	return user;
	}

	@Override
	public void update(User user) throws BLLException {
		try {
			userDAO.update(user);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}

	}

	@Override
	public List<User> getAll() throws BLLException {
		List<User> users;
		try {
			users = userDAO.findAll();
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		} 
		return users;
	}

	@Override
	public User getByEmail(String email) throws BLLException {
		User user;
		try {
			user = userDAO.selectByEmail(email);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		} 
		return user;
	}

}
