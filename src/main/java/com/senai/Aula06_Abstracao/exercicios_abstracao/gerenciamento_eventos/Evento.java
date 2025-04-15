package com.senai.Aula06_Abstracao.exercicios_abstracao.gerenciamento_eventos;

public abstract class Evento {
    protected int tempoLimite=60;
    protected  String premioPadrao= "100 moedas de ouro";


    private boolean ativo= false;

    public abstract void iniciarEvento();
    public abstract void finalizarEvento();
    public abstract void premiarParticipantes();

    public void mostrarPremioPadrao() {
        System.out.println("Prêmio padrão: " + premioPadrao);
    }

    protected void ativarEvento() {
        if (!ativo) {
            ativo = true;
            System.out.println("Evento ativado.");
        } else {
            System.out.println("Evento já está ativo.");
        }
    }

    protected void desativarEvento() {
        if (ativo) {
            ativo = false;
            System.out.println("Evento encerrado.");
        } else {
            System.out.println("Evento já estava inativo.");
        }
    }


    private boolean validarTempo(int tempo) {
        return tempo > 0 && tempo <= tempoLimite;
    }


    protected void configurarEvento(int tempo) {
        if (validarTempo(tempo)) {
            System.out.println("Evento configurado com tempo: " + tempo + " minutos.");
        } else {
            System.out.println("Tempo inválido. Deve ser entre 1 e " + tempoLimite + " minutos.");
        }
    }
}

