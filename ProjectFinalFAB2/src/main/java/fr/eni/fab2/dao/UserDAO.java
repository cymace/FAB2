package fr.eni.fab2.dao;

import java.util.List;

import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.DAOException;

public interface UserDAO {
	
	public int add(User user) throws DAOException;
	
	public void update(User user) throws DAOException;
	
	public void delete(int id) throws DAOException;
	
	public List<User> findAll() throws DAOException;
	
	public User selectById(int id) throws DAOException;
	
	public User selectByEmail(String email) throws DAOException;

}
