package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.User;

public interface UserManager {

	
	 public User add(User user);
		
		public void delete(User user);
		
		public User getById(int id);
		
		public void update(User user);

		public List<User> getAll();
}
