<%@ taglib uri="/struts-tags" prefix="s"%>
<ul id="dropdown-tool" class="dropdown-content">
  <li><a href="<%=request.getContextPath()%>/tools/sessionInfo.jsp">Session</a></li>
  <li><a href="<%=request.getContextPath()%>/users/Users_list.action">Users</a></li>
  <li class="divider"></li>
  <li><a href="#!">About</a></li>
</ul>
<nav class="teal lighten-2">
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo">Logo</a>
		<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
		<ul class="right hide-on-med-and-down">
			<s:if test='#session.loginUser != null'>
				<li>
					<a href="<%=request.getContextPath()%>/students/Students_query.action">
						<i class="material-icons left">supervisor_account</i>Students List
					</a>
				</li>
				<li><a href="#!"><i class="material-icons left">perm_identity</i><s:property value="#session.loginUser.username"/></a></li>
				<li>
					<a class="dropdown-button" href="#!" data-activates="dropdown-tool">
						<i class="material-icons left">settings</i>Tools
					</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/users/Users_logout.action"><i class="material-icons left">power_settings_new</i>Logout</a></li>
			</s:if>
			<s:else>
				<li><a href="<%=request.getContextPath() %>">Login</a></li>
				<li><a href="<%=request.getContextPath() %>/users/Users_">Enroll</a></li>
			</s:else>
		</ul>
		<ul class="side-nav" id="mobile-demo">
			<s:if test='#session.loginUser != null'>
				<li>
					<a href="<%=request.getContextPath()%>/students/Students_query.action">
						<i class="material-icons left">supervisor_account</i>Students List
					</a>
				</li>
				<li><a href="#!"><i class="material-icons left">perm_identity</i><s:property value="#session.loginUser.username"/></a></li>
				<li><a href="<%=request.getContextPath()%>/users/Users_logout.action"><i class="material-icons left">power_settings_new</i>Logout</a></li>
			</s:if>
			<s:else>
				<li><a href="<%=request.getContextPath() %>">Login</a></li>
			</s:else>
		</ul>
	</div>
</nav>