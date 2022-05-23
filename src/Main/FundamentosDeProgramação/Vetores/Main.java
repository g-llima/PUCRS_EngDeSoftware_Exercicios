package Main.FundamentosDeProgramação.Vetores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Desafio desafio = new Desafio();
        //desafio.run();
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        ex6();
    }

    static void ex1() {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor 1: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor2[i] = sc.nextInt();
        }

        for (int n : vetor1) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
        for (int n : vetor2) {
            System.out.print(n + " ");
        }
    }
    static void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tamanho do primeiro vetor: ");
        int tamanho1 = sc.nextInt();

        System.out.print("Insira o tamanho do segundo vetor: ");
        int tamanho2 = sc.nextInt();

        int[] vetor1 = new int[tamanho1];
        int[] vetor2 = new int[tamanho2];


        System.out.println("Vetor 1: ");
        for (int i = 0; i < tamanho1; i++) {
            System.out.print("Insira um valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < tamanho2; i++) {
            System.out.print("Insira um valor: ");
            vetor2[i] = sc.nextInt();
        }

        for (int n : vetor1) {
            System.out.print(n + " ");
        }
        System.out.println(" ");
        for (int n : vetor2) {
            System.out.print(n + " ");
        }
    }
    static void ex3() {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor 1: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor2[i] = sc.nextInt();
        }

        for (int n : vetor1) {
            System.out.print(n + " ");
            soma += n;
        }
        System.out.println(" ");
        for (int n : vetor2) {
            System.out.print(n + " ");
            soma += n;
        }
        System.out.println("\nSoma dos vetores: " + soma);
    }
    static void ex4() {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];
        int resultado = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor 1: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            resultado += (vetor1[i] * vetor2[i]);
        }


        System.out.println("\nSoma dos vetores: " + resultado);
    }
    static void ex5() {
        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];

        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor 1: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("\nVetor 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Insira um valor: ");
            vetor2[i] = sc.nextInt();
        }
        int min1 = vetor1[0];
        int min2 = vetor2[0];

        for (int n : vetor1) {
            if (n < min1) min1 = n;
            System.out.print(n + " ");
        }
        System.out.println(" ");
        for (int n : vetor2) {
            if (n < min2) min2 = n;
            System.out.print(n + " ");
        }

        System.out.println("\nMenor valor do vetor1: " + min1);
        System.out.println("Menor valor do vetor2: " + min2);
        System.out.println("Média dos menores valores: " + (min1 + min2) / 2);
    }
    static void ex6() {
        Aluno[] grupo = new Aluno[4];
        grupo[0] = new Aluno("Gabriel", 10, 9, 8);
        grupo[1] = new Aluno("Ada", 0, 5, 3);
        grupo[2] = new Aluno("Fernanda", 7, 9, 7);

        Aplicacao ap = new Aplicacao(grupo);
        System.out.println("Maior nota 1: " + ap.maiorNota1());
        System.out.println("Menor nota 3: " + ap.menorNota3());
        System.out.printf("Média das médias: %.2f\n", ap.getMediaDasMedias());
        System.out.println("Tamanho do maior nome: " + ap.getMaiorNome() + " caractéres");
        System.out.println("Quantidade de notas abaixo da média: " + ap.getQntNotasAbaixoMedia());
    }
}
class Desafio {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int tam = sc.nextInt(), j = 1;
        int[] arr = new int[tam];

        for (int i = 0; i < tam; i++)
            arr[i] = sc.nextInt();

        for(int x : arr) { System.out.println(j + ": " + x); j++; }
        System.out.println("Números pares: " + contaPares(arr));
        System.out.println("Somatório dos números primos: " + somatorioPrimos(arr));
        System.out.println("Média dos números: " + calculaMedia(arr));
        System.out.println("Moda: " + getModa(arr));
    }

    private double calculaMedia (int[] arr) {
        double soma = 0;
        for (int x : arr)
            soma += x;
        return soma / arr.length;
    }
    private int contaPares(int[] arr) {
        int pares = 0;
        for (int x : arr) {
            if (x % 2 == 0) pares++;
        }
        return pares;
    }
    private int somatorioPrimos(int[] arr) {
        int soma = 0;
        for (int x : arr)
            if (isPrimo(x)) soma += x;

        return soma;
    }
    private int getModa(int[] arr) {
        int modaContador = 0;
        int indiceModa = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int contador = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    contador++;
                    if (contador > modaContador) {
                        modaContador = contador;
                        indiceModa = i;
                    }
                }
            }
        }
        return indiceModa == -1 ? -1 : arr[indiceModa];
    }
    private boolean isPrimo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
class Aluno {

    private String nome;
    private float n1, n2, n3; //n = nota

    public Aluno(String nome, float n1, float n2, float n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public Aluno(String nome) {
        this.nome = nome;
        this.n1 = 0;
        this.n2 = 0;
        this.n3 = 0;
    }

    public float getMedia() {
        return (n1 + n2 + n3) / 3;
    }

    public String getNome() {
        return this.nome;
    }

    public float getNota1() {
        return this.n1;
    }

    public float getNota2() {
        return this.n2;
    }

    public float getNota3() {
        return this.n3;
    }
}

class Aplicacao {

    private Aluno[] grupo;

    public Aplicacao(Aluno[] grupo){
        this.grupo = grupo;
        grupo[3] = inserirAluno();
        mostrarAlunos(grupo);
    }

    private Aluno inserirAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------| INSERIR ALUNO |----------");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nota 1: ");
        float n1 = Float.parseFloat(sc.nextLine());

        System.out.print("Nota 2: ");
        float n2 = Float.parseFloat(sc.nextLine());

        System.out.print("Nota 3: ");
        float n3 = Float.parseFloat(sc.nextLine());

        return new Aluno(nome, n1, n2, n3);
    }
    private void mostrarAlunos(Aluno[] lista) {
        System.out.println("\n----------| ALUNOS |----------");
        for (Aluno al : lista) {
            System.out.println("Nome: " + al.getNome());
            System.out.printf("Nota 1: %.2f - Nota 2: %.2f - Nota 3: %.2f\n\n", al.getNota1(), al.getNota2(), al.getNota3());
        }
        System.out.println("\n------------------------------");
    }
    public float maiorNota1() {
        float maior = 0;
        for (Aluno al : grupo) {
            if (al.getNota1() > maior) maior = al.getNota1();
        }
        return maior;
    }
    public float menorNota3() {
        float menor = grupo[0].getNota3();
        for (Aluno al : grupo) {
            if (al.getNota3() < menor) menor = al.getNota3();
        }
        return menor;
    }
    public float getMediaDasMedias() {
        float soma = 0;
        for (Aluno al : grupo) {
            soma += al.getMedia();
        }
        return soma / grupo.length;
    }
    public int getMaiorNome() {
        int maior = grupo[0].getNome().length();
        for (Aluno al : grupo) {
            if (al.getNome().length() > maior) maior = al.getNome().length();
        }
        return maior;
    }
    public int getQntNotasAbaixoMedia() {
        int count = 0;
        for (Aluno al : grupo) {
            if (al.getMedia() < 7) count++;
        }
        return count;
    }
}
