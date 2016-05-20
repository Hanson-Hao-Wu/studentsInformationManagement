package org.hao.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;

public class TestHibernateSessionFactory {

	@Test
	public void testgetSessionFactory() {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Assert.assertNotNull(sessionFactory);
	}
	
	@Test
	public void testgetSession() {
		Session session = HibernateSessionFactory.getSessionFactory().openSession();
		Assert.assertNotNull(session);
	}

}
