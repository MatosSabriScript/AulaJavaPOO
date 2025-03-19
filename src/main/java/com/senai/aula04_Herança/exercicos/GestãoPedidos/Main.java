package com.senai.aula04_Herança.exercicos.GestãoPedidos;

public class Main {
    public static void main(String[] args) {

        PedidoOnline pedidoOnline1=new PedidoOnline("Caderno",200.35,13.58);
        PedidoPresencial pedidoPresencial1= new PedidoPresencial("Lapis",258.36,5);

        System.out.println("====Detalhes pedido online=========");
        pedidoOnline1.exibirDetalhes();
        System.out.println("=======Detalhes pedido presencial=======");
        pedidoPresencial1.exibirDetalhes();
    }
}
