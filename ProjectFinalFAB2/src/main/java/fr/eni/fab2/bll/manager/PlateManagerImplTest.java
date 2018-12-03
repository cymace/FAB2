package fr.eni.fab2.bll.manager;

import java.util.List;

import fr.eni.fab2.bean.Plate;

 class PlateManagerImplTest implements PlateManager {

	@Override
	public Plate  add(Plate plate) {
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
		List<Plate> plates = null;
		return plates;
	}

}
