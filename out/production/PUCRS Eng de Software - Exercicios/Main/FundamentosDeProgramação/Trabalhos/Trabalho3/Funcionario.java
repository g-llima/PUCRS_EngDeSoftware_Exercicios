package Main.FundamentosDeProgramação.Trabalhos.Trabalho3;

class Funcionario {

    private String nome;
    private String cpf;
    private float horaTrabalhada;
    private float cargaHorariaSemanal;
    private boolean temFilhos;

    public Funcionario(String nome, String cpf, float horaTrabalhada, float cargaHorariaSemanal, boolean temFilhos) {
        this.nome = nome;
        this.cpf = cpf;
        this.horaTrabalhada = horaTrabalhada;
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

    public float getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(float horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public float getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(float cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal > 44 ? 44 : cargaHorariaSemanal;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }

    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }

    @Override
    public String toString() {
        return "Nome = '" + nome + '\'' +
                ", CPF = '" + cpf + '\'' +
                ", HoraTrabalhada = " + horaTrabalhada +
                ", CargaHorariaSemanal = " + cargaHorariaSemanal +
                ", TemFilhos = " + (temFilhos ? "Sim" : "Não");
    }
}
