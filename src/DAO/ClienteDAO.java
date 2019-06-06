
package DAO;

import java.sql.Connection;
import Models.Cliente;

public class ClienteDAO {
    
    private Connection conn;
    
    public ClienteDAO(){
        conn = new connection().getConexao();
    }
    
    public void inserir(Cliente cliente){
        String sql = "";
        try{
            
        }catch(Exception Erro){
            throw new RuntimeException("ERRO 2" + Erro);
        }
    
    }
    
}
