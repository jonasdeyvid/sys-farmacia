
package Models;


public class Paciente {
   // private Integer id;
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    
   
    public void setPaciente(Paciente paciente) {
    }
  
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    //public int getId() {
      //  return id;
    //}

   
    //public void setId(int id) {
    //    this.id = id;
    //}

  
    public String getEndereço() {
        return endereco;
    }

   
    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

   
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    
}
