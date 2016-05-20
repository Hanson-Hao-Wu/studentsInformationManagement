package org.hao.service.impl;

import java.util.List;

import org.hao.db.HibernateSessionFactory;
import org.hao.entity.Users;
import org.hao.service.UsersDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsersDAOImpl implements UsersDAO {

	public boolean usersLogin(Users u) {
		Transaction transaction = null;
		String hql = "";
		try {
			
			Session session = HibernateSessionFactory.getSessionFactory().openSession();
			hql = "from Users where username = ? and password = ? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
			List list = query.list();
			transaction.commit();
			if(list.size() > 0){
				
				return true;
			}else{
				return false;
			}
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
			return false;
		}
		finally {
			
			if(transaction != null) {
				transaction.commit();
				transaction = null;
			}
		}
	}

}
