package Main.FundamentosDeProgramação.Revisão.Conteudos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex5();
    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int n = sc.nextInt();

        System.out.printf("\n%d -> %d -> %d", n - 1, n, n + 1);
    }

    static void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois valores reais: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        System.out.println("Media dos valores: " + (n1 + n2) / 2);
    }

    static void ex3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do salario minimo: ");
        float sm = sc.nextFloat();

        System.out.print("Valor do salario do usuario: ");
        float su = sc.nextFloat();

        System.out.println("O usuario recebe " + (su / sm) + " salario(s) minimo(s).");
    }

    static void ex4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();

        System.out.print("B: ");
        int b = sc.nextInt();

        System.out.print("C: ");
        int c = sc.nextInt();

        float delta = (b * b) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println("X1: " + x1 + "\nX2: " + x2);
    }

    static void ex5() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anos: ");
        int jahre = sc.nextInt();

        System.out.print("Meses: ");
        int monate = sc.nextInt();

        System.out.print("Dias: ");
        int tage = sc.nextInt();

        int summe = (jahre * 365) + (monate * 30) + tage;

        System.out.printf("\n%d anos, %d meses e %d dias equivalem a %d dias", jahre, monate, tage, summe);
    }
}
