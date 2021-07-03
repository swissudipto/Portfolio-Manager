package com.profsanku;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Buysellservlet  extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		
		DBClass DB =new DBClass();
		try {
			List<Companynamemodel> listCompanynamemodel=DB.list();
			request.setAttribute("listCompanynamemodel",listCompanynamemodel);
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp"); 
			rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
