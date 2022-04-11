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
        ex6();
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
        try {
            Scanner sc = new Scanner(System.in);
            int pares = 0, impares = 0;

            for (int i = 1; i <= 10; i++) {
                String resultado = "";
                int ultimoIndex = 0;
                System.out.printf("\n------ LOOP %d ------\n", i);

                System.out.print("Valor: ");
                String valor = sc.next();

                if ((Integer.parseInt(valor) > 100 || Integer.parseInt(valor) < 0)) {
                    System.err.println("Valor inválido.");
                    continue;
                }

                if (valor.length() == 2) {
                    ultimoIndex = 1;
                    switch (valor.charAt(0)) {
                        case '2' -> resultado += "vinte";
                        case '3' -> resultado += "trinta";
                        case '4' -> resultado += "quarenta";
                        case '5' -> resultado += "cinquenta";
                        case '6' -> resultado += "sessenta";
                        case '7' -> resultado += "setenta";
                        case '8' -> resultado += "oitenta";
                        case '9' -> resultado += "noventa";
                    }
                    if (valor.charAt(1) != '0') { resultado += " e "; }
                }

                switch (valor.charAt(ultimoIndex)) {
                    case '1' -> resultado += "um";
                    case '2' -> resultado += "dois";
                    case '3' -> resultado += "três";
                    case '4' -> resultado += "quatro";
                    case '5' -> resultado += "cinco";
                    case '6' -> resultado += "seis";
                    case '7' -> resultado += "sete";
                    case '8' -> resultado += "oito";
                    case '9' -> resultado += "nove";
                }

                switch (valor) {
                    case "0" -> resultado = "zero";
                    case "100" -> resultado = "cem";
                    case "10" -> resultado = "dez";
                    case "11" -> resultado = "onze";
                    case "12" -> resultado = "doze";
                    case "13" -> resultado = "treze";
                    case "14" -> resultado = "quatorze";
                    case "15" -> resultado = "quinze";
                    case "16" -> resultado = "dezesseis";
                    case "17" -> resultado = "dezessete";
                    case "18" -> resultado = "dezoito";
                    case "19" -> resultado = "dezenove";
                }

                if (Integer.parseInt(valor) % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                System.out.printf("%s = %s\n", valor, resultado);
            }
            System.out.println("\n----------| RESULTADO |----------");
            System.out.println("Pares: " + pares);
            System.out.println("Ímpares: " + impares);

        } catch (InputMismatchException e) {
            System.err.println("Valor inválido");
        } catch (Exception e) {
            e.printStackTrace();
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
    static void ex9() {
        for (int i = 2; i <= 100; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                 }
                j++;
            }
            if (i == j) {
                System.out.print(i + ", ");
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
}
