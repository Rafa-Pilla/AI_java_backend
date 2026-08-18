package modulo04_heranca_e_poliformismo.exercicio02;

public class Vendedor extends Usuario {
    private int qtdVendas;
    
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.qtdVendas = 0;
    }

    public void realizarVenda() {
        this.qtdVendas++;
        System.out.println("Venda realizada com sucesso! \nTotal: " + qtdVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas: " + qtdVendas);
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

}
