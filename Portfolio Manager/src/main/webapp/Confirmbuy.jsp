<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>


<form class="login-form2"  action="buy">
		<div>Company Name</div>
		<%
     String vale9 = (String) request.getAttribute("Cname" ) ;
     %>
		<input type="text" id="Cname" name="Cname" value=<%out.println( vale9 );%> >
		<div>Share price</div>
		<%
		double vale10 = (double) request.getAttribute("Bprice" ) ;
     %>
		<input type="text" id="Bprice" name="Bprice" value=<%out.println( vale10 );%> >
		<div>No of Shares</div>		
		<%
     int vale11 = (int) request.getAttribute("Quantity" ) ;
     %>
		<input type="text" id="Quantity" name="Quantity" value=<%out.println( vale11 );%> >
        <div>Total Buying Price</div>
        <div><%
     double vale12 = (double) request.getAttribute("Tmoney" ) ;
     %></div>
       <input type="text" id="Tmoney" name="Tmoney" value=<%out.println( vale12 );%> >
        <div>Brokage</div>
        <div><%
     double vale = (double) request.getAttribute("Brokage" ) ;
     %></div>
      <input type="text" id="Brokage" name="Brokage" value=<%out.println( vale );%> >
        <div>STT Charges</div>
        <div><%
     double vale1 = (double) request.getAttribute("STTCharges" ) ; 
     %></div>
      <input type="text" id="StampDuty" name="STTCharges" value=<%out.println( vale1 );%> >
        <div>Exchange Txn Charges </div>
        <div><%
     double vale2 = (double) request.getAttribute("ExchangeTxnCharges" ) ; 
      %></div>
       <input type="text" id="ExchangeTxnCharges" name="ExchangeTxnCharges" value=<%out.println( vale2 );%> >
        <div>SEBI Charges  </div>    
        <div><%
     double vale3 = (double) request.getAttribute("SEBICharges" ) ; 
     %></div> 
      <input type="text" id="SEBICharges" name="SEBICharges" value=<%out.println( vale3 );%> >  
        <div>Stamp Duty  </div>
        <div><%
     double vale4 = (double) request.getAttribute("StampDuty" ) ; 
      %></div>
      <input type="text" id="StampDuty" name="StampDuty" value=<%out.println( vale4 );%> >
        <div>Gst   </div>
        <div><%
     double vale5 = (double) request.getAttribute("gst" ) ; 
      %></div>
      <input type="text" id="gst" name="gst" value=<%out.println( vale5 );%> >
        <div>Dp Charge  </div>
        <div><%
     double vale6 = (double) request.getAttribute("Dpcharge" ) ; 
      %></div>
      <input type="text" id="Dpcharge" name="Dpcharge" value=<%out.println( vale6 );%> >
        <div>Total Charges </div>
        <div><%
     double vale7 = (double) request.getAttribute("Totalcharges" ) ; 
      %>
      <input type="text" id="Totalcharges" name="Totalcharges" value=<%out.println( vale7 );%> ></div>
        <div>Final Cost </div>
        <div ><%
     double vale8 = (double) request.getAttribute("Totalcost" ) ;
     %>
      <input type="text" id="Totalcost" name="Totalcost" value=<%out.println( vale8 );%> >
      </div>
      
     <label for="Buydate">Buy date</label>
	<input type="date" id="Buydate" name="Buydate">

	<input type="submit" value="Confirm Buy">


    </form>






</body>
</html>