<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<style type="text/css">
input/* [type=text] */{
  border-radius:10px;
}
body
{
height: 1000px;
background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
}
</style>
</head>
<body>
<div class="con">
	<a href="" style="color: black">Go Back</a>
	<div style="color: white; float: right"><h4>${msg }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h4></div>

	<hr color="black" size="1">
	<div class="container" style="background-color: silver; align-content: center;">
	<br><br><br>
		<form class="form-inline" action="Create">
			<div class="form-group" style="align-content: center;">
			<table style="align-content: center;">
				<tr>
					<td><label for="Name">Name</label></td>
					<td><input type="text" class="form-control-plaintext" name="name" required="required"></td>
				</tr>
				<tr>
					<td><label>Age</label></td>
					<td><input type="number"  name="age" required="required"></td>
				</tr>
				<tr>
					<td><label>Initial Balance &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label></td>
					<td><input type="number" name="initBal" required="required"></td>
				</tr>
				<tr>
					<td><label>City</label></td>
					<td><input type="text" name="address" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn btn-default btn-xs" value="Create Account"></td>
				</tr>
			</table>
			<br><br><br>
		</div>
		</form>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</div>
	</div>
</body>
</html>