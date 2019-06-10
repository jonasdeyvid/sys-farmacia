
package test;

import DAO.MedicamentoDAO;
import Models.Medicamento;
import java.sql.SQLException;


public class TesteCreateMedicamento {
    
    public static void main(String[] args) throws SQLException {
        
        Medicamento medicamento = new Medicamento();
        MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
        
        medicamento.setNome("eurico");
        medicamento.setdescricao("purga");
        medicamento.setLaboratorio("neo");
        medicamento.setPreco(22.45);
        medicamento.setQuantidade(10);
        
        medicamentoDAO.add(medicamento);
    
}
}
