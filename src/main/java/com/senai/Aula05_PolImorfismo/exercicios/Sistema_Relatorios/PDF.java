package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Relatorios;

public class PDF extends Relatorio {
    @Override
    void gerar() {
        System.out.println("gerado relatorio em pdf");;
    }
}
