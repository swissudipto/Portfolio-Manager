package com.profsanku;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    static String Totinvestedamount;  
    static String mode;
    static int count;
   
	static double Shareprice_live;
	static int  NoofShares_live;
    static double Totalinvested_live;



    
    void  initialize(String Sname,int Quantity,double Sprice,double Addcharges,double Tinvested,double Fcost,String Date,String Tmode)
    {
    	 Shareprice=Sprice;
    	NoofShares=Quantity;
       Totalcharges=Addcharges;
        Finalcost=Fcost;  
        Totalinvested=Tinvested;
        Sharename=Sname;
        Buydate=Date;
        mode=Tmode;
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
         rs.close();
 		

        String SQL = "INSERT INTO stock_transaction(SL,Stock_name,per_share_price,qantity,total_cost,final_cost,buying_date,Total_additional_cost,TRANSACTION_MODE) values("+(SL+1)+",'"+Sharename+"',"+Shareprice+","+NoofShares +","+Totalinvested+","+Finalcost+",'"+Buydate+"',"+Totalcharges+",'"+mode+"');";
		stat.executeUpdate(SQL);
		
		
		String SQL2="SELECT COUNT(*) count FROM live_portfolio_deatils U WHERE U.Sharename='"+Sharename+"'";
		ResultSet rs1=stat.executeQuery(SQL2);
		  while(rs1.next())
	         {
			  count=Integer.parseInt(rs1.getString("count"));
	                
	         }
		  rs1.close();
		  
		  if(count==0)
		  {
			  String SQL3="INSERT INTO live_portfolio_deatils(Sharename,quantity,per_share_price,total_invested) values('"+Sharename+"',"+NoofShares+","+Shareprice+","+Totalinvested+");";
			  stat.executeUpdate(SQL3);
		  }
		  else if(count==1)
		  {
			  String SQL4="SELECT Y.quantity,Y.per_share_price,Y.total_invested FROM live_portfolio_deatils Y WHERE Y.Sharename='"+Sharename+"'"; 
			  ResultSet rs2=stat.executeQuery(SQL4);
			  while(rs2.next())
			  {
				  Shareprice_live=Double.parseDouble(rs2.getString("per_share_price"));
				  NoofShares_live=Integer.parseInt(rs2.getString("quantity"));;
				  Totalinvested_live=Double.parseDouble(rs2.getString("total_invested"));
			  }
			  rs2.close();
			  String  SQL5="UPDATE live_portfolio_deatils R SET R.quantity=R.quantity+"+NoofShares+",R.per_share_price=("+Totalinvested_live+"+"+Totalinvested+")/("+NoofShares_live+"+"+NoofShares+"),R.total_invested=R.total_invested+"+Totalinvested+" WHERE R.Sharename='"+Sharename+"'";
			  System.out.println("SQL5"+SQL5);
			  stat.executeUpdate(SQL5);

			  
		  }
		 
		  
        
 		 
 
 		
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
	 public static Connection  initializeDatabaseforinvestmentshow() throws SQLException
	 {
		 try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindpalace","root","cmc123");
	 		Statement stat=con.createStatement(); 
	 		String SQL="SELECT SUM(L.Invested_amount) TOTINVAMT FROM investmentdtls L;";
	 		ResultSet rs=stat.executeQuery(SQL);
	 		while(rs.next())
	         {
	 			Totinvestedamount=rs.getString("TOTINVAMT");
	                
	         }
	 		
		return null;
	 }


	public static String getTotinvestedamount() {
		return Totinvestedamount;
	}
	
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
                //System.out.println("Company name:"+Cname);
                Companynamemodel Companynamemodel = new Companynamemodel(Cname);
                     
                listCompanynamemodel.add(Companynamemodel);
            }
            
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }   
		System.out.println("Whole Company name list:");
		return listCompanynamemodel;
	
	}


	
	 


}
