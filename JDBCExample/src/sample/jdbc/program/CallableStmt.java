package sample.jdbc.program;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableStmt {

		// JDBC URL, username and password of MySQL server
	    private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";
	    
	    private static Connection con;
	    private static CallableStatement stmt;
		   
		public static void main(String[] args) {
		   
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      con = DriverManager.getConnection(url, user, password);

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      
		      String sql = "{call update_price (?, ?)}";
		      stmt = con.prepareCall(sql);
		      
		      //Bind IN parameter first, then bind OUT parameter
		      String isbn = "003";
		      stmt.setString(1, isbn); 
		      
		      int price = 2000;
		      stmt.setInt(2, price); 	      
		      
		      //Use execute method to run stored procedure.
		      System.out.println("Executing stored procedure..." );
		      stmt.executeUpdate();
		      
		      stmt.close();
		      con.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(con!=null)
		            con.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
      //end 
}
