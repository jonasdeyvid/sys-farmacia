package Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe contendo os dados da compra
 *
 * @author Juliano
 */
public class Venda {

    private int codigo;
    
    private Date dataCompra;
    private Double valorTotal;
    private List<ItemCompra> itens;
    private List<ItemCompra> itensRemover;

    public Venda() {
        this.codigo = 0;
      
        this.dataCompra = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
    }

    public Venda(int codigo) {
        this.codigo = codigo;
        this.dataCompra = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValorTotal() {
        double total = 0;
        for (ItemCompra iv : itens) {
            total += (iv.getValorUnitario() * iv.getQuantidade());
        }
        return total;
    }

   

    public List<ItemCompra> getItens() {
        return itens;
    }

    public List<ItemCompra> getItensRemover() {
        return itensRemover;
    }

    public void addItem(ItemCompra itemCompra) {
        itens.add(itemCompra);
    }

    public void removeItem(ItemCompra itemCompra) {
        itens.remove(itemCompra);
        if (itemCompra.getCodigo() != 0) {
            itensRemover.add(itemCompra);
        }
    }

    public int quantidadeItens() {
        return itens.size();
    }

    @Override
    public String toString() {
        return String.valueOf(this.codigo);
    }

}
