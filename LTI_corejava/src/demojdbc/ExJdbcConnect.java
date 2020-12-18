package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExJdbcConnect {

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
			smt.execute(" insert into products values(2, 'mouse', 500, 7)");
			/*System.out.println("enter the id you want to enter");
			prid= kb.nextInt();
			System.out.println("enter the name you want to enter");
			prname= kb.next();
			smt.executeUpdate("Update product set name= '"+prname+"' where id ="+prid);*/
			rs=smt.executeQuery("select * from products");
			while (rs.next()){
				System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("price")+" "+rs.getString("stock"));
			}
			System.out.println("done");
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

