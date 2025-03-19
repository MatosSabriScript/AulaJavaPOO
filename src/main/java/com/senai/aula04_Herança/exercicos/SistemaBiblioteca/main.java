package com.senai.aula04_Herança.exercicos.SistemaBiblioteca;

public class main {
    public static void main(String[] args) {

        LivroDigital livrodigital1=new LivroDigital("A nuvem","Paulo Viera",2005.5);
        LivroFisico livrofisico1=new LivroFisico("Bolha","Ana");

        System.out.println("===Detalhes livro digital====");
        livrofisico1.exibirDetalhes();
        System.out.println("===Detalhes livro fisico===");
        livrodigital1.exibirDetalhes();

    }
}
