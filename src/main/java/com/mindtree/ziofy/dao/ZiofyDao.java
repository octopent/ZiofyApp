package com.mindtree.ziofy.dao;

import com.mindtree.ziofy.model.User;

public interface ZiofyDao {
	public String addUser(User user);
	public boolean verifyUser(String parameter, String parameter2);
}
