package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private int altura;

    public Pessoa(String nome, String dataNascimento, int altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getIdade() {
        String[] date = dataNascimento.split("/");

        int diaAniversario = Integer.parseInt(date[0]);
        int mesAniversario = Integer.parseInt(date[1]);
        int anoAniversario = Integer.parseInt(date[2]);

        int diaAtual = LocalDate.now().getDayOfMonth();
        int mesAtual = LocalDate.now().getMonthValue();
        int anoAtual = LocalDate.now().getYear();

        if (mesAniversario > mesAtual || (mesAniversario == mesAtual && diaAniversario > diaAtual)) return "Idade: " + ((anoAtual - anoAniversario) - 1);
        return "Idade: " + (anoAtual - anoAniversario);

    }

    @Override
    public String toString() {
        return "[nome: " + nome + ", dataNascimento: "+ dataNascimento + ", altura: " + altura + "]";
    }
}
