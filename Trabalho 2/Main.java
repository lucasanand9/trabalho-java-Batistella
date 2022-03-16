package br.com.senai;

import br.com.senai.model.ItenDoPedido;
import br.com.senai.model.Pedidos;
import br.com.senai.model.Produto;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<ItenDoPedido> lista = new ArrayList<>();
        ArrayList<ItenDoPedido> lista2 = new ArrayList<>();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();
        Produto produto6 = new Produto();
        Produto produto7 = new Produto();
        Produto produto8 = new Produto();
        Produto produto9 = new Produto();
        Produto produto10 = new Produto();
        Produto produto11 = new Produto();
        Produto produto12 = new Produto();
        Produto produto13 = new Produto();
        Produto produto14 = new Produto();
        Produto produto15 = new Produto();


        produto1.setNome("Vassoura");
        produto1.setPreco(10);

        produto2.setNome("Uva");
        produto2.setPreco(5);

        produto3.setNome("Celular");
        produto3.setPreco(1000);

        produto4.setNome("Teclado");
        produto4.setPreco(2000);

        produto5.setNome("Caneca do Battistela");
        produto5.setPreco(1);

        produto6.setNome("Abacaxi");
        produto6.setPreco(7);

        produto7.setNome("Monitor");
        produto7.setPreco(500);

        produto8.setNome("Fone do ouvido");
        produto8.setPreco(400);

        produto9.setNome("Laptop da Positivo");
        produto9.setPreco(100);

        produto10.setNome("Pente de cabelo");
        produto10.setPreco(30);

        produto11.setNome("Escova de dentes");
        produto11.setPreco(5);

        produto12.setNome("cabo USB");
        produto12.setPreco(0.5);

        produto13.setNome("headseat");
        produto13.setPreco(600);

        produto14.setNome("lampada");
        produto14.setPreco(10);

        produto15.setNome("pen drive");
        produto15.setPreco(15);

        ItenDoPedido itenPedido1 = new ItenDoPedido();
        ItenDoPedido itenPedido2 = new ItenDoPedido();
        ItenDoPedido itenPedido3 = new ItenDoPedido();
        ItenDoPedido itenPedido4 = new ItenDoPedido();
        ItenDoPedido itenPedido5 = new ItenDoPedido();
        ItenDoPedido itenPedido6 = new ItenDoPedido();
        ItenDoPedido itenPedido7 = new ItenDoPedido();
        ItenDoPedido itenPedido8 = new ItenDoPedido();
        ItenDoPedido itenPedido9 = new ItenDoPedido();
        ItenDoPedido itenPedido10 = new ItenDoPedido();
        ItenDoPedido itenPedido11 = new ItenDoPedido();
        ItenDoPedido itenPedido12 = new ItenDoPedido();
        ItenDoPedido itenPedido13 = new ItenDoPedido();
        ItenDoPedido itenPedido14 = new ItenDoPedido();
        ItenDoPedido itenPedido15 = new ItenDoPedido();


        itenPedido1.setProduto(produto1);
        itenPedido1.setQuantidade(1);

        itenPedido2.setProduto(produto2);
        itenPedido2.setQuantidade(3);

        itenPedido3.setProduto(produto3);
        itenPedido3.setQuantidade(8);

        itenPedido4.setProduto(produto4);
        itenPedido4.setQuantidade(3);

        itenPedido5.setProduto(produto5);
        itenPedido5.setQuantidade(2);

        itenPedido6.setProduto(produto6);
        itenPedido6.setQuantidade(6);

        itenPedido7.setProduto(produto7);
        itenPedido7.setQuantidade(2);

        itenPedido8.setProduto(produto8);
        itenPedido8.setQuantidade(4);

        itenPedido9.setProduto(produto9);
        itenPedido9.setQuantidade(9);

        itenPedido10.setProduto(produto10);
        itenPedido10.setQuantidade(7);

        itenPedido11.setProduto(produto11);
        itenPedido11.setQuantidade(3);

        itenPedido12.setProduto(produto12);
        itenPedido12.setQuantidade(2);

        itenPedido13.setProduto(produto13);
        itenPedido13.setQuantidade(8);

        itenPedido14.setProduto(produto14);
        itenPedido14.setQuantidade(6);

        itenPedido15.setProduto(produto15);
        itenPedido15.setQuantidade(1);


        Pedidos pedido1 = new Pedidos();
        pedido1.setDescri("compra do mes");
        pedido1.setData("16/03/2022");
        lista.add(itenPedido1);
        lista.add(itenPedido2);
        lista.add(itenPedido3);
        lista.add(itenPedido4);
        lista.add(itenPedido5);
        lista.add(itenPedido6);
        lista.add(itenPedido7);
        lista.add(itenPedido8);
        lista.add(itenPedido9);
        lista.add(itenPedido10);

        System.out.println(pedido1.getDescri() + "\n" + "Data: " + pedido1.getData());
        for (int i=0;i<lista.size();i++){
            System.out.println("Produto: " + lista.get(i).getProduto().getNome() + "; Quantidade: " + lista.get(i).getQuantidade());
            }
        double total = 0;
        for (int i=0;i<lista.size();i++) {
            total += lista.get(i).getProduto().getPreco() * lista.get(i).getQuantidade();
            }

        System.out.println("\nValor total: " + total + " Reais\n");

        Pedidos pedido2 = new Pedidos();
        pedido2.setDescri("compra do mes");
        pedido2.setData("16/04/2022");
        lista2.add(itenPedido6);
        lista2.add(itenPedido7);
        lista2.add(itenPedido8);
        lista2.add(itenPedido9);
        lista2.add(itenPedido10);
        lista2.add(itenPedido11);
        lista2.add(itenPedido12);
        lista2.add(itenPedido13);
        lista2.add(itenPedido14);
        lista2.add(itenPedido15);

        System.out.println(pedido2.getDescri() + "\n" + "Data: " + pedido2.getData());
        for (int i=0;i<lista.size();i++){
            System.out.println("Produto: " + lista.get(i).getProduto().getNome() + "; Quantidade: " + lista.get(i).getQuantidade());
        }
        double total2 = 0;
        for (int i=0;i<lista.size();i++) {
            total2 += lista2.get(i).getProduto().getPreco() * lista2.get(i).getQuantidade();
        }

        System.out.println("\nValor total: " + total2 + " Reais");

        }





    }

