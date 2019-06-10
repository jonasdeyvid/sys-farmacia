
package test;

import DAO.PacienteDAO;
import Models.Paciente;
import java.sql.SQLException;


public class TesteDeletePaciente {
    
    public static void main(String[] args) throws SQLException { 
        
        Paciente paciente = new Paciente();   
        paciente.setCodigo(5);
        
        PacienteDAO PacienteDAO = new PacienteDAO();   
        PacienteDAO.delete(paciente);   
    }   

    
}
