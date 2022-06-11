package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades;

public class Dinossauro {

    private int id;
    private String nomeRaca;
    private int tipo;
    private double peso;
    private double velocidade;
    private int categoria;

    public Dinossauro(int id, String nomeRaca, int tipo, int categoria, double peso, double velocidade) {
        this.id = id;
        this.nomeRaca = nomeRaca;
        this.tipo = tipo;
        this.peso = peso;
        this.velocidade = velocidade;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNomeRaca() {
        return nomeRaca;
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

    public int getCategoria() { return categoria; }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "id=" + id +
                ", nomeRaca='" + nomeRaca + '\'' +
                ", tipo=" + tipo +
                ", categoria=" + categoria +
                ", peso=" + peso +
                ", velocidade=" + velocidade +
                '}';
    }
}
