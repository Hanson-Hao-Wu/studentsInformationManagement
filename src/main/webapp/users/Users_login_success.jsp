<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users_login_success</title>
</head>
<body>
	<h1>Users_login_success</h1>
	
	<p>hi, <%= session.getAttribute("loginUserName")%> <a href="<%=request.getContextPath()%>/users/Users_logout.action">Logout</a></p>
	
</body>
</html>