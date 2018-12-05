package fr.eni.fab2.bll.manager;



public abstract class BllManagerFactory {

	
	public static CommentManager getCommentManager()
	{
		return new CommentManagerImpl();
	}
	
	public static OrderManager getOrderManager()
	{
		return new OrderManagerImpl();
	}
	
	public static PlateManager getPlateManager()
	{
		return new PlateManagerImplTest();
	}
	
	public static ReservationManager getReservationManager()
	{
		return new ReservationManagerImpl();
	}
	
	public static RestaurantManager getRestaurantManager()
	{
		return new RestaurantManagerImpl();
	}
	
	public static UserManager getUserManager()
	{
		return new UserManagerImpl();
	}
	
}
