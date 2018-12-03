package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Order;

 class OrderManagerImplTest implements OrderManager {

	@Override
	public Order add(Order order) {

		return order;
	}

	@Override
	public void delete(Order order) {

	}

	@Override
	public Order getById(int id) {
		return new Order();
	}

	@Override
	public void update(Order order) {

	}

	@Override
	public List<Order> getAll() {
		List<Order> orders = null;
		return orders;
	}

}
