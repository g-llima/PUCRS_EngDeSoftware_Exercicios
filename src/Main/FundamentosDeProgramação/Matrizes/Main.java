package Main.FundamentosDeProgramação.Matrizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1();
        //ex2(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        //System.out.println(ex3(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        //System.out.println(ex4(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2));
        //ex5(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        somarMatrizes(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
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
    static void ex2(int[][] m) {
        for (int[] linhas : m) {
            for (int valor : linhas) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    static int ex3(int[][] m) {
        int maior = m[0][0];

        for (int[] linhas : m) {
            for (int valor : linhas) {
                if (valor > maior) maior = valor;
            }
        }
        return maior;
    }
    static float ex4(int[][] m, int pos) {
        float soma = 0, count = 0;

        for (int i = 0; i < m[pos].length; i++) {
            soma += m[pos][i];
            count++;
        }
        return soma / count;
    }
    static void ex5(int[][] m) {

        System.out.println("\nANTES\n");
        for (int[] linhas : m) {
            for (int valor : linhas) {
                if (valor < 0) {
                    System.err.println("\nA matriz nao pode conter valores negativos.");
                    return;
                }
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = m[i][j] % 2 == 0 ? 1 : -1;
            }
        }

        System.out.println("\nDEPOIS\n");

        for (int[] linhas : m) {
            for (int valor : linhas) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    static void somarMatrizes(int[][] m1, int[][] m2) {
        int[][] m3 = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        for (int[] linhas : m3) {
            for (int x : linhas) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
