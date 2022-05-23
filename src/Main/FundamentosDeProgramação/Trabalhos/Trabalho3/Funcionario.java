package Main.FundamentosDeProgramação.Trabalhos.Trabalho3;

class Funcionario {

    private String nome;
    private String cpf;
    private float remuneracaoPorHora;
    private float cargaHorariaSemanal;
    private boolean temFilhos;

    public Funcionario(String nome, String cpf, float remuneracaoPorHora, float cargaHorariaSemanal, boolean temFilhos) {
        this.nome = nome;
        this.cpf = cpf;
        this.remuneracaoPorHora = remuneracaoPorHora;
        this.cargaHorariaSemanal = cargaHorariaSemanal > 44 ? 44 : cargaHorariaSemanal;
        this.temFilhos = temFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getReaisPorHoraTrabalhada() {
        return remuneracaoPorHora;
    }

    public void setRemuneracaoPorHora(float reaisPorHoraTrabalhada) {
        this.remuneracaoPorHora = reaisPorHoraTrabalhada;
    }

    public float getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }
    public float  getSalario() {
        return remuneracaoPorHora * cargaHorariaSemanal * 4;
    }

    public void setCargaHorariaSemanal(float cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal > 44 ? 44 : cargaHorariaSemanal;
    }

    public boolean getTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\nCPF = " + cpf + "\nRemuneração (por hora) = R$ " + remuneracaoPorHora + "\nHoras por Semana = " + cargaHorariaSemanal + " h\nSalário Mensal = R$ " + getSalario() + "\nTem Filhos = " + (temFilhos ? "Sim" : "Não") + "\n";
    }
}