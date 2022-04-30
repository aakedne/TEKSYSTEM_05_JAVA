package javajdbcConnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
	String driverClassName="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/classicmodels";
	String user = "root";
	String pass = "Ak1234567890@";
	
	private static FactoryConnection factoryConnection = null;
	
	// use constructor

	private FactoryConnection() {
		try {
			Class.forName(driverClassName);
		}catch(ClassNotFoundException e) {
		System.out.println("Exception in FactoryConnection class ");
			e.printStackTrace();
		}
		}
		public Connection getConnection() throws SQLException {
			Connection conn = null;
			conn = DriverManager.getConnection(url, user, pass);
			return conn;
	}
		public static FactoryConnection getInstance() {
			if(factoryConnection == null ) {
				factoryConnection = new FactoryConnection();
			}
			return factoryConnection;
		}
	}
