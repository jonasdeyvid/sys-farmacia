
package DAO;

import java.sql.Connection;
import Models.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PacienteDAO {
    
    private final Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList <Paciente> lista = new ArrayList<Paciente>();
    
    public PacienteDAO(){
        conn = new connection().getConexao();
    }

    public void inserir(Paciente paciente){
        String sql = "INSERT INTO Pciente(nome,endereco,cpf,telefone)VALUES (?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,paciente.getNome());
            stmt.setString(2,paciente.getEndereço());
            stmt.setString(3,paciente.getCpf());
            stmt.setString(4,paciente.getTelefone());
            stmt.setString(5,paciente.getEmail());
            stmt.execute();
            stmt.close();
        }catch(Exception Erro){
            throw new RuntimeException("ERRO 2" + Erro);
        }
    
    }
    
    
      public void alterar(Paciente paciente){
        String sql = "UPDATE paciente SET id = ?, nome = ?,  ";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,paciente.getId());
            stmt.setString(2,paciente.getNome());
            stmt.setString(3,paciente.getEndereço());
            stmt.setString(4,paciente.getCpf());
            stmt.setString(5,paciente.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(Exception Erro){
            throw new RuntimeException("ERRO 3" + Erro);
    
}
      }
      
        public void exlcuir(Paciente paciente){
        String sql = "DELETE FROM ";
        try{
            st = conn.prepareStatement(sql);
            st.execute(sql);
            st.close();
        }catch(Exception Erro){
            throw new RuntimeException("ERRO 4" + Erro);
  
        }
        }
        
        public ArrayList<Paciente> ListarTodos(){
            
         String sql = "SELECT FROM paciente ";
            try {
                
                
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt(""));
                paciente.setNome(rs.getString(""));
                paciente.setEndereço(rs.getString(""));
                paciente.setCpf(rs.getString(""));
                paciente.setTelefone(rs.getString(""));
                paciente.setEmail(rs.getString(""));
                lista.add(paciente);
      }
            } catch (Exception erro) {
                throw new RuntimeException("erro 5 "+ erro);
            }
            return lista;
        }
}
