package modulo04_heranca_e_poliformismo.exercicio01;

public class MeiaEntrada extends Ingresso{
    private int quantidadePessoas;
    
    public MeiaEntrada(double valor, String nomeFilme, String tipoFilme, int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
        super(valor, nomeFilme, tipoFilme);
    }

    public double valorMeiaEntrada() {
        return (super.getValor() / 2) * quantidadePessoas;
    }

}
