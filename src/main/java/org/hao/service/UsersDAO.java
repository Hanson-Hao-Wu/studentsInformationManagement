package org.hao.service;

import org.hao.entity.Users;

public interface UsersDAO {

	public boolean usersLogin(Users u);
	public boolean AddUser(String username, String password);
	
}
