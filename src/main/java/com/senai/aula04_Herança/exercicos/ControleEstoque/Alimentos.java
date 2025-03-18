package com.senai.aula04_Herança.exercicos.ControleEstoque;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Alimentos extends Produtos {
    private LocalDate dataValidade;

    public Alimentos(String nome, double preco, double qtd, String dataValidade) {
        super(nome, preco, qtd);
        this.dataValidade = LocalDate.parse(dataValidade, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Método para verificar se está vencido
    public boolean isVencido() {
        return dataValidade.isBefore(LocalDate.now()); // Se a data de validade for antes de hoje, está vencido
    }

    // Sobrescrevendo o método exibirDetalhes()
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Data de Validade: " + dataValidade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Exibir se está vencido ou não
        if (isVencido()) {
            System.out.println("⚠️ Produto VENCIDO!");
        } else {
            System.out.println("✅ Produto dentro da validade.");
        }
    }

}

