
package DAO;

import java.sql.Connection;
import Models.Paciente;
import java.sql.PreparedStatement;

public class PacienteDAO {
    
    private final Connection conn;
    private PreparedStatement stmt;
    
    public PacienteDAO(){
        conn = new connection().getConexao();
    }

    public void inserir(Paciente paciente){
        String sql = "INSERT INTO Pciente(nome,endereco,cpf,telefone)VALUES (?,?,?,?,?)";
        try{
            stmt = conn.prepareStatement(sql);
           // stmt.setInt(1,paciente.getId());
            stmt.setString(2,paciente.getNome());
            stmt.setString(3,paciente.getEndereço());
            stmt.setString(4,paciente.getCpf());
            stmt.setString(5,paciente.getTelefone());
            stmt.execute();
            stmt.close();
        }catch(Exception Erro){
            throw new RuntimeException("ERRO 2" + Erro);
        }
    
    }
    
}
