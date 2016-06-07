package org.hao.action;

import java.util.List;

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
		if(udao.usersLogin(user) > 0) {
			session.setAttribute("loginUser", udao.queryUsersByUid(udao.usersLogin(user)));
			return "login_success";
		}
		else {
			return "login_failure";
		}
	}
	
	public String preEnroll() {
		
		return "preEnroll_success";
	}
	
	public String enroll() {
		
		UsersDAO udao = new UsersDAOImpl();
		if (user.getUsername()==null || user.getPassword()==null || "".equals(user.getUsername()) || "".equals(user.getPassword())) {
			return "enroll_failure";
		}
		if(udao.usersLogin(user) == -1){
			
			udao.addUser(user);
			session.setAttribute("loginUser", udao.queryUsersByUid(udao.usersLogin(user)));
			return "enroll_success";
		}
		else{
			
			return "enroll_failure";
		}
	}
	
	public String list() {
		UsersDAO udao = new UsersDAOImpl();
		List<Users> usersList = udao.listUsers();
		if(usersList != null && !"".equals(usersList)){
			session.setAttribute("usersList", usersList);
			return "list_success";
		}else {
			return "list_failure";
		}
	}
	
	public String preAdd() {
		
		return "preAdd_success";
	}
	
	public String add() {
		UsersDAO udao = new UsersDAOImpl();
		Users u = new Users();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setEmail(request.getParameter("email"));
		u.setRole(request.getParameter("role"));
		u.setStutas(request.getParameter("stutas"));
		udao.addUser(u);
		
		return "add_success";
	}
	
	public String delete() {
		
		UsersDAO udao = new UsersDAOImpl();
		int uid = Integer.parseInt(request.getParameter("uid"));
		udao.deleteUser(uid);
		
		return "delete_success";
	}
	
	public String preUpdate() {
		
		UsersDAO udao = new UsersDAOImpl();
		int uid = Integer.parseInt(request.getParameter("uid"));
		Users u = udao.queryUsersByUid(uid);
		session.setAttribute("updateUser", u);
		
		return "preUpdate_success";
	}
	
	public String update() {
		
		UsersDAO udao = new UsersDAOImpl();
		Users u = new Users();
		u.setUid(Integer.parseInt(request.getParameter("uid")));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setEmail(request.getParameter("email"));
		u.setRole(request.getParameter("role"));
		u.setStutas(request.getParameter("stutas"));
		udao.updateUser(u);
		
		return "update_success";
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
		if(session.getAttribute("loginUser") != null){
			session.invalidate();
		}
		return "logout_success";
	}
	
	public Users getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
}
