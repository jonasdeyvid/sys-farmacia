package tests;

import DAO.connection;
import java.sql.Connection;
import java.sql.SQLException;
import utils.JDBCUtils;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
             Connection connection = new connection().getConexao();
		JDBCUtils jdbcutils = new JDBCUtils();
                System.out.println(" Conexão aberta ");
                connection.close();
		jdbcutils.getConnection();
	}
	
}