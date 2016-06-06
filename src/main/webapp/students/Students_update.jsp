<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Students</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/students/Students_update.action">
		<input type="text" name="sid" value='<s:property value="#session.update_students.sid" />' />
		<input type="text" name="sname" value='<s:property value="#session.update_students.sname" />' />
		<s:if test='#session.update_students.gender=="male"'>
			<input type="radio" name="gender" value="male" checked="checked" />male
			<input type="radio" name="gender" value="female" />female
		</s:if>
		<s:else>
			<input type="radio" name="gender" value="male" />male
			<input type="radio" name="gender" value="female" checked="checked" />female
		</s:else>
		<input type="text" name="birthday" value='<s:date name="#session.update_students.birthday" format="yyyy-MM-dd" />' />
		<input type="text" name="address" value='<s:property value="#session.update_students.address" />' />
		<input type="submit" value="submit"/>
		<input type="reset" value="reset" />
	</form>

</body>
</html>