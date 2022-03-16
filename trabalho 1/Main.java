package br.senai;

import br.senai.model.Cliente;
import br.senai.model.Evento;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> lista = new ArrayList<>();

        Cliente cliente1 = new Cliente("Ronaldo",
                "258.283.387-60",
                "(38) 87484-3932",
                "maha@gmail.com");

        Cliente cliente2 = new Cliente("Naldo",
                "273.069.958-84",
                "(48) 94844-2828",
                "tutu@gmail.com");

        Cliente cliente3 = new Cliente("Naná",
                "294.171.395-09",
                "(21) 83493-2911",
                "coisanossa@gmail.com");

        Cliente cliente4 = new Cliente("Rhanna",
                "172.968.262-12",
                "(67) 99821-2134",
                "rhanna@gmail.com");

        Cliente cliente5 = new Cliente("Paulo",
                "887.398.123-65",
                "(23) 98344-1002",
                "paulo@gmail.com");

        Evento teatro = new Evento("Teatro", "28/04");
        Evento cinema = new Evento("Cinema", "23/09");
        Evento show = new Evento("Show do Jão", "06/05");

        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);
        lista.add(cliente4);
        lista.add(cliente5);

        System.out.println("Evento: " + teatro);
        System.out.print("Clientes: ");
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome() +
                    ", " + lista.get(i).getCpf() +
                    ", " + lista.get(i).getTelefone() +
                    ", " + lista.get(i).getEmail());
        }

        System.out.println("\n" + "Evento: " + cinema);
        System.out.print("Clientes: ");
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome() +
                    ", " + lista.get(i).getCpf() +
                    ", " + lista.get(i).getTelefone() +
                    ", " + lista.get(i).getEmail());
        }

        System.out.println("\n" + "Evento: " + show);
        System.out.print("Clientes: ");
        for (int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNome() +
                    ", " + lista.get(i).getCpf() +
                    ", " + lista.get(i).getTelefone() +
                    ", " + lista.get(i).getEmail());
        }

    }

}