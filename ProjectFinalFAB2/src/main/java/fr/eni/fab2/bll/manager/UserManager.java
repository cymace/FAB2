package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.BLLException;

public interface UserManager {

	
	 public User add(User user) throws BLLException;
		
		public void delete(User user) throws BLLException;
		
		public User getById(int id) throws BLLException;
		
		public void update(User user) throws BLLException;

		public List<User> getAll() throws BLLException;
}
