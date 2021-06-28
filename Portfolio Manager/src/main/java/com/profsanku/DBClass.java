package com.profsanku;

import java.sql.*;

public class DBClass {
	private static final String Sname = null;
	static double Shareprice;
	static int  NoofShares;
    static double Totalcharges;
    static double Finalcost;  
    static double Totalinvested;
    static String Sharename;
    static String Buydate;
    static int SL;
    static int SL1;
    static String invdate;
    static double invamount;  


    
    void  initialize(String Sname,int Quantity,double Sprice,double Addcharges,double Tinvested,double Fcost,String Date)
    {
    	 Shareprice=Sprice;
    	NoofShares=Quantity;
       Totalcharges=Addcharges;
        Finalcost=Fcost;  
        Totalinvested=Tinvested;
        Sharename=Sname;
        Buydate=Date;
    }
    
    
	 public static Connection  initializeDatabase() throws SQLException
 	 {
 	 try {
 		Class.forName("com.mysql.jdbc.Driver");
 		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindpalace","root","cmc123");
 		 

 		String User = null;
 		 
 		Statement stat=con.createStatement();
 		String SQL1="SELECT IFNULL(MAX(J.SL),0) SL FROM stock_transaction J;";
 		
 		 ResultSet rs=stat.executeQuery(SQL1);
         
 		 
         while(rs.next())
         {
        	 SL=Integer.parseInt(rs.getString("SL"));
                
         }
 		

        String SQL = "INSERT INTO stock_transaction(SL,Stock_name,per_share_price,qantity,total_cost,final_cost,buying_date,Total_additional_cost) values("+(SL+1)+",'"+Sharename+"',"+Shareprice+","+NoofShares +","+Totalinvested+","+Finalcost+",'"+Buydate+"',"+Totalcharges+");";
		stat.executeUpdate(SQL);
        
 		 
 
 		
 	 }
 		 
 	
 	 catch(ClassNotFoundException ex)
 	 {
 		System.out.println("Database Connection Failed "+ex);
 	 }
	return null;
 	
 	
 	 }
	 void  initializeforinvestmententry(String investmentdate,double investmentmount)
	 {
		 invdate=investmentdate;
		 invamount=investmentmount;
		 
	 }
	 public static Connection  initializeDatabaseforinvestmententry() throws SQLException
	 {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindpalace","root","cmc123");
 		Statement stat=con.createStatement();
 		String SQL1="SELECT IFNULL(MAX(J.SL),0) SL FROM Investmentdtls J;";
 		
 		 ResultSet rs=stat.executeQuery(SQL1);
         
 		 
         while(rs.next())
         {
        	 SL1=Integer.parseInt(rs.getString("SL"));
                
         }
         
         String SQL = "INSERT INTO Investmentdtls(SL,Invested_amount,Investment_date) values("+(SL1+1)+","+invamount+",'"+invdate+"')";
 		stat.executeUpdate(SQL);
 		 
 		 
 		 
			return null;
 
	 }


}
