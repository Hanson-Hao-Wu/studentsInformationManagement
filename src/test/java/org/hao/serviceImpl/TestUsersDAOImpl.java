package org.hao.serviceImpl;

import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hao.service.impl.UsersDAOImpl;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class TestUsersDAOImpl {

	@Test
	@Ignore
	public void testUsersLoginSuccess() {
		
		Users u = new Users(1,"wuhao","123",null,null,null);
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Assert.assertEquals("usersDAOImpl.usersLogin", true, usersDAOImpl.usersLogin(u));
	}
	
	@Ignore
	@Test
	public void testUsersLoginFail() {
		
		Users u = new Users(1,"xiechen","123456",null,null,null);
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Assert.assertEquals("usersDAOImpl.usersLogin", false, usersDAOImpl.usersLogin(u));
	}
	
	@Test
	@Ignore
	public void testAddUsers() {
		
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		usersDAOImpl.addUser(new Users("quxia", "123", "quxia@gmail.com", "admin", "active"));
		
	}
	
	@Test
	@Ignore
	public void testUpdateUser() {
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Users u = usersDAOImpl.queryUsersByUid(1);
		u.setRole("admin");
		u.setStutas("active");
		usersDAOImpl.updateUser(u);
	}
	
	@Test
	@Ignore
	public void testQueryUsersByUid() {
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Users u = usersDAOImpl.queryUsersByUid(1);
		System.out.println(u);
	}
	
	@Test
	public void testDeleteUser(){
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		usersDAOImpl.deleteUser(5);
	}
	
	

}
