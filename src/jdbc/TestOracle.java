package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestOracle {

	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"))
		{
			System.out.println("Connected Using Thin driver");
			// process 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
