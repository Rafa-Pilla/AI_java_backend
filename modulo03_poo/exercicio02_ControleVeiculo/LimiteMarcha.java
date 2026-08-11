package modulo03_poo.exercicio02_ControleVeiculo;

public record LimiteMarcha(int minVelocidade, int maxVelocidade) {
    public boolean contemVeelocidade(int velocidade) {
        return velocidade >= minVelocidade && velocidade <= maxVelocidade;
    }
}

