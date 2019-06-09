
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {
     public Connection getConexao(){
     try {
         JOptionPane.showMessageDialog(null, "Conectado");
        return DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
     }catch (SQLException erro){
        throw new RuntimeException(erro);
     
     }
     }
}
    
    
    

