package org.hao.db;

import org.hao.entity.Users;
import org.hibernate.HibernateException;
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
	
	@Test
	public void testSave() {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			Users u = new Users(2, "xiechen-2", "abc123","abc.gmail.com",null,null);
			session.save(u);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
		
		
	}

}
