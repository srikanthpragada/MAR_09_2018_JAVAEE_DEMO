package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateJob2 {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter job id     : ");
			String id = s.nextLine();

			System.out.print("Enter min salary : ");
			String minsal = s.nextLine();

			PreparedStatement ps = con.prepareStatement
					("update jobs set min_salary = ? where job_id = ?");
			ps.setString(1, minsal);
			ps.setString(2, id);

			int count = ps.executeUpdate();

			System.out.printf("Updated %d row(s)!\n", count);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
