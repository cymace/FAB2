package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.BLLException;

 class UserManagerImplTest implements UserManager {

	@Override
	public User add(User user)throws BLLException {
		return user;
	}

	@Override
	public void delete(User user)throws BLLException {
		
	}

	@Override
	public User getById(int id)throws BLLException {
		return new User();
	}

	@Override
	public void update(User user)throws BLLException {
		
	}

	@Override
	public List<User> getAll()throws BLLException {
		 List<User>	users=null;
		return users;
	}

}
