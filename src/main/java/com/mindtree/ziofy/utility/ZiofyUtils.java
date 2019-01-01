package com.mindtree.ziofy.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.ziofy.model.User;

public class ZiofyUtils {
	public static Session createConnection() {
		Configuration configuration = new Configuration()
				.configure()
				.addAnnotatedClass(User.class);
		SessionFactory sf = configuration.buildSessionFactory(); 
		Session session = sf.openSession(); 
		return session;
	}
}
