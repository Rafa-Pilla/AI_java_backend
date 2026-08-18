package modulo04_heranca_e_poliformismo.exercicio02;

import java.util.List;

public class Gerente extends Usuario {
    
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public static void gerarRelatorioFinanceiro(List<Vendedor> vendedores, List<Atendente> atendentes) {
        
        int totalVendas = 0;
        double totalCaixa = 0.0;

        for (Vendedor v : vendedores) { totalVendas += v.getQtdVendas(); }
        for (Atendente a : atendentes) { totalCaixa += a.getVlCaixa(); }

        System.out.println( "Vendas: " + totalVendas + "\nCaixa: " + totalCaixa + "\nRelatório financeiro gerado com sucesso!");
    }

    public static void consultarVendas(List<Vendedor> vendedores) {
        for (Vendedor v : vendedores) { 
            System.out.println("| Vendedor: " + v.getNome() + " \n| Vendas: " + v.getQtdVendas()); 
        }
    }
}

