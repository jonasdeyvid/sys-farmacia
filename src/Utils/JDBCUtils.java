package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {

	public Connection getConnection() throws SQLException {
		try {		
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost/escolinha", "root", "123");	
			return con;	
		} catch (SQLException e) {
			System.out.println("Erro ao estabelecer conexão:\n");
			System.out.println(e.getMessage());
			return null;
		} finally {
			System.out.println("Finalizado.");
		}
		
	}
}
