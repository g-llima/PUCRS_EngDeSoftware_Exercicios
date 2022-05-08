package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5;

public class ControleRemoto extends Televisao{

    public void aumentarVolume() {
        setVolume(getVolume() + 1);
    }
    public void diminuirVolume() {
        setVolume(getVolume() - 1);
    }

    public void aumentarCanal() {
        setCanal(getCanal() + 1);
    }
    public void diminuirCanal() {
        setCanal(getCanal() - 1);
    }

    public void irParaCanal(int c) {
        setCanal(c);
    }

    public String getInfo() {
        return "Canal: " + getCanal() + ", Volume: " + getVolume();
    }
}
