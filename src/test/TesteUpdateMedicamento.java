
package test;

import DAO.MedicamentoDAO;
import Models.Medicamento;
import java.sql.SQLException;
import java.util.List;


public class TesteUpdateMedicamento {
    
    public static void main(String[]args ) throws SQLException {
     MedicamentoDAO dao = new MedicamentoDAO();
     
     try{
         
         List<Medicamento> lista dao.listAll();
         Medicamento c4 = dao.listAll(0);
         c4.setNome("pedro lapadinha");
         dao.update(c4);
         System.out.println("Atualizado");
     }catch(SQLException){
     
     
     }
         
     
     
     
     
     }
     
    
     
     
 
      
}
}
     
     
		
		