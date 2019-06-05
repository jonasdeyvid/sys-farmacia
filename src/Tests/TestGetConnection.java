package tests;

import java.sql.SQLException;

import utils.JDBCUtils;

public class TestGetConnection {

	public static void main(String[] args) throws SQLException {
		JDBCUtils jdbcutils = new JDBCUtils();
		jdbcutils.getConnection();
	}
	
}