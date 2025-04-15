package com.senai.Aula06_Abstracao.exercicio_interface.companhia_aerea;

public class FlySecureHelper {

    public static final int pesoNacional = 23; // kg
    public static final int pesoInternacional = 32; // kg

    // Metodo privado simulado pesquisei
    private static boolean validarFormatoDocumento(String documento) {
        return documento != null && documento.matches("[A-Z]{2}[0-9]{6}");
    }

    public static boolean validarDocumentoSeguro(String documento) {
        return validarFormatoDocumento(documento);
    }

    // Verificação de bagagem
    public static void verificarBagagem(int peso, boolean internacional) {
        int limite = internacional ?pesoInternacional : pesoNacional;
        if (peso <= limite) {
            System.out.println("Bagagem dentro do limite permitido (" + limite + "kg)");
        } else {
            System.out.println("⚠️ Excesso de bagagem! Limite: " + limite + "kg");
        }
    }

    public static void exibirMensagemBoasVindas() {
        System.out.println("Bem-vindo ao sistema FlySecure - Sua segurança em primeiro lugar!");
    }
}