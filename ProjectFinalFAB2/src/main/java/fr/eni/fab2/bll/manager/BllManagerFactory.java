package fr.eni.fab2.bll.manager;



public abstract class BllManagerFactory {

	
	public static CommentManager getCommentManager()
	{
		return new CommentManagerImplTest();
	}
	
	public static OrderManager getOrderManager()
	{
		return new OrderManagerImplTest();
	}
	
	public static PlateManager getPlateManager()
	{
		return new PlateManagerImplTest();
	}
	
	public static ReservationManager getReservationManager()
	{
		return new ReservationManagerImplTest();
	}
	
	public static RestaurantManager getRestaurantManager()
	{
		return new RestaurantManagerImplTest();
	}
	
	public static UserManager getUserManager()
	{
		return new UserManagerImplTest();
	}
	
}
