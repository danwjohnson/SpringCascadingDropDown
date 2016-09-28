<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<meta name="viewport"
	content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;" />
<link rel="stylesheet" href="<c:url value="/resources/page.css" />"
	type="text/css" media="screen" />
<script type="text/javascript"
	src="<c:url value="/resources/jquery/1.6/jquery-3.1.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-ui/jquery-ui.min.js" />"></script>		
<script type="text/javascript">
	window.scrollTo(0, 1);
</script>

<c:url var="findStateCitiesURL" value="/cities" />
<c:url var="findStatesURL" value="/states" />

<script type="text/javascript">
$(document).ready(function() {
	$('#usStates').change(
			function() {
				$.getJSON('${findStateCitiesURL}', {
					stateName : $(this).val(),
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">City</option>';
					var len = data.length;
					for (var i = 0; i < len; i++) {
						html += '<option value="' + data[i].name + '">'
							+ data[i].name + '</option>';
					}
					
					html += '</option>';
					
					$('#city').html(html);
				});
							
			});
});

</script>

<script type="text/javascript">
$(document).ready(
		function() {
			$.getJSON('${findStatesURL}', {
				ajax : 'true'
			}, function(data) {
				var html = '<option value="">State</option';
				var len = data.length;
				for (var i = 0; i < len; i++) {
					html += '<option value="' + data[i].name + '">'
						+ data[i].name + '</option>';
				}
				
				html += '</option>';
				
				$('#usStates').html(html);
				
			});
		});
</script>

<script type="text/javascript">
$(document).ready(function(){
	$("$city").change(onSelectChange);
});

function onSelectChange() {
	var selected = $("#city option:selected");
	var output = "";
	if(selected.val() != 0){
		output = "You selected City " + selected.text();
	}
	$("output").html(output);
}
</script>

</head>
<body>

</body>
</html>