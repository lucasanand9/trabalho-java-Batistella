package br.com.senai;

import br.com.senai.model.Endereco;
import br.com.senai.model.PessoaF;
import br.com.senai.model.PessoaJ;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua XYZ");
        endereco1.setCep("88025-500");
        endereco1.setBairro("Bairo YXZ");
        endereco1.setNumero(193);

        Endereco endereco2 = new Endereco();
        endereco2.setNumero(666);
        endereco2.setBairro("Bairro XYZ");
        endereco2.setCep("99911-554");
        endereco2.setRua("Rua ZYX");

        PessoaJ pessoaJ = new PessoaJ("jorge", "XX. XXX. XXX/0001-XX","sim", endereco1);
        System.out.println(pessoaJ);

        PessoaF pessoaF = new PessoaF("Jão","xxx.xxx.xxx-xx","xx xxx xxx-x", endereco2);
        System.out.println(pessoaF);

        }


    }

