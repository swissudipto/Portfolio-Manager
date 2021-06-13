package com.profsanku;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.math.*;


class additional{
	  

	double Shareprice;
      double NoofShares;
	  double Brokage;
      double STTCharges;
      double ExchangeTxnCharges;
      double SEBICharges;
      double StampDuty;
      double gst;
      double Dpcharge;
      double Totalcharges;
      double Totalcost;  
      String Transmode;
      double Totalinvested;
	
	 void initialise(double Sprice,double Qantity,String Mode)
	 {
		 Shareprice=Sprice;
		 NoofShares=Qantity;
		 Transmode=Mode;		 		 
		 
	 }
	 
	 void calculate()
	 {
		 Totalinvested=Shareprice*NoofShares;
		 Brokage=Totalinvested*0.0005;
		 STTCharges=Math.round(Totalinvested*0.001);
		 ExchangeTxnCharges=Totalinvested*0.0000345;
		 SEBICharges=Totalinvested*0.0000005;
		 
		 if (SEBICharges<=0.01)
		 {
			 SEBICharges=0.01;
		 }
		 
		 Transmode=Boolean.toString(Transmode.equals("Buy"));
		 if (Transmode=="true")
		 {
			 StampDuty=Math.round(Totalinvested*0.00015)  ;
		 }
		 else
		 {
			 StampDuty=0; 
		 }
		 gst=(Brokage+ExchangeTxnCharges)*0.18;
		 Dpcharge=15.93;
		 Totalcharges=Brokage+STTCharges+ExchangeTxnCharges+SEBICharges+StampDuty+gst;
		 Totalcost=Totalinvested+Totalcharges;
	 }
	 
	 public double getBrokage() {
			return Brokage;
		}

		public double getSTTCharges() {
			return STTCharges;
		}

		public double getExchangeTxnCharges() {
			return ExchangeTxnCharges;
		}

		public double getSEBICharges() {
			return SEBICharges;
		}

		public double getStampDuty() {
			return StampDuty;
		}

		public double getGst() {
			return gst;
		}

		public double getDpcharge() {
			return Dpcharge;
		}

		public double getTotalcharges() {
			return Totalcharges;
		}

		public double getTotalcost() {
			return Totalcost;
		}
		public double getTotalinvested() {
			return Totalinvested;
		}
		public String getmode() {
			return Transmode;
		}
	 
	 
	
}





// Extend HttpServlet class
public class godmodeservlet extends HttpServlet {
	

 
   public void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	   
	   String Cname=request.getParameter("fname");
	   double Sprice=Double.parseDouble(request.getParameter("buyprice"));
	   int Qantity =Integer.parseInt(request.getParameter("Quantity"));
	   String Mode = request.getParameter("Mode");

	  //Double Tmoney=Sprice*Qantity;
      PrintWriter out = response.getWriter();
      
      additional ad=new additional();
      ad.initialise(Sprice,Qantity,Mode);
      ad.calculate();
      
      
      double Brokage=ad.getBrokage();
      double STTCharges=ad.getSTTCharges();
      double ExchangeTxnCharges=ad.getExchangeTxnCharges();
      double SEBICharges=ad.getSEBICharges();
      double StampDuty=ad.getStampDuty();
      double gst=ad.getGst();
      double Dpcharge=ad.getDpcharge();
      double Totalcharges=ad.getTotalcharges();
      double Totalcost=ad.getTotalcost();
      double Tmoney=ad.getTotalinvested();
      
      String Transmode=ad.getmode();

    
      request.setAttribute("Cname",Cname);
      request.setAttribute("Bprice",Sprice);
      request.setAttribute("Quantity",Qantity);
      
      request.setAttribute("Brokage",Brokage);
      request.setAttribute("STTCharges",STTCharges);
      request.setAttribute("ExchangeTxnCharges",ExchangeTxnCharges);

      request.setAttribute("SEBICharges",SEBICharges);
      request.setAttribute("StampDuty",StampDuty);
      request.setAttribute("gst",gst);

      request.setAttribute("Dpcharge",Dpcharge);
      request.setAttribute("Totalcharges",Totalcharges);
      request.setAttribute("Totalcost",Totalcost);
      
      request.setAttribute("Tmoney",Tmoney);  
      
      

     
      
      RequestDispatcher rd=request.getRequestDispatcher("Calpage.jsp");  
      rd.forward(request, response);  
     
   }

  
}