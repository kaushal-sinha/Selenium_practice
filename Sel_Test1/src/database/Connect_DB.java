package database;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Connect_DB  {
  @Test
 public static void main(String[] args) throws ClassNotFoundException,SQLException {
	  
	  Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Test","test");  
		  
		//step3 create the statement object  
		Statement stmt=con.createStatement();  
		  
		//step4 execute query  
		ResultSet rs=stmt.executeQuery("select * from Test");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		  
		//step5 close the connection object  
		con.close();
  }
}
