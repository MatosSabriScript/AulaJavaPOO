package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.conta_bancaria;

public abstract class ContaBancaria {
    private  String titular;
    protected double saldo;

    public ContaBancaria(String titutlar, double saldo) {
        this.titular = titutlar;
        this.saldo = saldo;
    }
    abstract void aplicarTaxaMensal();


    // Metodo para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;  // Subtrai o valor do saldo
            mensagemSucesso("Sacar",this);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            //saldoConta += valor;  // Adiciona o valor ao saldo
            //System.out.println("Depósito realizado com sucesso na conta!"+titularConta + "Saldo atual: R$" + saldoConta);
            mensagemSucesso("Depositar",this);
        } else {
            System.out.println("Valor de depósito inválido!"+"Deve ser um valor maior que R$0.00");
        } return false;
    }
    public static void mensagemSucesso(String operacao, ContaBancaria minhaconta){
        System.out.println(operacao+ " realizado com sucesso! Saldo atual: R$ " + minhaconta.saldo);
        System.out.println(" na conta "+minhaconta.titular);
    }

    public void exibirSaldo(){
        System.out.printf("Titular: %s, Saldo, R$%,.2f\n",titular,saldo);
    }

}
