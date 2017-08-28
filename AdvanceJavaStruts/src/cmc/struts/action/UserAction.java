package cmc.struts.action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cmc.struts.bus.UserBUS;
import cmc.struts.model.User;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String password;
	private User user;
	private List<User> listUser;
	private String error_login;

	public String Login() throws ClassNotFoundException, SQLException {
		UserBUS userBUS = new UserBUS();
		if(userBUS.isLoginSuccess(userName, password)) {
			user = userBUS.Login(userName, password);
			if(user.getAccess() == 1) {
				return "admin";
			}else {
				return "user";
			}
		}else {
			error_login = "UserName or Password is wroong!";
			return "error";
		}
	}

	public String getAllUser() throws SQLException,ClassNotFoundException{
		UserBUS  userBUS = new UserBUS();
		listUser = userBUS.getAllUser();
		return "success";
	}
	public String getUserById() throws SQLException, ClassNotFoundException {
		UserBUS userBUS = new UserBUS();
		user = userBUS.getUserById(userId);
		return "success";
	}
	public String insertUser() throws SQLException, ClassNotFoundException {
		UserBUS userBUS = new UserBUS();
		userBUS.insertUser(user);
		return "success";
	}
	public String editUser() throws SQLException, ClassNotFoundException {
		UserBUS userBUS = new UserBUS();
		userBUS.editUser(userId, user);
		return "success";
	}
	
	public String deleteUser() throws SQLException, ClassNotFoundException{
		UserBUS userBUS = new UserBUS();
		userBUS.deleteUser(userId);
		return "success";
	}
	
	
	public String getError_login() {
		return error_login;
	}

	public void setError_login(String error_login) {
		this.error_login = error_login;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
