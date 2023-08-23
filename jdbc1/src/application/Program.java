package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = DB.getConnection();
			st = con.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("name"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}

}
