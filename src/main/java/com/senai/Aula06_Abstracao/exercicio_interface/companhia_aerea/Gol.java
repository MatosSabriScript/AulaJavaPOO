package com.senai.Aula06_Abstracao.exercicio_interface.companhia_aerea;

public class Gol implements CheckinPadrao{
    @Override
    public void validarDocumento(String documento) {
        System.out.println("Validando documento...");
        if (FlySecureHelper.validarDocumentoSeguro(documento)) {
            System.out.println("Documento válido.");
        } else {
            System.out.println("Documento inválido.");
        }
    }

    @Override
    public void emitirCartaoEmbarque(String nomePassageiro) {
        System.out.println("Emitindo cartão de embarque para: " + nomePassageiro);

    }
}
