package Main.FundamentosDeProgramação.Revisão.Conteudos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int n = sc.nextInt();

        System.out.printf("\n%d -> %d -> %d", n - 1, n, n + 1);
    }
}
