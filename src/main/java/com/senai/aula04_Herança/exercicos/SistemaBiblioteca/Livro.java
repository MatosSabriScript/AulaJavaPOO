package com.senai.aula04_Herança.exercicos.SistemaBiblioteca;

public abstract class Livro {
    protected  String titulo;
    protected  String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
    }
}
