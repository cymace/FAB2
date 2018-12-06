package fr.eni.fab2.bll.manager;

import java.util.ArrayList;
import java.util.List;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.dao.DaoFactory;
import fr.eni.fab2.dao.PlateDAO;
import fr.eni.fab2.exceptions.BLLException;

public class PlateManagerImpl implements PlateManager {

	PlateDAO plateDao = DaoFactory.getPlateDAO();

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

		try {
			int idplate = plateDao.add(plate);
			plate = this.getById(idplate);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
		plates.add(plate);
		restaurant.setPlates(plates);
		restaurantManager.update(restaurant);

		return plate;
	}

	@Override
	public void delete(Plate plate) throws BLLException {
		try {
			plateDao.delete(plate.getId());
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public Plate getById(int id) throws BLLException {
		// Plate plate = plateDao.findbyId(id)
		return null;
	}

	@Override
	public void update(Plate plate) throws BLLException {
		try {
			plateDao.update(plate);
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		
	}

	@Override
	public List<Plate> getAll() throws BLLException {
		List<Plate> plates;
		try {
			plates = plateDao.findAll();
		} catch (Exception e) {
		throw new BLLException(e.getMessage());
		}
		return plates;
	}

	@Override
	public List<Plate> getByRestaurant(Restaurant restaurant) throws BLLException {
		//List<Plate> plates = plateDao.findByRestaurant(restaurant);
		return null;
	}

}
