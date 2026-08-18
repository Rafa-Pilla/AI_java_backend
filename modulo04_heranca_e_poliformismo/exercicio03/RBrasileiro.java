package modulo04_heranca_e_poliformismo.exercicio03;

import java.util.Calendar;

public class RBrasileiro extends Relogio {

    @Override
    public void horario(){
        int hora = getC().get(Calendar.HOUR_OF_DAY);

        String horario = formatoRelogio(hora, getMinuto(), getSegundo());
        System.out.println(horario);
    }

}
