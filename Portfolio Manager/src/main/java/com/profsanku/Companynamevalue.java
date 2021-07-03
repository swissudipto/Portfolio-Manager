package com.profsanku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Companynamevalue{
	public List<Companynamemodel> list() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  List<Companynamemodel> listCompanynamemodel = new ArrayList<>();
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mindpalace","root","cmc123")) {
            String sql = "SELECT D.COMPANY_NAME FROM company_master D ORDER BY D.COMPANY_NAME";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                String Cname = result.getString("COMPANY_NAME");
                Companynamemodel Companynamemodel = new Companynamemodel(Cname);
                     
                listCompanynamemodel.add(Companynamemodel);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }   
		
		return null;
	
	}

}
