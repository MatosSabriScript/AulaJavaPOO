package com.senai.aula04_Herança.exercicos.GestãoPedidos;

public class PedidoOnline extends Pedido{
    protected  double taxaEntrega;

    public PedidoOnline(String nomeProduto, double valor, double taxaEntrega) {
        super(nomeProduto, valor);
        this.taxaEntrega=taxaEntrega;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o metodo da classe Produto
        System.out.println("Taxa de entrega: " + taxaEntrega);
    }
}
