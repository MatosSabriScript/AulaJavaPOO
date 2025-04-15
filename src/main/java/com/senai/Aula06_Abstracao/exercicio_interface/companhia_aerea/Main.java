package com.senai.Aula06_Abstracao.exercicio_interface.companhia_aerea;

public class Main {
        public static void main(String[] args) {

            FlySecureHelper.exibirMensagemBoasVindas();
            CheckinPadrao cia = new Gol();

            // Processo de check-in
            cia.validarDocumento("ABc456");
            cia.emitirCartaoEmbarque("João da Silva");
            cia.exibirMensagemSeguranca();

            // Verificando bagagem
            FlySecureHelper.verificarBagagem(12, false); // Nacional
        }
    }


