package br.com.senai.model;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String lista(){
        return "Nome do produto:/n" +
                nome + ";\n" +
                "Valor do produto:\n" +
                preco +";\n";
    }

}
