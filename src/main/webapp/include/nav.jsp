<%@ taglib uri="/struts-tags" prefix="s"%>
<nav class="teal lighten-2">
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo">Logo</a> <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
		<ul class="right hide-on-med-and-down">
			<s:if test='#session.loginUserName != null'>
				<li>
					<a href="<%=request.getContextPath()%>/students/Students_query.action">
						<i class="material-icons left">supervisor_account</i>Students List
					</a>
				</li>
				<li><a href="#!"><i class="material-icons left">perm_identity</i><%= session.getAttribute("loginUserName")%></a></li>
				<li><a href="<%=request.getContextPath()%>/users/Users_logout.action"><i class="material-icons left">power_settings_new</i>Logout</a></li>
			</s:if>
			<s:else>
				<li><a href="<%=request.getContextPath() %>">Login</a></li>
			</s:else>
		</ul>
		<ul class="side-nav" id="mobile-demo">
			<s:if test='#session.loginUserName != null'>
				<li>
					<a href="<%=request.getContextPath()%>/students/Students_query.action">
						<i class="material-icons left">supervisor_account</i>Students List
					</a>
				</li>
				<li><a href="#!"><i class="material-icons left">perm_identity</i><%= session.getAttribute("loginUserName")%></a></li>
				<li><a href="<%=request.getContextPath()%>/users/Users_logout.action"><i class="material-icons left">power_settings_new</i>Logout</a></li>
			</s:if>
			<s:else>
				<li><a href="<%=request.getContextPath() %>">Login</a></li>
			</s:else>
		</ul>
	</div>
</nav>