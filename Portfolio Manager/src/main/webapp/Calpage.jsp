<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculated</title>
<style type="text/css">
html, body {
  width: 100%;
  height:100%;
}

body {
    background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
    background-size: 400% 400%;
    animation: gradient 15s ease infinite;
}

@keyframes gradient {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}
table, th, td {
  border: 1px solid black;
}
	</style>
</head>
<body>

<h1>Stock Name:<%
     String vale9 = (String) request.getAttribute("Cname" ) ;
      out.println( vale9 ) ;%></h1>
      
<h2>Current Market Value of<%
		out.println(" "+vale9+" : ");
     double vale10 = (double) request.getAttribute("Bprice" ) ;
     int vale11 = (int) request.getAttribute("Quantity" ) ;
      out.println( vale10 ) ;%> <br>  Number of Shares: <%out.println( vale11 ); %></h2>      


<table style="width:100%">
  <tr>
    <td><b>Parameter</b></td>
    <td ><b>Amount</b></td>  
  </tr>
  <tr>
    <td><%String vale13 = (String) request.getAttribute("LebelBeforetax");
    out.println( vale13 ) ;%></td>
    <td> <%
     double vale12 = (double) request.getAttribute("Tmoney" ) ;
      out.println( vale12 ) ;%></td>
  </tr>
  
  <tr>
    <td>Brokage</td>
    <td> <%
     double vale = (double) request.getAttribute("Brokage" ) ;
      out.println( vale ) ;%></td>
  </tr>
  <tr>
    <td>STT Charges</td>
    <td><%
     double vale1 = (double) request.getAttribute("STTCharges" ) ; 
      out.println( vale1 ) ;%></td>
  </tr>
    <tr>
    <td>ExchangeTxn Charges</td>
    <td><%
     double vale2 = (double) request.getAttribute("ExchangeTxnCharges" ) ; 
      out.println( vale2 ) ;%></td>
  </tr>
  <tr>
    <td>SEBI Charges</td>
    <td><%
     double vale3 = (double) request.getAttribute("SEBICharges" ) ; 
      out.println( vale3 ) ;%></td>
  </tr>
  <tr>
    <td>Stamp Duty</td>
    <td><%
     double vale4 = (double) request.getAttribute("StampDuty" ) ; 
      out.println( vale4 ) ;%></td>
  </tr>
  <tr>
    <td>GST</td>
    <td><%
     double vale5 = (double) request.getAttribute("gst" ) ; 
      out.println( vale5 ) ;%></td>
  </tr>
  <tr>
    <td>Dp charge</td>
    <td><%
     double vale6 = (double) request.getAttribute("Dpcharge" ) ; 
      out.println( vale6 ) ;%></td>
  </tr>
  <tr>
    <td>Total additional Charges</td>
    <td><%
     double vale7 = (double) request.getAttribute("Totalcharges" ) ; 
      out.println( vale7 ) ;%></td>
  </tr>
  <tr>
    <td><%String vale14 = (String) request.getAttribute("LebelAftertax");
    out.println( vale14 ) ;%></td>
    <td><%
     double vale8 = (double) request.getAttribute("Totalcost" ) ; 
      out.println( vale8 ) ;%></td>
  </tr>
</table>

</body>
</html>