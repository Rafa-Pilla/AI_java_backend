package modulo04_heranca_e_poliformismo.exercicio01;

public class Familia extends Ingresso{
    private int quantidadePessoas;
    
    public Familia(double valor, String nomeFilme, String tipoFilme, int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
        super(valor, nomeFilme, tipoFilme);
    }

    public double valorFamilia() {
        if (quantidadePessoas < 3) {
            return super.getValor() * quantidadePessoas;
        } else { 
            double valorIngresso = super.getValor() * quantidadePessoas;
            double valorDesconto = valorIngresso * 0.05;
            return valorIngresso - valorDesconto;

        }
    }

}
