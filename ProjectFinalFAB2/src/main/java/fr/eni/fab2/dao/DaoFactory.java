package fr.eni.fab2.dao;



public abstract class DaoFactory {

	
	public static CommentDAO getCommentDAO()
	{
		return new CommentDAOImpl();
	}

	
	public static OrderDAO getOrderDAO()
	{
		return new OrderDAOImpl();
	}
	
	public static PlateDAO getPlateDAO()
	{
		return new PlateDAOImpl();
	}
	
	public static ReservationDAO getReservationDAO()
	{
		return new ReservationDAOImpl();
	}
	
	public static RestaurantDAO getRestaurantDAO()
	{
		return new RestaurantDAOImpl();
	}
	
	public static UserDAO getUserDAO()
	{
		return new UserDAOImpl();
	}
}
