package com.senai.Aula06_Abstracao.exercicio_interface.companhia_aerea;

public interface CheckinPadrao  {

        void validarDocumento(String documento);
        void emitirCartaoEmbarque(String nomePassageiro);



        default void exibirMensagemSeguranca() {
            System.out.println("Check-in seguro realizado pela FlySecure");
        }
    }

