package com.senai.Aula06_Abstracao.exemplo_interface.controle_equipamentos_inteligentes;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new TvSmart(25));
        testarAparelhos(new LampadaInteligente(25));

    }
    public static void testarAparelhos(AparelhosInteligentes aparelhosInteligentes) {
        System.out.printf("--------teste %s--------", aparelhosInteligentes.getClass().getSimpleName());
        aparelhosInteligentes.ligar();
        if (aparelhosInteligentes instanceof LampadaInteligente lampadaInteligente) {
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
        } else if (aparelhosInteligentes instanceof TvSmart tvSmart) {
            tvSmart.aumentarVolume();
            tvSmart.baixarVolume();
            tvSmart.aumentarVolume();
            tvSmart.baixarVolume();
        }
        aparelhosInteligentes.desligar();
    }
    }

