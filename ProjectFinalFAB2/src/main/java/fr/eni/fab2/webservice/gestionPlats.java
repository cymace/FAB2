package fr.eni.fab2.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import fr.eni.fab2.bean.Plate;
import fr.eni.fab2.bll.manager.BllManagerFactory;
import fr.eni.fab2.bll.manager.PlateManager;

@Path("/plats")
public class gestionPlats {
	
	private PlateManager platManager = BllManagerFactory.getPlateManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Plate> getplats(@Context final HttpServletResponse response)  {
				
		List<Plate> plates=new ArrayList<>();
		
		plates.add(new Plate("test", "fdgd", 120, null, null));
		
		//plates = platManager.getAll();
		
		return plates;
		
	}


}
