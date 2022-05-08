package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex6;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente() {

    }
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    private void setSaldo(double valor) {
        this.saldo = valor;
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        setSaldo((getSaldo() - (valor + (valor * 0.005))));
    }
}
