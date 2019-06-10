
package test;

import DAO.MedicamentoDAO;
import Models.Medicamento;
import java.sql.SQLException;


public class TesteDeleteMedicamento {
    
    public static void  main(String[] args) throws SQLException { 
        
            
        Medicamento medicamento = new Medicamento();   
        medicamento.setCodigo(1);
        
        MedicamentoDAO MedicamentoDAO = new MedicamentoDAO();   
        MedicamentoDAO.delete(medicamento);   
    }   

    
}
