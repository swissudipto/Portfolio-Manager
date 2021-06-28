<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Investment Entry</title>
	<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<div class="Investmentdtls" >
<form action="investmententry">

	<h1>Investment Details Entry</h1>
	<br>
	<br>

	<label>Invested Amount</label>
	<input type="text" name="Investedamt">
	<br>
	<br>


	<label>Investment Date</label>
	<input type="date" name="Investeddate">
	<br>
	<br>

	<input type="submit" name="submit" value="Submit">
	</form>
</div>

</body>
</html>