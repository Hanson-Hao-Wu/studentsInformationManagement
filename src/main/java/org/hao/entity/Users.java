package org.hao.entity;

public class Users {

	private int uid;
	private String username;
	private String password;
	private String email;
	private String role;
	private String stutas;


	@Override
	public String toString() {
		return "Users [uid=" + uid + ", username=" + username + ", password="
				+ password + ", email=" + email + ", role=" + role
				+ ", stutas=" + stutas + "]";
	}

	public Users() {}

	public Users(int uid, String username, String password, String email,
			String role, String stutas) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.stutas = stutas;
	}
	
	public Users(String username, String password, String email,
			String role, String stutas) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.stutas = stutas;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStutas() {
		return stutas;
	}
	public void setStutas(String stutas) {
		this.stutas = stutas;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
