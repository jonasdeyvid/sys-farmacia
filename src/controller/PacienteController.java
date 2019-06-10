package controller;

import java.sql.SQLException;

import DAO.PacienteDAO;
import Models.Paciente;

public class PacienteController {
	
	private PacienteDAO pacienteDAO;
	
	public PacienteController() {
		this.pacienteDAO = new PacienteDAO();
	}
	
	public void adicionarPaciente(String nome, String cpf, String dataNascimento) throws SQLException {
		Paciente paciente = new Paciente(nome, cpf, dataNascimento);
		pacienteDAO.add(paciente);
	}
}
