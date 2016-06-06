<%@include file="/include/header.jsp"%>

<h1>User Login Success</h1>

<p>hi, <%= session.getAttribute("loginUserName")%> <a href="<%=request.getContextPath()%>/users/Users_logout.action">Logout</a></p>
<p><a href="<%=request.getContextPath() %>/students/Students_query.action">Students List</a></p>

<%@include file="/include/footer.jsp"%>