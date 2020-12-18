package demojdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExCallable {

	public static void main(String[] args) {
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
	
		int prid;
		String prname;
		Scanner kb =new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ose","system","Tanu#1234");
			System.out.println("Connection established successfully");
			smt= con.createStatement();
			smt.execute(" insert into product values(4, 'mouse')");
			System.out.println("entered");
			CallableStatement csmt= con.prepareCall("{call getProductName(?, ?)}");
			csmt.setInt(1, 4);
			csmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			csmt.executeUpdate();
			String uname=csmt.getString(2);
			System.out.println(uname);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
			if(smt!=null)
			{
				smt.close();}
			if(con!=null)
			{
				con.close();
			}
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
			}
		
		
	}
}

/*CREATE OR REPLACE PROCEDURE getProductName (prd_no IN NUMBER, prd_name OUT
 VARCHAR2) AS BEGIN SELECT name INTO prd_name FROM Product WHERE id = prd_no;
 END;*/
