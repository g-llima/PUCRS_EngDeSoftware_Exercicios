package Main.FundamentosDeProgramação.Repeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        try {
            Scanner sc = new Scanner(System.in);
            float maior = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.printf("\n------ LOOP %d ------\n", i);

                System.out.print("Primeiro valor: ");
                float val1 = sc.nextFloat();

                System.out.print("Segundo valor: ");
                float val2 = sc.nextFloat();

                System.out.print("Terceiro valor: ");
                float val3 = sc.nextFloat();

                if (val1 != val2 && val1 != val3 && val2 != val3) {

                    if (val1 > maior ) { maior = val1; }
                    else if (val2 > maior ) { maior = val2; }
                    else  { maior = val3; }

                    if (val1 > val2) {
                        if (val2 > val3) {
                            System.out.println(val1 + ", " + val2 + ", " + val3);
                        } else {
                            if (val1 > val3) {
                                System.out.println(val1 + ", " + val3 + ", " + val2);
                            } else {
                                System.out.println(val3 + ", " + val1 + ", " + val2);
                            }
                        }
                    } else {
                        if (val2 > val3) {
                            if (val1 > val3) {
                                System.out.println(val2 + ", " + val1 + ", " + val3);
                            } else {
                                System.out.println(val2 + ", " + val3 + ", " + val1);
                            }
                        } else {
                            System.out.println(val3 + ", " + val2 + ", " + val1);
                        }
                    }
                } else {
                    System.out.println("\nValores iguais.");
                }
            }
            System.out.printf("\nMaior: %.02f", maior);


        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
