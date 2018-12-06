import java.time.LocalDateTime;
import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.CommentDAOImpl;
import fr.eni.fab2.dao.OrderDAOImpl;
import fr.eni.fab2.dao.PlateDAOImpl;
import fr.eni.fab2.dao.ReservationDAOImpl;
import fr.eni.fab2.dao.RestaurantDAOImpl;
import fr.eni.fab2.dao.UserDAOImpl;

public class test {
/*
	public static void main(String[] args) {
		
		LocalDateTime timeNow = LocalDateTime.now();
		
		//DAOImpl
		
		UserDAOImpl userDao = new UserDAOImpl();		
		CommentDAOImpl commentDao = new CommentDAOImpl();		
		RestaurantDAOImpl restDAO = new RestaurantDAOImpl();
		ReservationDAOImpl reservDAO = new ReservationDAOImpl();
		PlateDAOImpl plaDAO = new PlateDAOImpl();
		OrderDAOImpl ordDao = new OrderDAOImpl();
		
		
		
		//RestaurantDAOImpl restDao = new RestaurantDAOImpl();
		//DEFINITIONS
		
		
		
		/*User user1 = new User ("Smith", "John", "065588", "mail", "password", false);
		User user2 = new User ("Macron", "Emmanuel", "03333", "mail@eliseo", "giletsjeune", false);
		User user3 = new User ("Sampietro", "Emanuel", "0649008572", "manusamp", "grrr", false);*/
		
		
		
		/*Restaurant rest1 = new Restaurant ("FAB Rennes", "rennes", 100);
		Restaurant rest2 = new Restaurant ("FAB Nantes", "nantes", 200);
		Restaurant rest3 = new Restaurant ("FAB Brest", "brest", 350);
		
		//Plate pla1 = new Plate()
		
		
		Comment comm1 = new Comment(timeNow, 3, "good", user1);
		Comment comm2 = new Comment(timeNow, 1, "bleah", user2);
		
		Reservation res1 = new Reservation(timeNow, 6, user1);
		Reservation res2 = new Reservation(timeNow, 10, user3);
		
		
		
		Plate pla1 = new Plate("Bourghignon", "image1.jpg", 12.5f);
		Plate pla2 = new Plate("Escargot", "image2.jpg", 15.8f);
		Plate pla3 = new Plate("Huitres", "image3.jpg", 25.45f);
		
		plaDAO.add(pla1);
		plaDAO.add(pla2);
		plaDAO.add(pla3);
		
		
		
		
		User user1=userDao.selectById(1);
		User user2=userDao.selectById(2);
		User user3=userDao.selectById(3);
		
		Order ord1 = new Order(timeNow, user1);
		Order ord2 = new Order(timeNow, user2);
		
		int idOrd1 = ordDao.add(ord1);
		int idOrd2 = ordDao.add(ord2);
		
		System.out.println("idOrd2: "+idOrd2);
		
		
		
		Order ord2= ordDao.selectById(2);
		
		List<Plate> platesOrd = ord2.getPlates();
		
		if (platesOrd == null) {
			System.out.println("No plates in this order");
		}
		
		Plate pla1=plaDAO.selectById(1);
		
		platesOrd.add(pla1);
		
		ord2.setPlates(platesOrd);
		
		ordDao.update(ord2);
		
		
		
		Plate pla2=plaDAO.selectById(2);
		Plate pla3=plaDAO.selectById(3);
		
		Restaurant rist1 = restDAO.selectById(1);
		Restaurant rist3 = restDAO.selectById(3);
		
		List<Plate> platesRist1 = rist1.getPlates();
		List<Plate> platesRist3 = rist3.getPlates();
		
		platesRist1.add(pla2);
		platesRist1.add(pla3);
		platesRist3.add(pla3);
		
		rist1.setPlates(platesRist1);
		rist3.setPlates(platesRist3);
		
		restDAO.update(rist1);
		restDAO.update(rist3);
		
		*/
		
		Restaurant rist1 = restDAO.selectById(1);
		Restaurant rist3 = restDAO.selectById(3);
		
		List<Plate> platesRist1 = rist1.getPlates()
		List<Plate> platesRist3 = plaDAO.selectByRestaurant(rist3);
		
		for (Plate pl:platesRist1){
			System.out.println("\nplateRist "+rist1.getName()+": "+pl.toString());
		}
		
		
		
		for (Plate pl:platesRist3){
			System.out.println("\nplateRist "+rist3.getName()+": "+pl.toString());
		}
		
		
		
		
		
		
		//		ADDING
		
		/*userDao.add(user1);
		userDao.add(user2);
		userDao.add(user3);
		
		restDAO.add(rest1);
		restDAO.add(rest2);
		restDAO.add(rest3);*/
		
		//int idReserv1 = reservDAO.add(res1);
		//int idReserv2 = reservDAO.add(res2);
		
		//System.out.println("idReserv1: "+idReserv1);
		
		/*int idComment1=commentDao.add(comm1);
		int idComment2=commentDao.add(comm2);*/
	
		/*System.out.println("idComment1: "+idComment1);
		System.out.println("idComment2: "+idComment2);*/
		
		

		
		User userFindByEmail = userDao.selectByEmail("manusamp");
		
		System.out.println("\nUser find by email:\n"+userFindByEmail.toString());
		
		
		
		
	
		
		
		
		
	
		
		

		
		
		
	
}*/
}
