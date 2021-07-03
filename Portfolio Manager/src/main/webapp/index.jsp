<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
    <%@ page import="java.util.*" %>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title >PortfolioManager</title>
<link rel="stylesheet" type="text/css" href="styles.css">
	
</head>
<body >
<%
    try{
Class.forName("com.mysql.jdbc.Driver");
Connection connection = 
         DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/mindpalace","root","cmc123");

       Statement statement = connection.createStatement() ;

       resultset =statement.executeQuery("SELECT D.COMPANY_NAME FROM mindpalace.company_master D ORDER BY D.COMPANY_NAME") ;
    }catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>

  
<form class="login-form3" action="godmode" method="post" >
<h1> Share Buy/Sell Calculator Cum Transaction Entry </h1>
<br><br>
  
  
<br><br>
   <label for="fname">Company name</label><br><br>
  <select name="fname" id="fname" class="Ddown" >
    <%  while(resultset.next()){ %>
        <option value="<%= resultset.getString("COMPANY_NAME")%>"><%= resultset.getString("COMPANY_NAME")%></option>
     <% } %>
</select>
<br><br>
  
  
  <label for="buyprice">Current Share Price</label>
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