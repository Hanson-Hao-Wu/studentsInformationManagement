package org.hao.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;


import org.hao.entity.Students;
import org.hao.service.StudentsDAO;
import org.hao.service.impl.StudentsDAOImpl;

public class StudentsAction extends SuperAction {

	private static final long serialVersionUID = 1L;
	
	public String query() {
		
		StudentsDAO sdao = new StudentsDAOImpl();
		List<Students> StudentsList = sdao.queryAllStudents();
		if(StudentsList != null && StudentsList.size()>0) {
			session.setAttribute("students_list", StudentsList);
		}
		return "query_success";
	}
	
	public String delete() {
		
		StudentsDAO sdao = new StudentsDAOImpl();
		String sid = request.getParameter("sid");
		sdao.deleteStudents(sid);
		
		return "delete_success";
	}
	
	public String preAdd() {
		
		return "preAdd_success";
	}
	
	public String add() throws Exception{
		Students s = new Students();
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		s.setBirthday(df.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.addStudents(s);
		
		return "add_success";
	}
	
	public String preUpdate()  {
		
		StudentsDAO sdao = new StudentsDAOImpl();
		String sid = request.getParameter("sid");
		Students s = sdao.queryStudentsBySid(sid);
		
		session.setAttribute("update_students", s);
		return "preUpdate_success";
	}
	
	public String update() throws Exception{
		Students s = new Students();
		s.setSid(request.getParameter("sid"));
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s.setBirthday(sdf.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		StudentsDAO sdao = new StudentsDAOImpl();
		sdao.updateStudents(s);
		
		return "update_success";
	}
	
}
