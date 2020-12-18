package assign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		
		ProductOperation po =new ProductOperation();
		ArrayList<Product> pr1 = new ArrayList<>();
		pr1=po.FetchProductDetails();
	}

}
