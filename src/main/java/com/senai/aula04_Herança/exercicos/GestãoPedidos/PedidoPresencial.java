package com.senai.aula04_Herança.exercicos.GestãoPedidos;

public class PedidoPresencial extends Pedido {
    protected double desconto;

    public PedidoPresencial(String nomeProduto, double valor, double desconto) {
        super(nomeProduto, valor);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto: " + desconto);

    }
}


