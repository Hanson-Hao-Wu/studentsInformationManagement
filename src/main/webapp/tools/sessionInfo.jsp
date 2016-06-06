<%@ page language="java" import="java.util.*"%>
<%@include file="/include/header.jsp"%>
<div class="row">
	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<h3>Session Information</h3>
		<table class="striped">
			<thead>
				<tr>
					<th>Session Key</th>
					<th>Session Value</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (Enumeration e = session.getAttributeNames(); e.hasMoreElements();) {
						String attribName = (String) e.nextElement();
						Object attribValue = session.getAttribute(attribName);
				%>

				<tr>
					<td><%=attribName%></td>
					<td><%=attribValue%></td>
				</tr>

				<%
					}
				%>
			</tbody>
		</table>
	</div>
</div>

<%@include file="/include/footer.jsp"%>