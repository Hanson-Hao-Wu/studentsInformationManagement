package org.hao.service.impl;

import java.util.List;

import org.hao.db.HibernateSessionFactory;
import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsersDAOImpl implements UsersDAO {
	
	public boolean AddUser(String username, String password){
		Users u = new Users();
		u.setUsername(username);
		u.setPassword(password);
		
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(u);
			session.getTransaction().commit();
			return true;
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return false;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
		
	}

	public boolean usersLogin(Users u) {
		Session session = null;
		String hql = "";
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			hql = "from Users where username = ? and password = ? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
			List list = query.list();
			session.getTransaction().commit();
			if(list.size() > 0){
				return true;
			}else{
				return false;
			}
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return false;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}

}
