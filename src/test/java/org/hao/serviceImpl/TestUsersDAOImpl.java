package org.hao.serviceImpl;

import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hao.service.impl.UsersDAOImpl;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class TestUsersDAOImpl {

	@Test
	public void testUsersLoginSuccess() {
		
		Users u = new Users(1,"wuhao","123");
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Assert.assertEquals("usersDAOImpl.usersLogin", true, usersDAOImpl.usersLogin(u));
	}
	
	@Test
	public void testUsersLoginFail() {
		
		Users u = new Users(1,"xiechen","123456");
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Assert.assertEquals("usersDAOImpl.usersLogin", false, usersDAOImpl.usersLogin(u));
	}
	
	@Ignore
	@Test
	public void testAddUsers() {
		
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		usersDAOImpl.AddUser("xiaotong","123");
		
	}

}
