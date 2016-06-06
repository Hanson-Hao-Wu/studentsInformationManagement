<%@include file="/include/header.jsp"%>

<div class="row">

	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<div class="row">
			<h3>Add Students</h3>
			<form action="<%=request.getContextPath()%>/students/Students_add.action">
				<div class="row">
					<div class="input-field">
						<label for="sname">Student Name</label>
						<input type="text" name="sname" id="studentName" />
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<select name="gender">
							<option value="" disabled selected>Choose your option</option>
							<option value="male">male</option>
							<option value="female">female</option>
						</select> <label>Gender</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<label for="birthday">Birthday</label>
						<input type="date" class="datepicker" name="birthday" id="birthday" />
					</div>
				</div>
				<div class="row">
					<div class="input-field">
						<label for="address">Address</label>
						<input type="text" name="address" id="address" />
					</div>
				</div>
				<div class="row">
					<div>
						<button class="btn waves-effect waves-light col s12" type="submit" name="action">
							Add <i class="material-icons right">send</i>
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
</div>

<%@include file="/include/footer.jsp"%>