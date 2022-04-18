package Main.FundamentosDeProgramação.Repeticao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
        //ex9();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        ex14();
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

                if (dia > 30) { System.err.println("Valor inválido"); sc.next(); continue; }

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
    static void ex4() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            
            System.out.print("\nValor: ");
            int val = sc.nextInt();
            
            while (val < 0 || val > 100) {
                System.err.print("\nValor inválido. \nValor: ");
                val = sc.nextInt();
            }

            if (val / 100 == 1) { // CENTENA
                
                System.out.println("cem");
                continue;

            }

                int dezena = (val % 100) / 10;
                int unidade = (val % 100) % 10;

                if (val == 0) {
                    System.out.println("zero");
                    continue;
                }

                if (dezena == 1) {

                    switch(unidade) {
                        case 0:
                            System.out.println("dez");
                            break;
                        case 1:
                            System.out.println("onze");
                            break;
                        case 2:
                            System.out.println("doze");
                            break;
                        case 3:
                            System.out.println("treze");
                            break;
                        case 4:
                            System.out.println("quatorze");
                            break;
                        case 5:
                            System.out.println("quinze");
                            break;
                        case 6:
                            System.out.println("dezesseis");
                            break;
                        case 7:
                            System.out.println("dezessete");
                            break;
                        case 8:
                            System.out.println("dezoito");
                            break;
                        case 9:
                            System.out.println("dezenove");
                            break;
                    }
                } else {

                    switch (dezena) {
                        case 2:
                            System.out.print("vinte");
                            break;
                        case 3:
                            System.out.print("trinta");
                            break;
                        case 4:
                            System.out.print("quarenta");
                            break;
                        case 5:
                            System.out.print("cinquenta");
                            break;
                        case 6:
                            System.out.print("sessenta");
                            break;
                        case 7:
                            System.out.print("setenta");
                            break;
                        case 8:
                            System.out.print("oitenta");
                            break;
                        case 9:
                            System.out.print("noventa");
                            break;
                    }

                    if (dezena != 0 && unidade != 0) System.out.print(" e ");

                    switch (unidade) {
                        case 1:
                            System.out.print("um");
                            break;
                        case 2:
                            System.out.print("dois");
                            break;
                        case 3:
                            System.out.print("três");
                            break;
                        case 4:
                            System.out.print("quatro");
                            break;
                        case 5:
                            System.out.print("cinco");
                            break;
                        case 6:
                            System.out.print("seis");
                            break;
                        case 7:
                            System.out.print("sete");
                            break;
                        case 8:
                            System.out.print("oito");
                            break;
                        case 9:
                            System.out.print("nove");
                            break;
                        default:
                            System.out.print("\n");
                            break;
                    }
                }
            }
    }
    static void ex5() {
        try {
            Scanner sc = new Scanner(System.in);
            int fazendoAniverHoje = 0;

            System.out.println("--------| DATA ATUAL |--------");

            System.out.print("Mês: ");
            int ma = sc.nextInt();

            System.out.print("Dia: ");
            int da = sc.nextInt();

            if (ma > 12 || da > 30) { throw new InputMismatchException(); }

            int dataHoje = (ma * 30) + da;

            for (int i = 1; i <= 12; i++) {
                System.out.printf("\n------ PESSOA %d ------\n", i);

                System.out.print("Mês nascimento: ");
                int mn = sc.nextInt(); // mn = mês de nascimento

                System.out.print("Dia nascimento: ");
                int dn = sc.nextInt(); // dn = dia de nascimento

                if (mn > 12 || dn > 30) {
                    System.err.println("Valor inválido.");
                    continue;
                }

                int dataNascimento = (mn * 30) + dn;

                if (dataHoje == dataNascimento) {
                    System.out.println("Você está fazendo aniversário hoje! \uD83E\uDD73");
                    fazendoAniverHoje++;
                    continue;
                }
                if (dataHoje < dataNascimento) {
                    System.out.println("Você já fez aniversário esse ano.");
                    continue;
                }

                System.out.println("Você ainda não fez aniversário esse ano.");
            }
            System.out.printf("\nNo total %d fizeram aniversário hoje.", fazendoAniverHoje);


        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void ex6() {
        try {
            Scanner sc = new Scanner(System.in);
            int primo = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.printf("\n------ LOOP %d ------\n", i);

                System.out.print("Valor: ");
                int valor = sc.nextInt();

                if (valor == 1) {
                    System.out.println("O valor NÃO É primo.");
                    continue;
                }
                if (valor <= 0) {
                    System.err.println("Valor inválido");
                    continue;
                }

                int div = 2;
                primo = getPrimo(primo, div, valor);
            }
            System.out.printf("\nNo total %d valores eram primos.", primo);

        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void ex7() {
        try {
            Scanner sc = new Scanner(System.in);
            int primo = 0;

            System.out.println("------ LOOP 1 ------");
            System.out.print("Valor: ");
            int maior = sc.nextInt();
            if (maior <= 0) {
                System.err.println("Valor inválido.");
                return;
            }

            int div = 2;
            primo = getPrimo(primo, div, maior);

            for (int i = 2; i <= 10; i++) {
                System.out.printf("\n------ LOOP %d ------\n", i);
                System.out.print("Valor: ");
                int valor = sc.nextInt();
                if (valor <= 0) {
                    System.err.println("Valor inválido.");
                    continue;
                }
                if (valor > maior) { maior = valor; }

                div = 2;
                primo = getPrimo(primo, div, valor);
            }
            System.out.printf("\nNo total %d valores eram primos.", primo);
            System.out.println("\nMaior valor: " + maior);


        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void ex8() {
        int primo = 0;
        for (int i = 2; i < 1000; i++) {
            int div = 2;

            while (div < i) {
                if (i % div == 0) {
                    break;
                }
                div++;
            }
            if (div == i) {
                primo++;
            }
        }
        System.out.printf("Existem %d números primos nos primeiros 1000 números naturais.", primo);
    }
    static void ex9() {
        int count = 0, div;

        for (int i = 2; count < 100; i++) {
            for (div = 2; div < i; div++){
                if (i % div == 0){
                    break;
                }
            }
            if (div == i) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
    static void ex10() {
        int perfeitos = 0;
        for (int i = 1; i <= 1000; i++) {
            int divisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisores += j;
                }
            }
            if (divisores == i) {
                perfeitos++;
            }
        }
        System.out.printf("Em 1000 números naturais, existem %d números perfeitos.", perfeitos);
    }
    static void ex11() {
        int counter = 0, num = 1;

        while (counter < 10) {
            int soma = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    soma += i;
                }
            }

            if (soma == num) {
                System.out.println("É número perfeito: " + num);
                counter++;
            }
            num++;
        }
    }
    static void ex12() {
        int num1, num2, num3;
        for (num1 = 1; num1 <= 10000; num1++) {
            num2 = sum_of_divisors(num1);
            if (num1 < num2) {

                num3 = sum_of_divisors(num2);

                if (num3 == num1) {
                    System.out.printf("%d e %d \n", num1, num2);
                }
            }
        }
    }
    static void ex13() {
        int num1, num2, num3, total = 0;

        for (num1 = 100; num1 <= 100000; num1++) {
            num2 = sum_of_divisors(num1);
            if (num1 < num2) {

                num3 = sum_of_divisors(num2);

                if (num3 == num1) {
                    total++;
                }
            }
        }
        System.out.printf("Existem %d números perfeitos entre 100 e 10.000.", total);
    }
    static void ex14() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira um valor: ");
            int valor1 = sc.nextInt();
            int valor2, sum = valor1;

            do {
                System.out.print("Insira um valor: ");
                valor2 = sc.nextInt();
                sum += valor2;
                System.out.println("Soma: " + sum);
            } while (valor1 * 500 > sum);

            System.out.println("Finalizado.");


        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getPrimo(int primo, int div, int valor) {
        while (div < valor) {
            if (valor % div == 0) {
                System.out.println("O valor NÃO É primo.");
                break;
            }
            div++;
        }
        if (div == valor) {
            System.out.println("O valor É primo.");
            primo++;
        }
        return primo;
    }
    private static int sum_of_divisors(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
