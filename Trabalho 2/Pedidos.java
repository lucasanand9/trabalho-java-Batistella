package br.com.senai.model;

public class Pedidos {
    private ItenDoPedido itens;
    private  String data;
    private String descri;
    private  double valorTotal;


    public ItenDoPedido getItens() {
        return itens;
    }

    public void setItens(ItenDoPedido iten1) {
        this.itens = iten1;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



   public double soma(){
       double valorTotal = getItens().getProduto().getPreco() * getItens().getQuantidade();
       return valorTotal;
   }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "itens=" + itens +
                ", data='" + data + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
