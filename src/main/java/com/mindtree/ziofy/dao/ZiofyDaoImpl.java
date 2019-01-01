package com.mindtree.ziofy.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mindtree.ziofy.model.User;
import com.mindtree.ziofy.utility.ZiofyUtils;

public class ZiofyDaoImpl implements ZiofyDao{
	public String addUser(User user) {
		Session session = ZiofyUtils.createConnection();
		Transaction txn = session.beginTransaction(); 
		System.out.println(user);
		
		session.merge(user);
		
		txn.commit();
		
		return "Success";
	}

	@Override
	public boolean verifyUser(String username, String password) {
		List<User> userlist = new ArrayList<>();
		
		Session session = ZiofyUtils.createConnection();
		Transaction txn = session.beginTransaction(); 

		System.out.println(username + " " + password);
		
		Query query = session.createQuery("from User where username=:uname and password=:pwd");
		query.setParameter("uname", username);
		query.setParameter("pwd", password);
		
		userlist = query.getResultList();
				
		if(userlist.size()>0) {
			return true;
		}
		else 
			return false;
	}

}
