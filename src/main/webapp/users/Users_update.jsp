<%@include file="/include/header.jsp"%>

<div class="row">

	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<div class="row">
			<h3>Update User</h3>
		</div>
		<form
			action="<%=request.getContextPath()%>/users/Users_update.action">
			<div class="row">
				<div class="input-field">
					<label for="uid">User ID</label>
					<input type="text" name="uid" id="uid" value='<s:property value="#session.updateUser.uid" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="username">Username</label> <input type="text" name="username" id="username"
						value='<s:property value="#session.updateUser.username" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="password">password</label>
					<input type="text" name="password" id="password" value='<s:property value="#session.updateUser.password" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="email" data-error="wrong" data-success="right">Email</label>
					<input type="text" name="email" id="email" value='<s:property value="#session.updateUser.email" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<select name="role" 
						<s:if test='#session.updateUser.role!="admin"'>
							disabled
						</s:if>
						>
						<s:if test='#session.updateUser.role=="admin"'>
							<option value="admin" selected>admin</option>
							<option value="normal">normal</option>
						</s:if>
						<s:else>
							<option value="admin">admin</option>
							<option value="normal" selected>normal</option>
						</s:else>
					</select>
					<label>Role</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<select name="stutas" 
						<s:if test='#session.updateUser.role != "admin"'>
							disabled
						</s:if>
						>
						<s:if test='#session.updateUser.stutas == "active"'>
							<option value="active" selected>active</option>
							<option value="inactive">inactive</option>
						</s:if>
						<s:else>
							<option value="active">active</option>
							<option value="inactive" selected>inactive</option>
						</s:else>
					</select>
					<label for="stutas">Stutas</label>
				</div>
			</div>
			<div class="row">
				<div>
					<button class="btn waves-effect waves-light col s12" type="submit" name="action">
						Update <i class="material-icons right">send</i>
					</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="/include/footer.jsp"%>