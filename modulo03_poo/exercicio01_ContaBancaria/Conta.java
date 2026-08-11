package modulo03_poo.exercicio01_ContaBancaria;

public class Conta {
    private String name;
    private double saldo;
    private double chequeEspecial;
    private boolean useCheque;

    public Conta(String name, double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public double chequeEspecial() {
        if (saldo <= 500) {
            chequeEspecial = 50.0;
        } else {
            chequeEspecial = saldo*0.5;
        }

        return chequeEspecial;
    }

    public String getName() {
        return this.name;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public boolean getUseCheque() {
        return this.useCheque;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUseCheque(boolean useCheque) {
        this.useCheque = useCheque;
    }
    
}
