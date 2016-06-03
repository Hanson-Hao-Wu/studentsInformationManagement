package org.hao.action;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hao.service.impl.UsersDAOImpl;

import com.opensymphony.xwork2.ModelDriven;

public class UsersAction extends SuperAction implements ModelDriven<Users>{

	private static final long serialVersionUID = 1L;
	private Users user = new Users();
	
	public String login() {
		UsersDAO udao = new UsersDAOImpl();
		if(udao.usersLogin(user)) {
			session.setAttribute("loginUserName", user.getUsername());
			return "login_success";
		}
		else {
			return "login_failure";
		}
	}
	
	@Override
	public void validate() {
		/*if( user.getUsername() == null || "".equals(user.getUsername().trim())) {
			this.addFieldError("usernameError", "Username can not be empty");
		}
		if(user.getPassword().length() < 3) {
			this.addFieldError("passwordError", "Password must longer than 3");
		}*/
	}
	
	@SkipValidation
	public String logout() {
		if(session.getAttribute("loginUserName") != null){
			session.removeAttribute("loginUserName");
		}
		return "logout_success";
	}
	
	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
}
