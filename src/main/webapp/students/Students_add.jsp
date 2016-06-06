<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Students_Add</h1>
	<form action="<%=request.getContextPath() %>/students/Students_add.action">
		<input type="text" name="sname" placeholder="sname" />
		<input type="radio" name="gender" value="male" checked="checked" />male
		<input type="radio" name="gender" value="female" />female
		<input type="text" name="birthday" placeholder="birthday" />
		<input type="text" name="address" placeholder="address" />
		<input type="submit" value="submit"/>
		<input type="reset" value="reset" />
	</form>

</body>
</html>