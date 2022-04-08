package Main.FundamentosDeProgramação.Repeticao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1();
       // ex2();
        ex3();
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
    static void ex2() {
        try {
            Scanner sc = new Scanner(System.in);
            int equilateros = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.printf("\n------ LOOP %d ------\n", i);

                System.out.print("Primeiro lado: ");
                float lado1 = sc.nextFloat();

                System.out.print("Segundo lado: ");
                float lado2 = sc.nextFloat();

                System.out.print("Terceiro lado: ");
                float lado3 = sc.nextFloat();

                if (lado1 > Math.abs(lado3 - lado2) && (lado1 < (lado2 + lado3)) ||
                        lado2 > Math.abs(lado3 - lado1) && (lado2 < (lado1 + lado3)) ||
                        lado3 > Math.abs(lado1 - lado2) && (lado3 < (lado2 + lado1)))
                {
                    // CHECK IF IT'S SCALENE
                    if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
                    {
                        System.out.println("O triângulo é ESCALENO.");
                        continue;
                    }

                    // CHECK IF IT'S EQUILATERAL
                    if (lado1 == lado2 && lado1 == lado3)
                    {
                        System.out.println("O triângulo é EQUILÁTERO.");
                        equilateros++;
                        continue;
                    }

                    System.out.println("O triângulo é ISÓSCELES.");

                    // IF IT'S NOT POSSIBLE TO MAKE A TRIANGLE
                } else {
                    System.out.println("Não é triângulo.");
                }
            }
            System.out.printf("\nSe formaram %d triângulos equiláteros.", equilateros);

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void ex3() {
        try {
            Scanner sc = new Scanner(System.in);
            String signo;

            for (int i = 1; i <= 5; i++) {
                System.out.printf("\n------ PESSOA %d ------\n", i);

                System.out.print("Mês: ");
                String mes = sc.next().toLowerCase();

                System.out.print("Dia: ");
                int dia = sc.nextInt();

                if (dia > 30) { System.err.println("Valor inválido"); continue; }

                if (dia >= 21 && mes.equals("janeiro") || dia <= 19 && mes.equals("fevereiro")) { signo = "Aquário"; }
                else if (dia >= 20 && mes.equals("fevereiro") || dia <= 20 && mes.equals("março")) { signo = "Peixes"; }
                else if (dia >= 21 && mes.equals("março") || dia <= 20 && mes.equals("abril")) { signo = "Áries"; }
                else if (dia >= 21 && mes.equals("abril") || dia <= 20 && mes.equals("maio")) { signo = "Touro"; }
                else if (dia >= 21 && mes.equals("maio") || dia <= 20 && mes.equals("junho")) { signo = "Gémeos"; }
                else if (dia >= 21 && mes.equals("junho") || dia <= 21 && mes.equals("julho")) { signo = "Câncer"; }
                else if (dia >= 22 && mes.equals("julho") || dia <= 22 && mes.equals("agosto")) { signo = "Leão"; }
                else if (dia >= 23 && mes.equals("agosto") || dia <= 21 && mes.equals("setembro")) { signo = "Virgem"; }
                else if (dia >= 22 && mes.equals("setembro") || dia <= 22 && mes.equals("outubro")) { signo = "Libra"; }
                else if (dia >= 23 && mes.equals("outubro") || dia <= 21 && mes.equals("novembro")) { signo = "Excorpião"; }
                else if (dia >= 22 && mes.equals("novembro") || dia <= 21 && mes.equals("dezembro")) { signo = "Sagitário"; }
                else if (dia >= 22 && mes.equals("dezembro") || dia <= 20 && mes.equals("janeiro")) { signo = "Capricórnio"; }
                else {
                    System.err.println("Valor inválido");
                    continue;
                }

                System.out.printf("\nSeu signo é: %s.\n", signo);
            }

        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
