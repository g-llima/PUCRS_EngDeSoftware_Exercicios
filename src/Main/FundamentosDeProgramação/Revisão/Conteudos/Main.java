package Main.FundamentosDeProgramação.Revisão.Conteudos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exC3();
    }

    //VARIÁVEIS E TIPOS
    static void exV1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int n = sc.nextInt();

        System.out.printf("\n%d -> %d -> %d", n - 1, n, n + 1);
    }
    static void exV2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois valores reais: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        System.out.println("Media dos valores: " + (n1 + n2) / 2);
    }
    static void exV3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do salario minimo: ");
        float sm = sc.nextFloat();

        System.out.print("Valor do salario do usuario: ");
        float su = sc.nextFloat();

        System.out.println("O usuario recebe " + (su / sm) + " salario(s) minimo(s).");
    }
    static void exV4() {
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
    static void exV5() {
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

    //COMANDOS CONDICIONAIS
    static void exC1() {
        Scanner sc = new Scanner(System.in);
        boolean div = false;

        System.out.print("Insira um valor: ");
        int n = sc.nextInt();

        if (n % 10 == 0) {
            System.out.println("Divisivel por 10.");
            div = true;
        }
        if (n % 5 == 0) {
            System.out.println("Divisivel por 5.");
            div = true;
        }
        if (n % 2 == 0) {
            System.out.println("Divisivel por 2.");
            div = true;
        }

        if (!div) System.out.println("Nao eh divisivel por 10, 5 ou 2.");

    }
    static void exC2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Nao eleitor.");
            return;
        }
        if (idade > 18 && idade < 65) {
            System.out.println("Eleitor obrigatorio.");
            return;
        }

        System.out.println("Eleitor facultativo.");
    }
    static void exC3() {
        Scanner sc = new Scanner(System.in);
        String[] wochenTage = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

        System.out.print("Insira um valor (1 - 7): ");
        int n = sc.nextInt();

        if (n < 1 || n > 7) {
            System.out.println("Valor invalido.");
            return;
        }

        System.out.println(wochenTage[n - 1]);
    }
}
