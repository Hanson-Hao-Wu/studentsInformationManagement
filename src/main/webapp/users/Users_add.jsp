<%@include file="/include/header.jsp"%>

<div class="row">

	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<div class="row">
			<h3>Add User</h3>
			<form action="<%=request.getContextPath()%>/users/Users_add.action">
				<div class="row">
					<div class="input-field">
						<label for="username">UserName</label>
						<input type="text" name="username" id="username" />
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<label for="password">Password</label>
						<input type="text" name="password" id="password" />
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<label for="email" data-error="wrong" data-success="right">Email</label>
						<input type="email" name="email" id="email" />
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<select name="role">
							<option value="" disabled selected>Choose your option</option>
							<option value="admin">admin</option>
							<option value="normal">normal</option>
						</select>
						<label for="role">Role</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<select name="stutas">
							<option value="" disabled selected>Choose your option</option>
							<option value="active">active</option>
							<option value="inactive">inactive</option>
						</select>
						<label for="stutas">Stutas</label>
					</div>
				</div>
				<div class="row">
					<div>
						<button class="btn waves-effect waves-light col s12" type="submit" name="action">
							Add <i class="material-icons right">send</i>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<%@include file="/include/footer.jsp"%>