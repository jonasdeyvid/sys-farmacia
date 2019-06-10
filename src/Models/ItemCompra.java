package Models;


public class ItemCompra {

    private int codigo;
    private Medicamento produto;
    private int quantidade;
    private Double valorUnitario;

  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public Medicamento getProduto() {
        return produto;
    }

    public void setProduto(Medicamento produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}