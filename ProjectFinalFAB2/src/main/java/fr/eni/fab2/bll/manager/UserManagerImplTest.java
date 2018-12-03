package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.User;

 class UserManagerImplTest implements UserManager {

	@Override
	public User add(User user) {
		return user;
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public User getById(int id) {
		return new User();
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public List<User> getAll() {
		 List<User>	users=null;
		return users;
	}

}
