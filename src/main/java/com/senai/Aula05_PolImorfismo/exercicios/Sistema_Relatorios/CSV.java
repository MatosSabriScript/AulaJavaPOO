package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Relatorios;

public class CSV extends Relatorio{
    @Override
    void gerar() {
        System.out.println("gerado relatório em CSV");
    }
}
