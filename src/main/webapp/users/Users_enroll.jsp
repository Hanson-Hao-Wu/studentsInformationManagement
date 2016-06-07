<%@include file="/include/header.jsp"%>

<div class="row">
	<div class="col s12 m8 l6 offset-m2 offset-l3">
		<div class="row">
			<h3>User Enroll</h3>
		</div>
		<form action="<%=request.getContextPath()%>/users/Users_enroll.action">
			<div class="row">
				<div class="input-field">
					<label for="username">Username</label>
					<input name="username" id="username" type="text" class="validate">
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="password">Password</label>
					<input name="password" type="password" id="password" class="validate">
				</div>
			</div>
			<div class="row">
				<div>
					<button class="btn waves-effect waves-light col s12" type="submit" name="action">
						Login <i class="material-icons right">send</i>
					</button>
				</div>
			</div>
			<div class="row">
				<div>
					<button class="btn waves-effect waves-light col s12" type="reset" name="action">
						Reset <i class="material-icons right">settings_backup_restore</i>
					</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="/include/footer.jsp"%>