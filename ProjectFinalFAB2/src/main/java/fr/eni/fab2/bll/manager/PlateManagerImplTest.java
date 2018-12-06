package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.exceptions.BLLException;

class PlateManagerImplTest implements PlateManager {

	@Override
	public Plate add(Plate plate, int id) throws BLLException {

		RestaurantManager restaurantManager = BllManagerFactory.getRestaurantManager();
		Restaurant restaurant = restaurantManager.getById(id);
		List<Restaurant> restaurants;
		List<Plate> plates;
		
		if (restaurant.getPlates() == null) {
			restaurants = new ArrayList<>();
		} else {
			restaurants = plate.getRestaurants();
		}
		
		if (plate.getRestaurants() == null) {
			plates = new ArrayList<>();
		} else {
			plates = restaurant.getPlates();
		}
		
		restaurants.add(restaurant);
		plate.setRestaurants(restaurants);

		System.out.println("add plate"); // ajout a la BDD
		
		plates.add(plate);
		restaurant.setPlates(plates);
		restaurantManager.update(restaurant);

		return this.getById(2);
	}

	@Override
	public void delete(Plate plate) throws BLLException {
		System.out.println("supprimer plate");
	}

	@Override
	public Plate getById(int id) throws BLLException {
		System.out.println("getById plate");
		return new Plate();
	}

	@Override
	public void update(Plate plate) throws BLLException {
		System.out.println("update plate");

	}

	@Override
	public List<Plate> getAll() throws BLLException {
		System.out.println("get all plate");
		LocalDateTime time = LocalDateTime.now();
		List<Plate> plates = new ArrayList<>();
		List<Comment> comments = new ArrayList<>();
		List<Order> orders = new ArrayList<>();
		List<Restaurant> restaurants = new ArrayList<>();

		User user = new User("gobron", "fabien", "07.78.76.28.35", "fabiengobron@outlook.com", "password", true);
		Comment comment = new Comment(time, 5, "commentaire", user);
		comments.add(comment);
		comments.add(comment);

		Order order = new Order(time, user);
		orders.add(order);
		orders.add(order);

		Restaurant restaurant = new Restaurant("FAB Renne", "8 rue leo lagrange", 150, null, null);
		restaurants.add(restaurant);
		restaurants.add(restaurant);

		Plate plate = new Plate("boeuf", "https://images-na.ssl-images-amazon.com/images/I/81exZO5XR6L.jpg", 50,
				comments, restaurants, null);
		plates.add(plate);
		plates.add(plate);
		plates.add(plate);
		return plates;
	}

	@Override
	public List<Plate> getByRestaurant(Restaurant restaurant) throws BLLException {
		List<Plate> plates = new ArrayList<>();
		// plates.add(new Plate("boeuf", "http:\\monurl", 10, "mon
		// commentaire",new Restaurant() , new Order()));
		System.out.println("getPlatesByRestaurant");
		return plates;
	}

	@Override
	public List<Plate> getByOrder(Order order) throws BLLException {
		// TODO Auto-generated method stub
		return null;
	}

}
