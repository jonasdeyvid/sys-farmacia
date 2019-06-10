package test;

import DAO.MedicamentoDAO;
import Models.Medicamento;
import java.sql.SQLException;
import java.util.List;

public class TesteListarMedicamento {

    public static void main(String[] args) {
        MedicamentoDAO dao = new MedicamentoDAO();

        try {
            List<Medicamento> lista = dao.listAll();
            for (Medicamento medicamentos : lista) {

                System.out.print(medicamentos);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
