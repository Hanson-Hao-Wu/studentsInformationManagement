package org.hao.entity;

import java.util.Date;

import org.hao.db.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.junit.Ignore;
import org.junit.Test;

public class TestStudents {
	
	@Test
	/* Add the test student data */
	public void testSaveStudents() {
		
		Students s1 = new Students("S0000001", "wuhao", "male", new Date(), "test_address");
		Students s2 = new Students("S0000002", "xiechen", "female", new Date(), "test_address");
		Students s3 = new Students("S0000003", "quxia", "male", new Date(), "test_address");
		
		
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.getTransaction().commit();
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}
	

}
