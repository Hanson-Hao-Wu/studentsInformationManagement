package org.hao.service.impl;

import java.util.List;

import org.hao.db.HibernateSessionFactory;
import org.hao.entity.Students;
import org.hao.service.StudentsDAO;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class StudentsDAOImpl implements StudentsDAO {

	/**
	 * List all the students
	 */
	public List<Students> queryAllStudents() {
		List<Students> StudentsList = null;
		Session session = null;
		String hql = "";
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			hql = "from Students";
			Query query = session.createQuery(hql);
			StudentsList = query.list();
			session.getTransaction().commit();
			return StudentsList;
		}
		catch(HibernateException ex) {
			
			ex.printStackTrace();
			if(session != null) {
				session.getTransaction().rollback();
			}
			return StudentsList;
		}
		finally {
			
			if(session != null) {
				session.close();
			}
		}
	}
	
	/**
	 * select one student by sid
	 */

	public Students queryStudentsBySid(String sid) {
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			Students s = (Students)session.get(Students.class, sid);
			session.getTransaction().commit();
			return s;
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

	public boolean addStudents(Students s) {
		s.setSid(this.getNewSid());
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(s);
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

	public boolean updateStudents(Students s) {
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(s);
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

	public boolean deleteStudents(String sid) {
		Session session = null;
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			Students s = (Students)session.get(Students.class, sid);
			session.delete(s);
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
	
	public String getNewSid(){
		Session session = null;
		String hql = "";
		String sid = "";
		try {
			
			session = HibernateSessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			hql = "select max(sid) from Students";
			Query query = session.createQuery(hql);
			sid = (String)query.uniqueResult();
			if(sid == null || "".equals(sid)) {
				
				sid = "S0000001";
			}else {
				
				String temp = sid.substring(1);
				int i = Integer.parseInt(temp);
				i++;
				temp = String.valueOf(i);
				int len = temp.length();
				for (int j = 0; j < 7-len; j++) {
					temp = "0" + temp;
				}
				sid = "S" + temp;
			}
			session.getTransaction().commit();
			
			return sid;
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
