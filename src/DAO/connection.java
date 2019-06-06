
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
     public Connection getConexao(){
     try {
        return DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
     }catch (SQLException erro){
        throw new RuntimeException("Erro 1" + erro);
     
     }
     }
}
    
    
    

