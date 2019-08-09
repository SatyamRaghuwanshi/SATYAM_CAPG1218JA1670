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
body {
	height: 1000px;
	background: linear-gradient(to bottom, #ffffff 0%, #000000 127%);
}
h2
{
	text-shadow: 2px 2px grey;
}
hr { 
  display: block;
  margin-top: 0.5em;
  margin-bottom: 0.5em;
  margin-left: auto;
  margin-right: auto;
  border-style: inset;
  border-width: 10px;
} 
a{
color: black;
}
</style>
</head>
<body>
	<div class="container">
		<h4 align="center">
		<br><br>
		<h2>Saul GoodMan's Bank</h2>
		<hr>
		<br>
		<ul type="circle">
			<li><a href="pCreate">Create new A/C</a></li> 
			<li><a href="pShow">Show Balance</a></li>
			<li><a href="pDeposit">Cash Deposit</a></li>
			<li><a href="pWithdrawl">Cash Withdrawl</a></li>
			<li><a href="pTransfer">Fund Transfer</a></li>
			<li><a href="pHistory">Transaction History</a></li>
		</ul>
		</h4>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<br>
		<hr>

	</div>

</body>
</html>