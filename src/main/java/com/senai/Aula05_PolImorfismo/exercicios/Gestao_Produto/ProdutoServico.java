package com.senai.Aula05_PolImorfismo.exercicios.Gestao_Produto;

public class ProdutoServico extends Produto {
    private double impostoISS;

    public ProdutoServico(String nome, double preco, double impostoISS) {
        super(nome, preco);
        this.impostoISS = impostoISS;
    }

    public double getImpostoISS() {
        return impostoISS;
    }

    public void setImpostoISS(double impostoISS) {
        this.impostoISS = impostoISS;
    }

    public double getcalcularImposto(){
        double valorTotal;
        valorTotal= impostoISS+getPreco();
        return valorTotal;
    }

    @Override
    public void exibirdados() {
        System.out.println("=======O serviço tem as seguintes caracteristicas: ========\n "+getNome()+ " no valor de R$ "+getPreco() +
                "\n Tem a taxação   no valor:  R$ "  +
                impostoISS+"\n O valor total: "+getcalcularImposto());
    }
}
