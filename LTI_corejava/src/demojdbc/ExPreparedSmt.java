package demojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExPreparedSmt {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement psmt=null;
		ResultSet rs=null;
		int prid;
		String prname;
		Scanner kb =new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ose","system","Tanu#1234");
			System.out.println("Connection established successfully");
			psmt= con.prepareStatement("insert into products values(?,?,?,?)");
		psmt.setInt(1, 3);
		psmt.setString(2, "tv");
		psmt.setInt(3, 5000);
		psmt.setInt(4, 10);
		psmt.execute();
		psmt.setInt(1, 4);
		psmt.setString(2, "keyboard");
		psmt.setInt(3, 1000);
		psmt.setInt(4, 6);
		psmt.execute();
		
		
		rs=psmt.executeQuery("select * from products");
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
			if(psmt!=null)
			{
				psmt.close();}
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


