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
		
		
		
		/*Restaurant rest1 = new Restaurant("FAB_Rennes", "Rennes", 100);
		System.out.println("rest1: "+rest1.toString());
		System.out.println("name rest1: "+rest1.getName());
		System.out.println("Surname user1: "+user1.getSurname());*/
		
		//userDao.add(user1);
		
		//restDao.add(rest1);
		
		Restaurant restToDelete = new Restaurant();		
		restToDelete = restDao.selectById(4);
		System.out.println("deleting restaurant: "+restToDelete.toString());
		restDao.delete(restToDelete);
		
		/*Restaurant restToUpdate = new Restaurant();
		restToUpdate = restDao.selectById(3);
		restToUpdate.setAddresse("Nantes");
		restDao.update(restToUpdate);*/
		
		List<Restaurant> restaurants = restDao.findAll();
		
		for (Restaurant r:restaurants){
			System.out.println("/nRistorante:/n"+r.toString());
		}
	
		
		

		
		
		
	
}
}
