<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

body {
	height: 1000px;
	background: linear-gradient(to bottom, #33ccff 0%, #ff99cc 100%);
}
</style>

</head>
<body>

	<a href="" style="color: black">Go Back</a>
	<%-- <div style="color: white; float: right">
		<h4>${msg }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h4>
	</div>
 --%>
	<hr color="black" size="1">
	<div class="container"
		style="background-color: silver; align-content: center;">
		<br> <br> <br>
		<form action="History">
			<table>
				<tr>
					<td>Account No:</td>
					<td><input type="text" name="t1"></td>
				</tr>
				<tr>
					<td><input type="submit" value="All Transaction"></td>
				</tr>
			</table>
		</form>

		<br>
		<br>
		<table>
			<c:forEach var="t" items="${msg }">
				<tr>
					<td>${t}</td>
				</tr>
			</c:forEach>
		</table>

		<br> <br> <br>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	</div>
</body>
</html>