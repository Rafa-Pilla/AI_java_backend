package modulo03_poo.exercicio02_ControleVeiculo;
import java.util.Map;

public class Carro {
    private static final Map<Integer, LimiteMarcha> LIMITES_MARCHA = Map.of(
        0, new LimiteMarcha(0, 0),
        1, new LimiteMarcha(0, 20),
        2, new LimiteMarcha(21, 40),
        3, new LimiteMarcha(41, 60),
        4, new LimiteMarcha(61, 80),
        5, new LimiteMarcha(81, 100),
        6, new LimiteMarcha(101, 120)
    );

    private boolean isOn;
    private int velocidade;
    private int marcha;

    public Carro(boolean isOn, int velocidade, int marcha) {
        this.isOn = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public boolean getIsOn(){
        return this.isOn;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public int getMarcha(){
        return this.marcha;
    }

    public LimiteMarcha getLimiteMarcha(){
        return LIMITES_MARCHA.get(this.marcha);
    }

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public void setMarcha(int marcha){
        this.marcha = marcha;
    }




}
