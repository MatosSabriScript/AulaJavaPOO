package com.senai.aula04_Herança.exercicos.SistemaAtendimentoMedico;

public class Main {
    public static void main(String[] args) {

        PacienteParticular pacientep1=new PacienteParticular("Pedro",25,35.68);
        PacienteConvenio paciente1c= new PacienteConvenio("Luan",28,5);

        System.out.println("======Detalhes paciente particular=========");
        pacientep1.exibirDetalhes();

        System.out.println("======Detalhes paciente convenio=========");
        paciente1c.exibirDetalhes();



    }
}
