package com.profsanku;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class investmententryservlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
	      PrintWriter out = response.getWriter();

		String invdate=request.getParameter("Investeddate");
		Double invamount=Double.parseDouble(request.getParameter("Investedamt"));
		
		
		DBClass DB=new DBClass();
		DB.initializeforinvestmententry(invdate,invamount);
		
		try {
			DBClass.initializeDatabaseforinvestmententry();
			out.print("Successfully feeded");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print("Failed :"+e);
		}


		
		
	}

}
