package com.employee_work;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeUtility {

	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/employee_directory";
	private static final String USER = "employees";
	private static final String PASSWORD = "mypassword";

	public static boolean getEmployees() {
		Connection con = null;
		CallableStatement call = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			call = con.prepareCall("{CALL getAllEmployees()}");
			rs = call.executeQuery();
			while (rs.next())
				System.out.println(rs.getString(2) + " " + rs.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close(con, call, rs);
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

		return true;
	}

	public static void getUserPassword() {
		String q = "{CALL getPassword()}";

		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				CallableStatement call = con.prepareCall(q)) {

			ResultSet rs = call.executeQuery();
			while (rs.next())
				System.out.println(rs.getString(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean getId() { // IN example
		String q = "{CALL getId(?)}";

		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				CallableStatement call = con.prepareCall(q)) {

			call.setInt(1, 1);

			ResultSet rs = call.executeQuery();

			while (rs.next())
				System.out.println(rs.getString(2));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;
	}

	public static int getUserCount() { // OUT example
		int ans = 0;
		String q = "{CALL getIdCounts(?)}";

		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				CallableStatement call = con.prepareCall(q)) {

			call.registerOutParameter(1, java.sql.Types.INTEGER);
			call.execute();
			ans = call.getInt(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ans;
	}

	public static void getINOUTExample() {

		String q = "{CALL get_user_count(?)}";

		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
				CallableStatement call = con.prepareCall(q)) {

			call.registerOutParameter(1, java.sql.Types.INTEGER);
			call.setInt(1, 10);
			call.execute();
			System.out.println(call.getInt(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getMetaData() {
		try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);) {
			DatabaseMetaData dm = con.getMetaData();
			ResultSet resultSet = dm.getTables("employee_directory", null, null, new String[] { "TABLE" });
			System.out.println("Printing TABLE_TYPE \"TABLE\" ");
			System.out.println("----------------------------------");
			while (resultSet.next())
				System.out.println(resultSet.getString("TABLE_NAME"));

			ResultSet rs = dm.getColumns("employee_directory", null, null, null);
			while (rs.next()) {
				String columnName = rs.getString("COLUMN_NAME");
				String datatype = rs.getString("DATA_TYPE");
				String columnsize = rs.getString("COLUMN_SIZE");
				String decimaldigits = rs.getString("DECIMAL_DIGITS");
				String isNullable = rs.getString("IS_NULLABLE");
				String is_autoIncrment = rs.getString("IS_AUTOINCREMENT");
				// Printing results
				System.out.println(columnName + "---" + datatype + "---" + columnsize + "---" + decimaldigits + "---"
						+ isNullable + "---" + is_autoIncrment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void close(Connection con, CallableStatement call, ResultSet rs) throws SQLException {
		if (rs != null)
			rs.close();
		if (call != null)
			call.close();
		if (con != null)
			con.close();
	}

}
