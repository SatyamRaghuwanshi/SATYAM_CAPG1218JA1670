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
input /* [type=text] */ {
	border-radius: 10px;
}
body
{
height: 1000px;
background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
}

</style>
</head>
<body>

	<a href="" style="color: black">Go Back</a>
<div style="color: white; float: right"><h4>${msg }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h4></div>

	<hr color="black" size="1">
	<div class="container"
		style="background-color: silver; align-content: center;">
		<br>
		<br>
		<br>
		<form action="Withdrawl">
			<table>
				<tr>
					<td>Account No:</td>
					<td><input type="text" name="t1" required="required"></td>
				</tr>
				<tr>
					<td>Amount</td>
					<td><input type="number" name="t2" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Withdraw"></td>
				</tr>
			</table>
			<br><br><br>
		</form>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</div>
</body>
</html>