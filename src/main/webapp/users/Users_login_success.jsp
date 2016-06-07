<%@include file="/include/header.jsp"%>
<div class="row">
	<div class="col s12 m8 l6 offset-m2 offset-l3">
		<h3>User Login Success</h3>

		<p class="header">
			hi, <s:property value="#session.loginUser.username"/>. Welcome back!
		</p>
		<div class="collection">
			<a href="<%=request.getContextPath()%>/students/Students_query.action" class="collection-item active">Students List</a>
			<a href="#!" class="collection-item">Alvin</a>
			<a href="#!" class="collection-item">Alvin</a>
			<a href="#!" class="collection-item">Alvin</a>
		</div>

		<%-- <jsp:forward page="/students/Students_query.action" /> --%>
	</div>
</div>
<%@include file="/include/footer.jsp"%>