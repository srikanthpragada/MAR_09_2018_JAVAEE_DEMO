package jdbc;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

import oracle.jdbc.rowset.OracleFilteredRowSet;

public class FilterDemo {

	static class CostlyEmployees implements Predicate {
		@Override
		public boolean evaluate(RowSet rs) {
			try {
				int salary = rs.getInt("salary");
				return salary > 10000;
			} catch (Exception ex) {
				return false;
			}
		}

		@Override
		public boolean evaluate(Object arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean evaluate(Object arg0, String arg1) throws SQLException {
			// TODO Auto-generated method stub
			return false;
		}

	}

	public static void main(String[] args) throws Exception {

		OracleFilteredRowSet rs = new OracleFilteredRowSet();
		rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		rs.setUsername("hr");
		rs.setPassword("hr");
		rs.setCommand("select * from employees");
		rs.execute();
		
        // Select employees with salary > 10000
		rs.setFilter(new CostlyEmployees());

		while (rs.next()) {
			System.out.println(rs.getString("first_name") + " - " + rs.getString("salary"));
		}

		
		System.out.println("All Employees\n");
		rs.setFilter(null); // Remove filter and select all employees
		rs.beforeFirst();
		
		while (rs.next()) {
			System.out.println(rs.getString("first_name") + " - " + rs.getString("salary"));
		}
	}

}
