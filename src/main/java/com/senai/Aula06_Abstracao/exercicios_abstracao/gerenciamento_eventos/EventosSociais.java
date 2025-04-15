package com.senai.Aula06_Abstracao.exercicios_abstracao.gerenciamento_eventos;

public class EventosSociais  extends Evento{



    @Override
    public void iniciarEvento() {
        System.out.println("Iniciando Evento Social...");
        ativarEvento();
        configurarEvento(14);
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando Evento Social...");
        desativarEvento();

    }

    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando com: " + premioPadrao);

    }
}
