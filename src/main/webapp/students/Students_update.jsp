<%@include file="/include/header.jsp"%>

<div class="row">

	<div class="col s12 m10 l8 offset-m1 offset-l2">
		<div class="row">
			<h3>Update Student</h3>
		</div>
		<form
			action="<%=request.getContextPath()%>/students/Students_update.action">
			<div class="row">
				<div class="input-field">
					<label for="sid">Student ID</label> <input type="text" name="sid"
						id="sid"
						value='<s:property value="#session.update_students.sid" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="sname">Student Name</label> <input type="text"
						name="sname" id="sname"
						value='<s:property value="#session.update_students.sname" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<select name="gender">
						<s:if test='#session.update_students.gender=="male"'>
							<option value="male" selected>male</option>
							<option value="female">female</option>
						</s:if>
						<s:else>
							<option value="male">male</option>
							<option value="female" selected>female</option>
						</s:else>
					</select> <label>Gender</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="birthday">Birthday</label> <label for="birthday">Birthday</label>
					<input type="date" class="datepicker" name="birthday" id="birthday"
						value='<s:date name="#session.update_students.birthday" format="yyyy-MM-dd" />' />
				</div>
			</div>
			<div class="row">
				<div class="input-field">
					<label for="address">Address</label> <input type="text"
						name="address" id="address"
						value='<s:property value="#session.update_students.address" />' />
				</div>
			</div>
			<div class="row">
				<div>
					<button class="btn waves-effect waves-light col s12" type="submit"
						name="action">
						Update <i class="material-icons right">send</i>
					</button>
				</div>
			</div>
			<div class="row">
				<div>
					<button class="btn waves-effect waves-light col s12" type="reset"
						name="action">
						Add <i class="material-icons right">settings_backup_restore</i>
					</button>
				</div>
			</div>
		</form>
	</div>
</div>

<%@include file="/include/footer.jsp"%>