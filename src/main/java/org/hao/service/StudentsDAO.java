package org.hao.service;

import java.util.List;

import org.hao.entity.Students;

public interface StudentsDAO {
	
	public List<Students> queryAllStudents();
	
	public Students queryStudentsBySid(String sid);
	
	public boolean addStudents(Students s);
	
	public boolean updateStudents(Students s);
	
	public boolean deleteStudents(String sid);
	
}
