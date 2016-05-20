package org.hao.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSessionFactory {

	private static SessionFactory sessionFactory;
	
	private HibernateSessionFactory() {}
	
	static {
		try {
			Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionFactory = config.buildSessionFactory(serviceRegistry); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static SessionFactory getSessionFactory() {
			return sessionFactory;
	}
}
