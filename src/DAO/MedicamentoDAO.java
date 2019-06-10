
package DAO;

import Models.Medicamento;
import Util.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MedicamentoDAO {
    private JDBCUtils jdbc = new JDBCUtils();
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private List<Medicamento> medicamentos = new ArrayList<Medicamento>();

    

     public void add(Medicamento medicamento) throws SQLException {
        conn = jdbc.getConnection();
        String sql = "INSERT INTO medicamento(nome, descricao,laboratorio, preco, quantidade)VALUES (?,?,?,?,?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, medicamento.getNome());
        stmt.setString(2, medicamento.getdescricao());
        stmt.setString(3, medicamento.getLaboratorio());
        stmt.setDouble(4, medicamento.getPreco());
        stmt.setInt(5,  medicamento.getQuantidade());
        stmt.execute();
        stmt.close();

    

  }
     public void update(Medicamento medicamento) throws SQLException {

        conn = jdbc.getConnection();
        String sql = "UPDATE medicamento SET nome = ?, descricao = ?, laboratorio  = ?, preco = ?, quantidade = ? WHERE codigo = ? ";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, medicamento.getNome());
        stmt.setString(2, medicamento.getdescricao());
        stmt.setString(3, medicamento.getLaboratorio());
        stmt.setDouble(4, medicamento.getPreco());
        stmt.setInt(5, medicamento.getQuantidade());
        stmt.execute();
        stmt.close(); 
     
     
}
     
     public void delete(Medicamento medicamento) throws SQLException {

        conn = jdbc.getConnection();
        String sql = "DELETE FROM medicamento WHERE codigo = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, medicamento.getCodigo());
        stmt.execute();
        stmt.close();
     
     
     
}
     
      public List<Medicamento> listAll() throws SQLException {

        conn = jdbc.getConnection();
        String sql = "SELECT * FROM medicamento";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Medicamento medicamento = new Medicamento();
            medicamento.setCodigo(rs.getInt("codigo"));
            medicamento.setNome(rs.getString("nome"));
            medicamento.setdescricao(rs.getString("descricao"));
            medicamento.setLaboratorio(rs.getString("laboratorio"));

            medicamentos.add(medicamento);
        }

        return medicamentos;
}
}
