package org.hao.util;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

    public static final ThreadLocal<Session> SESSIONMAP = new ThreadLocal<Session>();  
    private static final SessionFactory sessionFactory;  
    private static final Logger LOGGER = Logger.getLogger(HibernateUtil.class);  

    static {
        try {
            LOGGER.debug("HibernateUti.static - loading config"); 
            Configuration config = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionFactory = config.buildSessionFactory(serviceRegistry); 
            LOGGER.debug("HibernateUtil.static - end");  
        } catch (Throwable ex) {  
            ex.printStackTrace();  
            LOGGER.error("HibernateUti error : ExceptionInInitializerError");  
            throw new ExceptionInInitializerError(ex);  
        }  
    }  
      
    private HibernateUtil() {}  
    
    public static SessionFactory getSessionFactory() {
    	return sessionFactory;
    }
  
    public static Session getSession() throws HibernateException {  
        Session session = SESSIONMAP.get();  
          
        if(session == null) {  
            session = sessionFactory.openSession();  
            SESSIONMAP.set(session);  
        }  
          
        return session;  
    }  
      
    public static void closeSession() throws HibernateException {  
        Session session = SESSIONMAP.get();  
        SESSIONMAP.set(null);  
          
        if(session != null) {  
            session.close();  
        }
    }
}
