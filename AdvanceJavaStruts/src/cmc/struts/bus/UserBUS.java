package cmc.struts.bus;

import java.sql.SQLException;
import java.util.List;

import cmc.struts.dao.UserDao;
import cmc.struts.model.User;

public class UserBUS {
	public User Login(String username, String password)
			throws ClassNotFoundException, SQLException {
		UserDao userDao = new UserDao();
		return userDao.Login(username, password);
	}

	public boolean isLoginSuccess(String username, String password)
			throws ClassNotFoundException, SQLException {
		UserDao userDao = new UserDao();
		return userDao.isLoginSuccess(username, password);
	}
	public List<User> getAllUser() throws SQLException,ClassNotFoundException{
		UserDao userDao = new UserDao();
		return userDao.getAllUser();
	}
	public User getUserById(int id) throws SQLException, ClassNotFoundException {
		UserDao userDao = new UserDao();
		return userDao.getUserById(id);
	}
	public boolean insertUser(User user) throws SQLException, ClassNotFoundException {
		UserDao userDao = new UserDao();
		return userDao.insertUser(user);
	}
	public boolean editUser(int userId, User user) throws SQLException, ClassNotFoundException {
		UserDao userDao = new UserDao();
		return userDao.editUser(userId, user);
	}
	
	public boolean deleteUser(int userId) throws SQLException, ClassNotFoundException{
		UserDao userDao = new UserDao();
		return userDao.deleteUser(userId);
	}
}
