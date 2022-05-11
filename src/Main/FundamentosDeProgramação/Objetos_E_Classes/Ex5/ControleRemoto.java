package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5;

public class ControleRemoto {

    private Televisao tv;


    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public void aumentarVolume() {
        tv.setVolume(tv.getVolume() + 1);
    }
    public void diminuirVolume() {
        tv.setVolume(tv.getVolume() - 1);
    }

    public void aumentarCanal() {
        tv.setCanal(tv.getCanal() + 1);
    }
    public void diminuirCanal() {
        tv.setCanal(tv.getCanal() - 1);
    }

    public void irParaCanal(int c) {
        tv.setCanal(c);
    }

    public String getInfo() {
        return "Canal: " + tv.getCanal() + ", Volume: " + tv.getVolume();
    }
}
