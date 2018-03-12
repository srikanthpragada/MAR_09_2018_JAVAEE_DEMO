package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateJob {

	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"))
		{

		  Statement st = con.createStatement();
		  int count = st.executeUpdate("update jobs set min_salary = 5000 where job_id = 'IT_PROG'");
		  System.out.printf("Updated %d row(s)!\n", count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
