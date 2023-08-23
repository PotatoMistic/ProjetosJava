package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	public static Connection con = null;

	public static Connection getConnection() {
		if (con == null) {
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				con = DriverManager.getConnection(url, props);

			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}

		return con;

	}

	public static void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	public static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);

			return props;
		} catch (IOException E) {
			throw new DbException(E.getMessage());
		}
	}

	public static void closeStatement(Statement e) {
		if (e != null) {
			try {
				e.close();
			} catch (SQLException x) {
				throw new DbException(x.getMessage());

			}
		}
	}

	public static void closeResultSet(ResultSet e) {
		if (e != null) {
			try {
				e.close();
			} catch (SQLException x) {
				throw new DbException(x.getMessage());

			}
		}
	}



}
