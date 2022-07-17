package com.connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {
	
	public static void main(String[] args) {
			
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.println(factory);
		System.out.println(factory.isClosed());
		
		factory.close();
		System.out.println(factory.isClosed());
	}
}
