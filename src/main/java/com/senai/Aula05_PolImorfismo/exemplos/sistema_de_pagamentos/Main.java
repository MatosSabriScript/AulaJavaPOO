package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_pagamentos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento>listaPagamentos=new ArrayList<>();
        listaPagamentos.add(new CLT("Nicolas",1500));
        listaPagamentos.add(new PJ("Maria",15,20));
        listaPagamentos.add(new Freelancer("Rafael",100));

        listaPagamentos.forEach(pagamento -> System.out.printf("\n%s recebe R$ %.2f\n",pagamento.getNome(),pagamento.calcularPagamento()));

    }
}
