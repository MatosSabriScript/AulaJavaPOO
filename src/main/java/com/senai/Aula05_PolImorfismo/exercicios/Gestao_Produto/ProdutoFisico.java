package com.senai.Aula05_PolImorfismo.exercicios.Gestao_Produto;

public class ProdutoFisico extends Produto {
    protected double impostoICMS;

    public ProdutoFisico(String nome, double preco, double impostoICMS) {
        super(nome, preco);
        this.impostoICMS = impostoICMS;
    }

    public double getImpostoICMS() {
        return impostoICMS;
    }

    public void setImpostoICMS(double impostoICMS) {
        this.impostoICMS = impostoICMS;
    }

    public double getcalcularImposto(){
        double valorTotal;
        valorTotal= impostoICMS+getPreco();
        return valorTotal;
    }

    @Override
    public void exibirdados() {
        System.out.println("=======O produto físico tem as seguintes caracteristicas: ========\n "+getNome()+ " no valor de R$ "+getPreco()+"\n Tem o imposto de ICMS no valor:  R$ "+ impostoICMS+"\n O valor total: "+getcalcularImposto());
    }
}
