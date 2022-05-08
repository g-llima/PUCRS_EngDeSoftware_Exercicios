package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5;

public class Televisao {

    private static int volume;
    private static int canal = 1;

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    protected void setVolume(int volume) {
        Televisao.volume = volume;
    }

    protected static void setCanal(int canal) {
        Televisao.canal = canal;
    }
}
