<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="login-form">
<h1>Welcome to  Portfolio Management System </h1>

<br><br>
<form action="logon" method="post">


<p>User Name:</p>	
<input  type="text" id="uname" name="uname" placeholder="User Name"  required ><br><br>
<p>Password:</p>	
<input   type="text" id="pward" name="pward" placeholder="Password" required ><br><br>


<input  type="submit" value="Submit">

</form>
</div>
<div class="Error">
<%
	String vale1;
     vale1 = (String) request.getAttribute("ErrorMSG" ) ;
	if(vale1 !=null)
	{
		out.println( vale1 );
	}
	
      
      %>
</div>
</body>
</html>