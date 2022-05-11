package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5;

public class Televisao {

    private int volume;
    private int canal;

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected void setCanal(int canal) {
        this.canal = canal;
    }
}
