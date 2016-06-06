<%@include file="/include/header.jsp"%>

<h1>User Login</h1>
<form action="<%=request.getContextPath() %>/users/Users_login.action">
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

<%@include file="/include/footer.jsp"%>