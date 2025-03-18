package com.senai.aula04_Herança.exercicos.SistemaFuncionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Pedro", 2500.36, "Portugues");
        Professor professor2 = new Professor("Paulo", 5500.36, "Matematica");
        Coordenador coordenador1 = new Coordenador("Sara", 20010.36);

        coordenador1.addProfessor(professor1);
        coordenador1.addProfessor(professor2);


        System.out.println("=====Detalhes do professor====");
        professor1.exibirDetalhes();
        System.out.println("======Detalhes do professor=====");
        professor2.exibirDetalhes();
        System.out.println("======Detalhes do coordenador=====");
        coordenador1.exibirDetalhes();
    }
}
