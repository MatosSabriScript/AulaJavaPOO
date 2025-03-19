package com.senai.aula04_Herança.exercicos.SistemaBiblioteca;


public class LivroFisico extends Livro {
    protected int numeroPaginas;

    public LivroFisico(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Numero de paginas: "+numeroPaginas);
    }
}
