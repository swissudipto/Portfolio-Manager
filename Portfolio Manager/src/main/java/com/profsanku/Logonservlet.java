package com.profsanku;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logonservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	      PrintWriter out = response.getWriter();

		
		 String User=request.getParameter("uname");
		 String Password=request.getParameter("pward");
		
		additional ad=new additional();
		
		ad.initialiseDBparameter(User);


		
		
		try {
			additional.initializeDatabase();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	

		if(Password.equals(ad.getPassword())) {
			
			response.sendRedirect("index.jsp"); 
		}
		else
		{
			request.setAttribute("ErrorMSG", "User name or password is Wrong ");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
		      rd.forward(request, response);
		


		}

	
	}

}
