package org.hao.entity;

import org.junit.Test;

public class TestStudents {
	

	@Test
	public void testGetSession() {
		/*Session session = HibernateUtil.getSession();  
        Assert.assertNotNull(session);  
        HibernateUtil.closeSession();*/
	}
	
	@Test  
    public void testExport() {  
        //new SchemaExport(new Configuration().configure()).create(true , true);  
    }
	
	@Test  
    public void testSave() {  
		//Students student = new Students("abc123", "wuhao", "male", null, "121 Mcmahon Dr");    
		/*Users u = new Users(2,"wuhao","222");
		
        Session session = HibernateUtil.getSession();  
        Transaction tx = session.beginTransaction();  
          
        session.save(u);  
          
        tx.commit();  
        HibernateUtil.closeSession();*/
    }
	@Test  
    public void testQuery() {  
		/*Session session = HibernateUtil.getSession();  
        session.beginTransaction();  
          
        @SuppressWarnings("unchecked")  
        List<Students> studentList = session.createQuery("select s from Students s").list();  
	      
	    for(Students eachStudent : studentList) {  
	        System.out.println(eachStudent);
	    }  
	    session.getTransaction().commit();
	    HibernateUtil.closeSession();*/
	}

}
