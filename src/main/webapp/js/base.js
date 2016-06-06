$(document).ready(function() {
	//To activate the dropdown menu
	$(".button-collapse").sideNav();
	//select box
	$('select').material_select();
	//date picker
	$('.datepicker').pickadate({
		selectMonths: true, // Creates a dropdown to control month
		selectYears: 1985, // Creates a dropdown of 15 years to control year
		format: 'yyyy-mm-dd',
	});
});