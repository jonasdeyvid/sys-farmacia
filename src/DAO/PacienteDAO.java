package DAO;

import Util.JDBCUtils;
import Models.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    private JDBCUtils jdbc = new JDBCUtils();
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private List<Paciente> pacientes = new ArrayList<Paciente>();

    

    public void add(Paciente paciente) throws SQLException {
        conn = jdbc.getConnection();
        String sql = "INSERT INTO paciente(nome, cpf, data_nascimento)VALUES (?,?,?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, paciente.getCpf());
        stmt.setString(3, paciente.getDataNascimento());
        stmt.execute();
        stmt.close();

    }

    public void update(Paciente paciente) throws SQLException {

        conn = jdbc.getConnection();
        String sql = "UPDATE paciente SET nome = ?, cpf = ?, data_nascimento = ? WHERE codigo = ? ";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, paciente.getNome());
        stmt.setString(2, paciente.getCpf());
        stmt.setString(3, paciente.getDataNascimento());
        stmt.setInt(4, paciente.getCodigo());
        stmt.execute();
        stmt.close();

    }

    public void delete(Paciente paciente) throws SQLException {

        conn = jdbc.getConnection();
        String sql = "DELETE FROM paciente WHERE codigo = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, paciente.getCodigo());
        stmt.execute();
        stmt.close();

    }

    public List<Paciente> listAll() throws SQLException {

        conn = jdbc.getConnection();
        String sql = "SELECT * FROM paciente ";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setCodigo(rs.getInt("codigo"));
            paciente.setNome(rs.getString("nome"));
            paciente.setCpf(rs.getString("cpf"));
            paciente.setDataNascimento(rs.getString("data_nascimento"));

            pacientes.add(paciente);
        }

        return pacientes;
    }
}
