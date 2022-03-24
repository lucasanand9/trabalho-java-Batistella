package br.com.senai.model;

public class PessoaF extends Pessoa{
    private String cpf;
    private String rg;
public PessoaF(String nome, String cpf, String rg, Endereco endereco){
    super(nome, endereco);
    this.cpf = cpf;
    this.rg = rg;
}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString(){
        return "Pessoa Fisica: " + super.toString() + "; cpf: " + cpf + "; rg: " + rg;
    }
}
