package com.senai.Aula06_Abstracao.exercicios_abstracao.gerenciamento_eventos;

public class Competicoes extends Evento {

    @Override
    public void iniciarEvento() {
        System.out.println("Iniciando competições...");
        ativarEvento();
        configurarEvento(45);

    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando competições...");
        desativarEvento();

    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando com: " + premioPadrao);

    }
}
