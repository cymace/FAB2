package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
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
		
		return new User("gobron", "fabien", "07.78.76.28.35", "fabiengobron@outlook.com", "password", true);
	}

	@Override
	public void update(User user)throws BLLException {
		
	}

	@Override
	public List<User> getAll()throws BLLException {
		 List<User>	users= new ArrayList<>();
		 users.add(new User("gobron", "fabien", "07.78.76.28.35", "fabiengobron@outlook.com", "password", true));
		 users.add(new User("nom", "prenom", "3630", "fabien.gobron@campus-eni.fr", "mdp", false));

		 return users;
	}

	@Override
	public User getByEmail(String email) throws BLLException {

		return new User("nom", "prenom", "3630", email, "mdp", false);
	}

}
