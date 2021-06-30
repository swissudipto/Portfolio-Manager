package com.profsanku;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class investmentshowservlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
	

		 try {
				DBClass.initializeDatabaseforinvestmentshow();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.print("Failed :"+e);
			}

		 
		 String Totinvestedamount=DBClass.getTotinvestedamount();
		 
		 request.setAttribute("Totinvestedamount",Totinvestedamount);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("investmentshow.jsp");  
	      rd.forward(request, response);
		 
		
	}
}
