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
        String catMSG;
        if (categoria == 1) catMSG = "Pequeno porte (1)";
        else if (categoria == 2) catMSG = "Medio porte (2)";
        else catMSG = "Grande porte (3)";
        return "Dinossauro:" +
                "\nID: " + id +
                "\nNome da raca: " + nomeRaca +
                "\nTipo: " + (tipo == 1 ? "Carnivoro (1)" : "Herbivoro (2)") +
                "\nCategoria: " + catMSG +
                "\nPeso: " + peso +
                " kg\nVelocidade: " + velocidade + " km/h\n";
    }
}
