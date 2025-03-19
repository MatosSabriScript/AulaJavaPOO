package com.senai.aula04_Herança.exercicos.SistemaBiblioteca;

public class LivroDigital extends Livro {
    protected double tamanhoMb;

    public LivroDigital(String titulo, String autor, double tamanhoMb) {
        super(titulo, autor);
        this.tamanhoMb = tamanhoMb;
    }

    public double getTamanhoMb() {
        return tamanhoMb;
    }

    public void setTamanhoMb(double tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo: "+tamanhoMb);
    }
}
