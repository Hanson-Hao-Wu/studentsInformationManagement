<%@ taglib uri="/struts-tags" prefix="s"%>
<nav>
  <div class="nav-wrapper">
    <a href="#" class="brand-logo">Logo</a>
    <ul id="nav-mobile" class="right hide-on-med-and-down">
      <s:if test='#session.loginUserName != null'>
      	<li><a href="#!"><%= session.getAttribute("loginUserName")%></a></li>
      	<li><a href="<%=request.getContextPath()%>/users/Users_logout.action">Logout</a></li>
      </s:if>
      <s:else>
      	<li><a href="<%=request.getContextPath() %>">Login</a></li>
      </s:else>
    </ul>
  </div>
</nav>