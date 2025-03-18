package com.senai.Aula01_IntroducaoPOO.Exercicios.produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1=new Produto(
                "Pera",
                15.89,
                8);

        Produto produto2=new Produto(
                "Maça",
                19.89,
                4);

        produto1.exibirDetalhes();
        produto1.calcularValor(9);
        produto1.atualizarProduto(4);

        produto2.exibirDetalhes();
        produto2.calcularValor(9);
        produto2.atualizarProduto(25);
    }

}
