package fr.eni.fab2.bll.manager;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.Order;
import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Reservation;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;

class PlateManagerImplTest implements PlateManager {

	@Override
	public Plate add(Plate plate) {
		return new Plate();
	}

	@Override
	public void delete(Plate plate) {

	}

	@Override
	public Plate getById(int id) {
		return new Plate();
	}

	@Override
	public void update(Plate plate) {

	}

	@Override
	public List<Plate> getAll() {
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

		Plate plate = new Plate("boeuf", "http\\monurl", 50, comments, restaurants, null);
		plates.add(plate);
		plates.add(plate);
		plates.add(plate);
		return plates;
	}

	@Override
	public List<Plate> getByRestaurants(Restaurant restaurant) {
		List<Plate> plates = new ArrayList<>();
		// plates.add(new Plate("boeuf", "http:\\monurl", 10, "mon
		// commentaire",new Restaurant() , new Order()));
		return plates;
	}

}
