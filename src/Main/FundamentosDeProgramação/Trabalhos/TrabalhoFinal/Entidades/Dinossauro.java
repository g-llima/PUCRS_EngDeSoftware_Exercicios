package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades;

public class Dinossauro {

    private int id;
    private String raca;
    private int tipo;
    private double peso;
    private double velocidade;

    public Dinossauro(int id, String raca, int tipo, double peso, double velocidade) {
        this.id = id;
        this.raca = raca;
        this.tipo = tipo;
        this.peso = peso;
        this.velocidade = velocidade;
    }

    public int getId() {
        return id;
    }

    public String getRaca() {
        return raca;
    }

    public int getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public double getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "id=" + id +
                ", raca='" + raca + '\'' +
                ", tipo=" + tipo +
                ", peso=" + peso +
                ", velocidade=" + velocidade +
                '}';
    }
}
