<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Query Students List</title>
</head>
<body>
<h1>Query Students List</h1>
<p>hi, <%= session.getAttribute("loginUserName")%></p>
<a href='<%=request.getContextPath() %>/students/Students_preAdd.action'>Add Student</a>
<ul>
	<s:iterator value="#session.students_list" var="student" status="index">
		<li><s:property value="#student.sid" /></li>
		<li>
			<a href='<%=request.getContextPath() %>/students/Students_preUpdate.action?sid=<s:property value="#student.sid" />'>
				<s:property value="#student.sname" />
			</a>
		</li>
		<li><s:property value="#student.gender" /></li>
		<li><s:date name="#student.birthday" format="yyyy-MM-dd" /></li>
		<li><s:property value="#student.address" /></li>
		<li>
			<a href='<%=request.getContextPath() %>/students/Students_delete.action?sid=<s:property value="#student.sid" />'>
				Delete
			</a>
		</li>
	</s:iterator>
</ul>
</body>
</html>