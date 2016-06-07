<%@include file="/include/header.jsp"%>

<div class="row">
	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<h3>Users List</h3>
		<p>Hi, <s:property value="#session.loginUser.username"/></p>
		<a href='<%=request.getContextPath()%>/users/Users_preAdd.action' class="waves-effect waves-light btn">
			<i class="material-icons left">add</i>Add User
		</a>
		<table class="responsive-table highlight">
			<thead>
				<tr>
					<th data-field="uid">User ID</th>
					<th data-field="username">Username</th>
					<th data-field="password">Password</th>
					<th data-field="email">Email</th>
					<th data-field="role">Role</th>
					<th data-field="stutas">Stutas</th>
					<th data-field="delete">Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.usersList" var="user" status="uindex">

					<tr class="s-row-<s:property value='#uindex.index + 1'/>">
						<td><s:property value="#user.uid" /></td>
						<td><a
							href='<%=request.getContextPath()%>/users/Users_preUpdate.action?uid=<s:property value="#user.uid" />'>
								<s:property value="#user.username" />
						</a></td>
						<td><s:property value="#user.password" /></td>
						<td><s:property value="#user.email" /></td>
						<td><s:property value="#user.role" /></td>
						<td><s:property value="#user.stutas" /></td>
						<td>
							<a href='<%=request.getContextPath()%>/users/Users_delete.action?uid=<s:property value="#user.uid" />'>
								Delete
							</a>
						</td>
					</tr>

				</s:iterator>
			</tbody>
		</table>
	</div>
</div>

<%@include file="/include/footer.jsp"%>