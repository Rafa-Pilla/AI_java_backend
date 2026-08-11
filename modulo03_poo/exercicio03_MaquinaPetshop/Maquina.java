package modulo03_poo.exercicio03_MaquinaPetshop;

public class Maquina {
    private boolean havePet;
    private int qtdAgua;
    private int qtdShampoo;
    private boolean petClean;

    public Maquina (boolean havePet, int qtdAgua, int qtdShampoo, boolean petClean) {
        this.havePet = havePet;
        this.qtdAgua = qtdAgua;
        this.qtdShampoo = qtdShampoo;
        this.petClean = petClean;
    }

    public Maquina(){
        this(false, 30, 10, false);
    }

    public int getQtdAgua() {
        return qtdAgua;
    }

    public int getQtdShampoo() {
        return qtdShampoo;
    }

    public boolean getHavePet() {
        return havePet;
    }

    public boolean getPetClean() {
        return petClean;
    }

    public void setHavePet(boolean havePet) {
        this.havePet = havePet;
    }

    public void setPetClean(boolean petClean) {
        this.petClean = petClean;
    }

    public void setQtdAgua(int qtdAgua) {
        this.qtdAgua = qtdAgua;
    }

    public void setQtdShampoo(int qtdShampoo) {
        this.qtdShampoo = qtdShampoo;
    }
}
