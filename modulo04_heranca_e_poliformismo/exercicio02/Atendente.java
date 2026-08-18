package modulo04_heranca_e_poliformismo.exercicio02;

public class Atendente extends Usuario{
    private double vlCaixa;
    
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.vlCaixa = 0.0;
    }

    public void receberPgto(double valor) {
        if (valor > 0) {
            this.vlCaixa += valor;
            System.out.println("Pagamento de R$" + valor + " recebido!");
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor final: R$" + vlCaixa);
    }

    public double getVlCaixa() {
        return vlCaixa;
    }


}
