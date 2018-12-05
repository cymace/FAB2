import java.time.LocalDateTime;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.CommentDAOImpl;
import fr.eni.fab2.dao.UserDAOImpl;

public class test {

	public static void main(String[] args) {
		
		UserDAOImpl userDao = new UserDAOImpl();
		
		CommentDAOImpl commentDao = new CommentDAOImpl();
		
		//RestaurantDAOImpl restDao = new RestaurantDAOImpl();
		
		
		User user1 = new User ("Smith", "John", "065588", "mail", "password", false);
		User user2 = new User ("Macron", "Emmanuel", "03333", "mail@eliseo", "giletsjeune", false);
		
		LocalDateTime timeNow = LocalDateTime.now().withNano(0);
		System.out.println("timeNow: "+timeNow);
		Comment comm1 = new Comment(timeNow, 3, "good", user1);
		Comment comm2 = new Comment(timeNow, 1, "bleah", user2);
		
	
		int idUser1=userDao.add(user1);
		int idUser2=userDao.add(user2);
		
		int idComment1=commentDao.add(comm1);
		int idComment2=commentDao.add(comm2);
	
		System.out.println("idComment1: "+idComment1);
		System.out.println("idComment2: "+idComment2);
		System.out.println("idUser1: "+idUser1);
		System.out.println("idUser2: "+idUser2);
		
		
		

		
		User userFindByEmail = userDao.selectByEmail("mail@eliseo");
		
		System.out.println("\nUser find by email:\n"+userFindByEmail.toString());
		
		
		
		
	
		
		

		
		
		
	
}
}
