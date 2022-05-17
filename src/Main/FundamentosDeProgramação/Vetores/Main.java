package Main.FundamentosDeProgramação.Vetores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1();
        ex2();
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
}
