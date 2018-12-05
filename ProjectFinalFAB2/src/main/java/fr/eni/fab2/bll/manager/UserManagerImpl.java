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
		int id = userDAO.add(user);
		user = this.getById(id);

		return user;
	}

	@Override
	public void delete(User user) throws BLLException {
		userDAO.delete(user.getId());
	}

	@Override
	public User getById(int id) throws BLLException {
		User user = userDAO.selectById(id);
		return user;
	}

	@Override
	public void update(User user) throws BLLException {
		userDAO.update(user);
	}

	@Override
	public List<User> getAll() throws BLLException {
		List<User> users = userDAO.findAll();
		return users;
	}

	@Override
	public User getByEmail(String email) throws BLLException {
		User user = userDAO.selectByEmail(email);
		return user;
	}

}
