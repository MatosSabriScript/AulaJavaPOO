package com.senai.Aula05_PolImorfismo.exercicios.Gestao_Produto;

public class ProdutoDigital extends Produto {
      private double taxacao;

    public ProdutoDigital(String nome, double preco, double taxacao) {
        super(nome, preco);
        this.taxacao = taxacao;
    }

    public void setTaxacao(double taxacao) {
        this.taxacao = taxacao;
    }

    public double getcalcularImposto(){
        double valorTotal;
        valorTotal= taxacao+getPreco();
        return valorTotal;
    }

    @Override
    public void exibirdados() {
        System.out.println("=======O produto digital tem as seguintes caracteristicas: ========\n "+getNome()+ " no valor de R$ "+getPreco()+"\n Tem a taxação   no valor:  R$ "+ taxacao+"\n O valor total: "+getcalcularImposto());
    }
}

