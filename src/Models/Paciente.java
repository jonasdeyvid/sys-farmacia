package Models;

public final class Paciente {

    private Integer codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Paciente() {

    }

    @Override
    public String toString() {
        return " CODIGO: "+ codigo + "\n NOME: "+ nome + "\n CPF: " + cpf + "\n DATA NASCIMENTO: " +dataNascimento
                + "\n =========================================================== \n";
    }
    
    
    public Paciente(Integer codigo, String nome, String cpf, String dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }


    public Paciente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
