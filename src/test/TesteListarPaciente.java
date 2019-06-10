package test;

import DAO.PacienteDAO;
import Models.Paciente;
import java.sql.SQLException;
import java.util.List;

public class TesteListarPaciente {

    public static void main(String[] args) throws SQLException {
        Paciente p = new Paciente();
        PacienteDAO dao = new PacienteDAO();
        List<Paciente> pacientes = dao.listAll();
        p.setCodigo(3);

        for(Paciente lista : pacientes) {
            
            System.out.print(lista);

        }
    }
}
