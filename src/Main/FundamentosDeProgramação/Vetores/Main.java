package Main.FundamentosDeProgramação.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Desafio desafio = new Desafio();
        desafio.run();

        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
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
        Aluno al = new Aluno("Gabriel", new float[]{9.2f, 1, 9});

        System.out.println(al.getMedia());
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
    private float[] notas;

    public Aluno(String nome, float[] notas) {
        this.nome = nome;
        if (notas.length == 3) this.notas = notas;
    }

    public float getMedia() {
        float sum = 0;
        for (float x : notas) {
            sum += x;
        }
        return sum / 3;
    }
}
