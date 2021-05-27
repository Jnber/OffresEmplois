// Call the dataTables jQuery plugin
/*$(document).ready(function() {
 $('#dataTable').DataTable();
 });
 */

$(document).ready(function() {
	$("#myInput").on("keyup", function() {
		var value = $(this).val().toLowerCase();
		$("#myTable tr").filter(function() {
			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
		});
	});
});// Code goes here
