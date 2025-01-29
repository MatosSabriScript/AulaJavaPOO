package com.senai.exrcicios;

public class Produto {
    String nome;
    double valor;
    int qtd;

    public Produto(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;




    }

   // @Override
    //public String toString() {
      //  return "O produto é: "+this.nome+ ","+ "o valor é:"+this.valor+ " e a quantidade é: "+ this.qtd;
   // }

    public void exibirDetalhes(String detalhes){
        System.out.println("O produto é: "+this.nome+ ","+ "o valor é:"+this.valor+ " e a quantidade é: "+ this.qtd);
    }

    public void  calcularValor (int valores){
        double total= (qtd*valor);
        System.out.println(total);
    }


}
