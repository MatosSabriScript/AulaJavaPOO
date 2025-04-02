package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.gerenciador_funcionarios;

public class Main {
    public static void main(String[] args) {
        pagarFuncionarios(new FuncionarioEfetivo("Pedro",2547.98,20));
        pagarFuncionarios(new FuncionarioTemporario("Raquel",5878.69,200,25));


    }

    public static void pagarFuncionarios (Funcionario funcionario){
        System.out.println("---------------- Pagamento funcionário(a)");
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
    }
}
