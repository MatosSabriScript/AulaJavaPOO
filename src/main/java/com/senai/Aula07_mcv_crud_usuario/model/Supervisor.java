package com.senai.Aula07_mcv_crud_usuario.model;

public class Supervisor extends Usuario {
    private String area;

    public Supervisor(String nome, int id, String area) {
        super(nome, id);
        this.area = area;
    }
}
