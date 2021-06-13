<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<title >PortfolioManager</title>
	<style type="text/css">
	.p1 {
  font-family: "Times New Roman", Times, serif;
  text-align: center;
}

.p3 {
  font-family: "Lucida Console", "Courier New", monospace;
  align-items: center;
}
.p4{
	color: yellowgreen;
}
img {
  border: 1px solid #ddd;
  border-radius: 4px;
  padding: 5px;
  width: 150px;
}
p{
  border: 1px solid black;
  margin-top: 50px;
  margin-bottom: 50px;
  margin-right: 100px;
  margin-left: 50px;
  background-color: cadetblue;
  text-align: center;
  font-size: 130%;
}
body {
  background-image: url('https://welpmagazine.com/wp-content/uploads/2020/09/GettyImages-891634254_2400-acea07b464d94bedbd2d7b38f7c55e27.png');
   background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}


	</style>
</head>
<body >
<p><strong> Portfolio Management System </strong></p>
<br><br>
  
<form action="godmode" method="post">
  <label class="p4"for="fname">Company name</label>
  <input type="text" id="fname" name="fname" ><br><br>
  <label class="p4" for="buyprice">Share Buy Price</label>
  <input type="text" id="buyprice" name="buyprice"><br><br>
  <label class="p4" for="Quantity">Share Quantity</label>
  <input type="text" id="Quantity" name="Quantity"><br><br>
  
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
  	
  <input class="p4" type="submit" value="Submit">
  <% 
  	session.getAttribute("fname");
	session.getAttribute("buyprice");
	session.getAttribute("Quantity");
		  
		  
		  
		  %>
 
</form>
<br>

<a class="p4" href="https://groww.in/dashboard/explore/stocks">Click here to start Trading</a><br>

<br>


<a class="p4" href="about.html">About us</a>




</body>
</html>