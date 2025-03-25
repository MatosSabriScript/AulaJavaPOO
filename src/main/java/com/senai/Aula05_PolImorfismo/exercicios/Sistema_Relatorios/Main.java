package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Relatorios;




public class Main {
    public static void main(String[] args) {
        gerarRelatorio(new PDF());
        gerarRelatorio(new JSON());
        gerarRelatorio(new CSV());
    }

    private static void gerarRelatorio(Relatorio relatorio){
        relatorio.gerar();
    }
}


