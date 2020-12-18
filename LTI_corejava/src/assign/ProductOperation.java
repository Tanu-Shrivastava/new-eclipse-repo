package assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductOperation {

	ArrayList<Product> FetchProductDetails(){
		ArrayList<Product> pr =new ArrayList<>();	
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
			rs=smt.executeQuery("select * from product");
			while (rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
			catch (ClassNotFoundException e) {
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
		
		
		return pr;
	}
	
}
