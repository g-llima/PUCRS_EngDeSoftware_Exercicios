package Main.FundamentosDeProgramação.Vetores.Ordenacao;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetor = {11, 3, 6, -1, 10, 9, 2, 8};

        sort(vetor);
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

//                  arr[j] += arr[j + 1];
//                  arr[j + 1] = arr[j] - arr[j + 1];
//                  arr[j] -=  arr[j + 1];
                }
        System.out.println(Arrays.toString(arr));
    }
}
