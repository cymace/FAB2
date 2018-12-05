import java.util.List;

import fr.eni.fab2.bean.Comment;
import fr.eni.fab2.bean.Restaurant;
import fr.eni.fab2.bean.User;
import fr.eni.fab2.dao.CommentDAOImpl;
import fr.eni.fab2.dao.RestaurantDAOImpl;
import fr.eni.fab2.dao.UserDAOImpl;

public class Clean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAOImpl userDao = new UserDAOImpl();
		
		CommentDAOImpl commentDao = new CommentDAOImpl();
		
		RestaurantDAOImpl restDAO = new RestaurantDAOImpl();
		
		List<User> users = userDao.findAll();
			
		List<Comment> comments = commentDao.findAll();
		
		List<Restaurant> restaurants = restDAO.findAll();
		
		

		
		for (Comment c:comments){
			commentDao.delete(c.getId());
		}
		
		for (User u:users){
			userDao.delete(u.getId());
		}
		
		for (Restaurant r:restaurants){
			restDAO.delete(r.getId());
		}

	}

}
