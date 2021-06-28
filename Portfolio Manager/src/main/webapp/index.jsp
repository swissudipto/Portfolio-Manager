<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title >PortfolioManager</title>
<link rel="stylesheet" type="text/css" href="styles.css">
	
</head>
<body >

  
<form class="login-form3" action="godmode" method="post" >
<h1> Share Buy/Sell Calculator Cum Transaction Entry </h1>
<br><br>
  <label for="fname">Company name</label>
  <input type="text" id="fname" name="fname" required ><br><br>
  <label for="buyprice">Share Buy Price</label>
  <input type="text" id="buyprice" name="buyprice" required><br><br>
  <label  for="Quantity">Share Quantity</label>
  <input type="text" id="Quantity" name="Quantity" required><br><br>
  
  <div>
  <input  type="radio" id="Buy" name="Mode" value="Buy"
         checked>
  <label for="Buy">Buy</label>
</div>

<div>
  <input type="radio" id="Sell" name="Mode" value="Sell">
  <label for="Sell">Sell</label>
</div>

<br>
<br>
  	
  <input  type="submit" value="Submit">
  <br>

<a  href="https://groww.in/dashboard/explore/stocks">Click here to start Trading</a><br>

<br>


<a href="about.html">About us</a>

 
</form>





</body>
</html>