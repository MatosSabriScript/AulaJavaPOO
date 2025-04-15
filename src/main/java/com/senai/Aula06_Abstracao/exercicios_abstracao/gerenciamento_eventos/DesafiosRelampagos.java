package com.senai.Aula06_Abstracao.exercicios_abstracao.gerenciamento_eventos;

public class DesafiosRelampagos extends Evento {


    @Override
    public void iniciarEvento() {
        System.out.println("Iniciando desafio Relampago...");
        ativarEvento();
        configurarEvento(14);
    }

    @Override
    public void finalizarEvento() {
        System.out.println("Finalizando Desafio Relampago...");
        desativarEvento();
    }


    @Override
    public void premiarParticipantes() {
        System.out.println("Premiando com: " + premioPadrao);
    }
}
