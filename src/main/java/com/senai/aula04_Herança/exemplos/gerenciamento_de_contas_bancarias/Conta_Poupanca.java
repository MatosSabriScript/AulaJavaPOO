package com.senai.aula04_Herança.exemplos.gerenciamento_de_contas_bancarias;

public class Conta_Poupanca extends ContaBancaria {
    private double taxaRendimento;

    public Conta_Poupanca(String titular, double saldo,double taxaRendimento) {
        super(titular,saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo+=saldo+taxaRendimento;
    }
}
