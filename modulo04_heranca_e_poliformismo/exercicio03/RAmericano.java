package modulo04_heranca_e_poliformismo.exercicio03;

import java.util.Calendar;

public class RAmericano extends Relogio {

    @Override
    public void horario(){

        int hora = getC().get(Calendar.HOUR);

        int periodo = getC().get(Calendar.AM_PM);

        if (periodo == Calendar.AM) {
            String horario = formatoRelogio(hora, getMinuto(), getSegundo());
            System.out.println(horario + " AM");
        } else if (periodo == Calendar.PM) {
            String horario = formatoRelogio(hora, getMinuto(), getSegundo());
            System.out.println(horario + " PM");
        }

        
        
    }

}
