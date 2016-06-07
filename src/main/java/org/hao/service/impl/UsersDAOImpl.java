package org.hao.service.impl;

import java.util.List;

import org.hao.db.HibernateSessionFactory;
import org.hao.entity.Students;
import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsersDAOImpl implements UsersDAO {
	
	public boolean addUser(Users u){
		
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
	
	public boolean deleteUser(int uid){
		
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			Users u = (Users)session.get(Users.class, uid);
			session.delete(u);
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
	
	public boolean updateUser(Users u){
		
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(u);
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

	public int usersLogin(Users u) {
		Session session = null;
		String hql = "";
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			hql = "select u.uid from Users u where username = ? and password = ? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
			List list = query.list();
			session.getTransaction().commit();
			if(list.size() > 0){
				int uid = (Integer)list.get(0);
				return uid;
			}else{
				return -1;
			}
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return -1;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}

	public List<Users> listUsers() {
		List<Users> usersList = null;
		Session session = null;
		String hql = "";
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			hql = "from Users";
			Query query = session.createQuery(hql);
			usersList = query.list();
			session.getTransaction().commit();
			return usersList;
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return usersList;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}

	public Users queryUsersByUid(int uid) {
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			Users u = (Users)session.get(Users.class, uid);
			session.getTransaction().commit();
			return u;
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return null;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}

}
