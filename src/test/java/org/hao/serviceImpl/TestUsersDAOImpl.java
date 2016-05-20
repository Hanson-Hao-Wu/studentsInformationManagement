package org.hao.serviceImpl;

import static org.junit.Assert.*;

import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hao.service.impl.UsersDAOImpl;
import org.junit.Assert;
import org.junit.Test;


public class TestUsersDAOImpl {

	@Test
	public void testUsersLogin() {
		
		Users u = new Users(1,"wuhao","123456");
		UsersDAO usersDAOImpl = new UsersDAOImpl();
		Assert.assertEquals("usersDAOImpl.usersLogin", true, usersDAOImpl.usersLogin(u));
	}

}
