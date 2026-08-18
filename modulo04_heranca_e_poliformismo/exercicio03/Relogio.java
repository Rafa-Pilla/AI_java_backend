package modulo04_heranca_e_poliformismo.exercicio03;
import java.util.Calendar;

public abstract class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    Calendar c = Calendar.getInstance();

    public Relogio() {
        this.minuto = c.get(Calendar.MINUTE);
        this.segundo = c.get(Calendar.SECOND);
    }

    public String formatoRelogio(int hora, int minuto, int segundo) {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public void horario(){
    }

    public int getMinuto() {
        return minuto;
    }
    
    public int getSegundo() {
        return segundo;
    }

    public Calendar getC() {
        return c;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
