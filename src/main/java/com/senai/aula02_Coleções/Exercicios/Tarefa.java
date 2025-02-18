package com.senai.aula02_Coleções.Exercicios;

import java.util.ArrayList;

public class Tarefa {
    String nomeTarefa;
    boolean statusConclusao=false;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = false;

    }



    @Override
    public String toString() {
        return nomeTarefa+" - ["+(statusConclusao?"Concluida":"Pendente")+"]";
    }
}

