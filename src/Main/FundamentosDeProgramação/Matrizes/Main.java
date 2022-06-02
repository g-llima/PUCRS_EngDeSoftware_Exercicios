package Main.FundamentosDeProgramação.Matrizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\nLinha: %d, Coluna: %d\n", i + 1, j + 1);
                System.out.print("Insira um valor: ");
                int val = sc.nextInt();
                matriz[i][j] = val;
            }
        }
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.printf("%d ", valor);
            }
            System.out.println();
        }
    }
}
