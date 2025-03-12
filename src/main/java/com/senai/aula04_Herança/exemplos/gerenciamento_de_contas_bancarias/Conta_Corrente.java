package com.senai.aula04_Herança.exemplos.gerenciamento_de_contas_bancarias;

import static com.senai.aula04_Herança.exemplos.gerenciamento_de_contas_bancarias.ContaBancaria.mensagemSucesso;

public class Conta_Corrente extends ContaBancaria {
    private double limite;

    public Conta_Corrente(String titular,double saldo,double limite) {
        super (titular,saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && (valor <= saldo+limite)) {
            saldo -= valor;  // Subtrai o valor do saldo
            mensagemSucesso("Sacar",this);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");
        }
        return false;
    }
}
