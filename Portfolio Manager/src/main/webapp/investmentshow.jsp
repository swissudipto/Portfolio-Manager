<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Total Invested</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<form action="investmentshow" class="Investmentshow">

	<h1>Look into Invested amount</h1>
	<br>
	<br>

	<label>Total Invested Amount</label>
	<input type="text" name="TotInvestedamt" value=<% String Val1 = (String) request.getAttribute("Totinvestedamount" ); 
	if (Val1!=null)
	{
		out.println(Val1);
	}
	else
	{
		out.println("0");
	}
	%> >
	<br>
	<br>


	<input type="submit" name="submit" value="Get Invested Amount">
	</form>


</body>
</html>