package com.senai.Aula05_PolImorfismo.exercicios.Gestao_Produto;

public class Main {
    public static void main(String[] args) {

        ProdutoFisico produtoFisico=new ProdutoFisico("Melancia",258.69,25);
        ProdutoDigital produtoDigital=new ProdutoDigital("Revista",200.69,25.89);
        ProdutoServico produtoServico=new ProdutoServico("Lavar roupa",25.89,0.80);


        produtoFisico.exibirdados();
        produtoServico.exibirdados();
        produtoDigital.exibirdados();


    }
}
