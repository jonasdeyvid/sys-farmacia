package Models;

public class Medicamento {

    private Integer codigo;
    private String nome;
    private String descricao;
    private String laboratorio;
    private Double preco;
    private Integer quantidade;

    public Medicamento() {

    }

    public Medicamento(Integer codigo, String nome, String descricao, String laboratorio, Double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Medicamento(String nome, String descricao, String laboratorio, Double preco, Integer quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "CODIGO: " + codigo;
    }
    
    
    
    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getdescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the laboratorio
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
