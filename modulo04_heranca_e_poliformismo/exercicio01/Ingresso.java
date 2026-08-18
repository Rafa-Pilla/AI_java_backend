package modulo04_heranca_e_poliformismo.exercicio01;

import java.util.List;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private String tipoFilme;
    
    public Ingresso(double valor, String nomeFilme, String tipoFilme) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.tipoFilme = tipoFilme;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public String getTipoFilme() {
        return tipoFilme;
    }
    public void setTipoFilme(String tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public static final List<Filme> FILME = List.of(
        new Filme(1, "Homem-Aranha: Um Novo Dia", 40.0, "Legendado"),
        new Filme(2, "Homem-Aranha: Um Novo Dia", 30.0, "Dublado"),
        new Filme(3, "A Odisseia", 40.0, "Legendado"),
        new Filme(4, "A Odisseia", 30.0, "Dublado"),
        new Filme(5, "O Drama", 40.0, "Legendado"),
        new Filme(6, "O Drama", 30.0, "Dublado"),
        new Filme(7, "Obsessão", 40.0, "Legendado"),
        new Filme(8, "Obsessão", 30.0, "Dublado")
    );

    @Override
    public String toString() {
        return "Ingresso: " +
                "Nome do Filme = " + nomeFilme + "; " +
                "Valor = " + valor + "; " +
                "Tipo de Filme = " + tipoFilme;
    }

}
