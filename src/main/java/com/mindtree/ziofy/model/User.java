package com.mindtree.ziofy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String username;
	private String fname;
	private String lname;
	private String password;
	public User() {
		super();
	}
	public User(String username, String fname, String lname, String password) {
		super();
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username: " + username + ", fname: " + fname + ", lname: " + lname + ", password: " + password + "]\n";
	}
	
	
}
