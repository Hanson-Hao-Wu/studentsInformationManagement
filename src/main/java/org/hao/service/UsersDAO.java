package org.hao.service;

import java.util.List;

import org.hao.entity.Users;

public interface UsersDAO {

	public boolean usersLogin(Users u);
	public Users queryUsersByUid(int uid);
	public boolean addUser(Users u);
	public boolean deleteUser(int uid);
	public boolean updateUser(Users u);
	public List<Users> listUsers();
	
}
