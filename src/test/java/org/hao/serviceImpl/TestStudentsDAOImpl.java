package org.hao.serviceImpl;

import java.util.Date;

import org.hao.entity.Students;
import org.hao.service.StudentsDAO;
import org.hao.service.impl.StudentsDAOImpl;
import org.junit.Test;

public class TestStudentsDAOImpl {

	@Test
	public void testGetNewSid() {
		StudentsDAOImpl sdao = new StudentsDAOImpl();
		System.out.println(sdao.getNewSid());
	}
	
	@Test
	public void testAddStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students(null, "quxia", "female", new Date(), "test-address"));
	}
	
	@Test
	public void testDeleteStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students("S0000002", "quxia", "male", new Date(), "test-address"));
	}
	
	@Test
	public void testUpdateStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students("S0000002", "quxia", "male", new Date(), "test-address"));
	}

}
