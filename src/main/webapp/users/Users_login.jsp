<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String path = request.getContextPath();
%>
<div>
<h1>Information</h1>
request.getContextPath(): <%=path %>
</div>
	<form action="<%=path %>/users/Users_login.action">
		Username
		<input type="text" name="username">
		<br>
		Password
		<input type="text" name="password">
		<br>
		<input type="submit" value="Login">
		<input type="reset" value="Reset">
		<div>
			<s:fielderror/>
		</div>
	</form>

</body>
</html>