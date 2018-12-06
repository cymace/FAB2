import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.CommentDAOImpl;
import fr.eni.fab2.dao.OrderDAOImpl;
import fr.eni.fab2.dao.PlateDAO;
import fr.eni.fab2.dao.PlateDAOImpl;
import fr.eni.fab2.dao.ReservationDAOImpl;
import fr.eni.fab2.dao.RestaurantDAOImpl;
import fr.eni.fab2.dao.UserDAOImpl;
import groovy.ui.SystemOutputInterceptor;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime timeNow = LocalDateTime.now();
		
		//DAOImpl
		
		UserDAOImpl userDao = new UserDAOImpl();		
		CommentDAOImpl commentDao = new CommentDAOImpl();		
		RestaurantDAOImpl restDAO = new RestaurantDAOImpl();
		ReservationDAOImpl reservDAO = new ReservationDAOImpl();
		PlateDAOImpl plaDAO = new PlateDAOImpl();
		OrderDAOImpl ordDao = new OrderDAOImpl();
		
		
		List<Order> orders = new ArrayList<>();
		try {
			/*orders = ordDao.findAll();
			
			for (Order o:orders){
				ordDao.delete(o.getId());
			}
			
			Restaurant rist1 = restDAO.selectById(1);
			Restaurant rist3 = restDAO.selectById(3);
			
			User user1 = userDao.selectById(1);
			User user2 = userDao.selectById(2);
			
			List<Plate> plates = plaDAO.findAll();
			
			List<Plate> platesRist1 = rist1.getPlates();
			
			for (Plate p: platesRist1) {
				System.out.println("/nPlate: "+p.getName());
			}
			
			
			
			
			Order ord1 = new Order(timeNow, user1, plates, rist1);
			Order ord2 = new Order(timeNow, user2, plates, rist3);
			
			ordDao.add(ord1);
			ordDao.add(ord2);*/
			
			List<Reservation> res = reservDAO.findAll();
			
			for (Reservation r:res){
				System.out.println("\nreservation: "+r.toString());
			}
			
			/*List<Order> ors = ordDao.findAll();
			
			for (Order o:ors){
				System.out.println("\norder: "+o.toString());
			}*/
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
		

	}

}
