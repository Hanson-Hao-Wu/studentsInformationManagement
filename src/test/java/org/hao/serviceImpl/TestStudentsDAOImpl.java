package org.hao.serviceImpl;

import java.util.Date;
import java.util.List;

import org.hao.entity.Students;
import org.hao.service.StudentsDAO;
import org.hao.service.impl.StudentsDAOImpl;
import org.junit.Ignore;
import org.junit.Test;

public class TestStudentsDAOImpl {
	
	@Test
	public void testQueryAllStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		List<Students> studentsList = sdao.queryAllStudents();
		for (Students students : studentsList) {
			
			System.out.println(students);
		}
	}
	
	@Ignore
	@Test
	public void testdeleteStudent() {
		StudentsDAOImpl sdao = new StudentsDAOImpl();
		sdao.deleteStudents("S0000001");
	}
	
	@Ignore
	@Test
	public void testGetNewSid() {
		StudentsDAOImpl sdao = new StudentsDAOImpl();
		System.out.println(sdao.getNewSid());
	}
	
	@Test
	public void testAddStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students(null, "xiaotong", "female", new Date(), "15A"));
	}
	
	@Ignore
	@Test
	public void testDeleteStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students("S0000002", "quxia", "male", new Date(), "test-address"));
	}
	
	@Ignore	
	@Test
	public void testUpdateStudents() {
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(new Students("S0000002", "quxia", "male", new Date(), "test-address"));
	}

}
