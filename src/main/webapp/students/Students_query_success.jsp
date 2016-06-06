<%@include file="/include/header.jsp"%>

<div class="row">
	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<h3>Query Students List</h3>
		<p>Hi, <%=session.getAttribute("loginUserName")%></p>
		<a href='<%=request.getContextPath()%>/students/Students_preAdd.action' class="waves-effect waves-light btn">
			<i class="material-icons left">add</i>Add Student
		</a>
		<table class="responsive-table highlight">
			<thead>
				<tr>
					<th data-field="sid">Student ID</th>
					<th data-field="sname">Name</th>
					<th data-field="gender">Gender</th>
					<th data-field="birthday">Birthday</th>
					<th data-field="address">Address</th>
					<th data-field="delete">Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.students_list" var="student"
					status="sindex">

					<tr class="s-row-<s:property value='#sindex.index + 1'/>">
						<td><s:property value="#student.sid" /></td>
						<td><a
							href='<%=request.getContextPath()%>/students/Students_preUpdate.action?sid=<s:property value="#student.sid" />'>
								<s:property value="#student.sname" />
						</a></td>
						<td><s:property value="#student.gender" /></td>
						<td><s:date name="#student.birthday" format="yyyy-MM-dd" /></td>
						<td><s:property value="#student.address" /></td>
						<td><a
							href='<%=request.getContextPath()%>/students/Students_delete.action?sid=<s:property value="#student.sid" />'>
								Delete </a></td>
					</tr>

				</s:iterator>
			</tbody>
		</table>
	</div>
</div>

<%@include file="/include/footer.jsp"%>