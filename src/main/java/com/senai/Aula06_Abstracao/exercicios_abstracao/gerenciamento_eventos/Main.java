package com.senai.Aula06_Abstracao.exercicios_abstracao.gerenciamento_eventos;

public class Main {
    public static void main(String[] args) {

        Evento meuEvento = new EventosSociais();
        Evento competicao= new Competicoes();
        Evento desafiosRelampagos= new DesafiosRelampagos();

        System.out.println("=== GERENCIAMENTO DE EVENTO ===");
        meuEvento.iniciarEvento();
        meuEvento.premiarParticipantes();
        meuEvento.finalizarEvento();


        System.out.println("=== GERENCIAMENTO DE EVENTO ===");
        competicao.iniciarEvento();
        competicao.premiarParticipantes();
        competicao.finalizarEvento();

        System.out.println("=== GERENCIAMENTO DE EVENTO ===");
        desafiosRelampagos.iniciarEvento();
        desafiosRelampagos.premiarParticipantes();
        desafiosRelampagos.finalizarEvento();


        meuEvento.mostrarPremioPadrao();
    }
}
