package br.senai.model;

public class Evento {

    private String nome;
    private String data;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return nome + ", " + data;
    }
}
