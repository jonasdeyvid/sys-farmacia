
package Models;

public class Medicamento {
    private Integer id;
    private String nome;
    private String descrição;
  
   
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

   
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

}
