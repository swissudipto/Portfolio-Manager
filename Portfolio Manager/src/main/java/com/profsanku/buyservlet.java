package com.profsanku;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

public class buyservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	      PrintWriter out = response.getWriter();
	      DBClass db=new DBClass();
	      Date date = null;
	      String Date1 = null;
	      SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MMM-dd");  

	     //Double Name= Double.parseDouble(request.getParameter("Finalcost"));
	      Double FinalCost=Double.parseDouble(request.getParameter("Totalcost"));
	      Date1=request.getParameter("Buydate");
	      //date= formatter2.parse(request.getParameter("Buydate"));
		String Sname=request.getParameter("Cname");
		int Quantity=Integer.parseInt(request.getParameter("Quantity"));
		Double Sprice=Double.parseDouble(request.getParameter("Bprice"));
		Double TotalInvested=Double.parseDouble(request.getParameter("Tmoney"));
		Double TotalCharge=Double.parseDouble(request.getParameter("Totalcharges"));
		String Tmode=request.getParameter("Mode");


		db.initialize(Sname, Quantity, Sprice, TotalCharge, TotalInvested, FinalCost,Date1,Tmode);
	      try {
			DBClass.initializeDatabase();
			out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println(e);
			e.printStackTrace();
		}
		
	
	}

}
