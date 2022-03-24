package br.com.senai.model;

public class PessoaJ extends Pessoa{
private String cnpj;
private String ie;
    public PessoaJ(String nome, String cnpj, String ie, Endereco endereco){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString(){
        return "Pessoa Juridica: " + super.toString() + "; ie: " + ie + "; cnpj: " + cnpj;
    }
}
