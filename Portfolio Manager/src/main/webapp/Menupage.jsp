<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Page</title>
	<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	
	<div class="Menupage">
	<h1>Kindly Choose From the below options</h1>

	
	<br>
	<br>
	<form action="index.jsp" >
	<input type="submit" name="buysell" value="Buy/Sell Share cum calculator">
	</form>
	<br>
	<br>
	
	<form action="investmententry.jsp">
	<input type="submit" name="InvEntry" value="Investment Entry">
	</form>
	<br>
	<br>
	
	<form action="investmentshow.jsp">
	<input type="submit" name="InvAmount" value="See the Total Invested Amount">
	</form>
	</div>
</body>
</html>