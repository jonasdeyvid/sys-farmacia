
package test;

import DAO.PacienteDAO;
import Models.Paciente;
import java.sql.SQLException;

public class TesteCreatePaciente {
    
    public static void main(String[] args) throws SQLException {
        
        Paciente paciente = new Paciente();
        PacienteDAO pacienteDAO = new PacienteDAO();
        
        paciente.setNome("eurico");
        paciente.setCodigo(Integer.SIZE);
        paciente.setCpf("78244565741");
        paciente.setDataNascimento("24/12/1996");
         
        pacienteDAO.add(paciente);
        
        
         
        
        
    
    
    
}
}
