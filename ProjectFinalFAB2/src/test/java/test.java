import java.util.List;

import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.dao.RestaurantDAOImpl;

public class test {

	public static void main(String[] args) {
		
		RestaurantDAOImpl RestDao;
		
		List<Reservation> reservations1=null;
		List<Order> orders1=null;
		List<Plate> plates1=null;
		
		List<Reservation> reservations2;
		List<Order> orders2;
		List<Plate> plates2;
		
		Restaurant rest1 = new Restaurant("FAB_Rennes", "Rennes", 100, reservations1, orders1, plates1);
		
		
	
}
}
