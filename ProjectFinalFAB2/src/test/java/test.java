import java.util.List;

import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.RestaurantDAOImpl;
import fr.eni.fab2.dao.UserDAOImpl;

public class test {

	public static void main(String[] args) {
		
		UserDAOImpl userDao = new UserDAOImpl();
		
		RestaurantDAOImpl restDao = new RestaurantDAOImpl();
		
		
		User user1 = new User ("Smith", "John", "065588", "mail", "password", false);
		User user2 = new User ("Macron", "Emmanuel", "03333", "mail@eliseo", "giletsjeune", false);
		
		
		
		/*Restaurant rest1 = new Restaurant("FAB_Rennes", "Rennes", 100);
		System.out.println("rest1: "+rest1.toString());
		System.out.println("name rest1: "+rest1.getName());
		System.out.println("Surname user1: "+user1.getSurname());*/
		
		userDao.add(user2);
		
		//restDao.add(rest1);
		
		/*Restaurant restToDelete = new Restaurant();		
		restToDelete = restDao.selectById(4);
		System.out.println("deleting restaurant: "+restToDelete.toString());
		restDao.delete(restToDelete);*/
		
		/*Restaurant restToUpdate = new Restaurant();
		restToUpdate = restDao.selectById(3);
		restToUpdate.setAddresse("Nantes");
		restDao.update(restToUpdate);*/
		
		List<Restaurant> restaurants = restDao.findAll();
		
		for (Restaurant r:restaurants){
			System.out.println("/nRistorante:/n"+r.toString());
		}
		
		restDao.delete(4);
		
		//OrderDAOImpl ord1 =new OrderDAOImpl(valueOf(2007-12-03T10:15:30), user1)
		
		List<User> users = userDao.findAll();
		for (User u:users){
			System.out.println("/nUser:/n"+u.toString());
		}
		
		
		userDao.delete(user2.getId());
		
		users = userDao.findAll();
		
		for (User u:users){
			System.out.println("/nUser:/n"+u.toString());
		}
		
		
	
		
		

		
		
		
	
}
}
