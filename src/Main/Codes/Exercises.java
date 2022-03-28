package Main.Codes;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercises {

    public static void exercise1() {
        try {
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.#");
            List<String> resultado = new ArrayList<>();

            System.out.print("Insira o primeiro valor: ");
            float valor1 = sc.nextFloat(); // GET 1° VALUE

            System.out.print("Insira o segundo valor: ");
            float valor2 = sc.nextFloat(); // GET 2° VALUE

            System.out.print("Insira o terceiro valor: ");
            float valor3 = sc.nextFloat(); // GET 3° VALUE

            if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) // CHECK IF ARE EQUAL
            {
                // SORT VALUES
                float[] listaValores = {valor1, valor2, valor3};
                Arrays.sort(listaValores);

                for (float valor : listaValores)
                {
                    resultado.add(df.format(valor)); // REMOVE UNNECESSARY ZEROS AFTER VALUE & APPEND TO LIST
                }

                // LOG RESULT
                System.out.println(resultado);
                return;
            }

            System.out.println("Valores iguais.");

            // BUG HANDLER
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. (Tente usar '.')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise2() {
        try {
            Scanner sc = new Scanner(System.in);
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Insira uma data (dd/MM/yyyy): ");
            String data = sc.next(); // GET DATE

            // VALIDATE DATE
            df.setLenient(false);
            df.parse(data);

            System.out.println("A data é válida.");

        } catch (ParseException e) {
            System.out.println("Data inválida.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise3() {
        try {
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.#");

            System.out.print("Insira o primeiro valor: ");
            float valor1 = sc.nextFloat();

            System.out.print("Insira o segundo valor: ");
            float valor2 = sc.nextFloat();

            if (valor1 % valor2 == 0) {
                System.out.format(valor1 + " É divisivel por " + valor2 + ".");
                return;
            }
            System.out.format(valor1 + " NÃO É divisivel por " + valor2 + ".");


        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void exercise4(){
        try {
            Scanner sc = new Scanner(System.in);
            // GET START TIME
            System.out.println("------HORÁRIO INICIAL------");
            System.out.print("Hora: ");
            int horaInicial = sc.nextInt();

            System.out.print("Minutos: ");
            int minutosInicial = sc.nextInt();


            // GET END TIME
            System.out.println("------HORÁRIO FINAL------");
            System.out.print("Hora: ");
            int horaFinal = sc.nextInt();

            System.out.print("Minutos: ");
            int minutosFinal = sc.nextInt();

            // CHECK IF TIME IS VALID
            if (horaInicial >= 24 ||
                    horaInicial< 0 ||
                    horaFinal >= 24 ||
                    horaFinal < 0 ||
                    minutosInicial >= 60 ||
                    minutosInicial < 0 ||
                    minutosFinal >= 60 ||
                    minutosFinal < 0) throw new InputMismatchException();

            // CHECK IF IT END IN THE NEXT DAY
            if (horaFinal < horaInicial || horaFinal <= horaInicial && minutosFinal <= minutosInicial) horaFinal += 24;
            if (minutosFinal < minutosInicial) {
                horaFinal--;
                minutosFinal += 60;
            }

            System.out.println("O jogo durou " + (horaFinal - horaInicial) + " horas e " + (minutosFinal - minutosInicial) + " minutos.");

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise5() {
        try {
            Scanner sc = new Scanner(System.in);

            // GET START TIME
            System.out.println("------HORÁRIO INICIAL------");
            System.out.print("Hora: ");
            int horaInicial = sc.nextInt();

            System.out.print("Minutos: ");
            int minutosInicial = sc.nextInt();


            // GET END TIME
            System.out.println("------HORÁRIO FINAL------");
            System.out.print("Hora: ");
            int horaFinal = sc.nextInt();

            System.out.print("Minutos: ");
            int minutosFinal = sc.nextInt();

            // CHECK IF TIME IS VALID
            if (horaInicial >= 24 ||
                    horaInicial< 0 ||
                    horaFinal >= 24 ||
                    horaFinal < 0 ||
                    minutosInicial >= 60 ||
                    minutosInicial < 0 ||
                    minutosFinal >= 60 ||
                    minutosFinal < 0) throw new InputMismatchException();

            // CHECK IF IT END IN THE NEXT DAY
            if (horaFinal < horaInicial || horaFinal <= horaInicial && minutosFinal <= minutosInicial) horaFinal += 24;
            if (minutosFinal < minutosInicial) {
                horaFinal--;
            }

            int valorPagar = 50;
            if ((horaFinal - horaInicial) > 2) valorPagar += ((horaFinal - horaInicial) - 2) * 20;

            System.out.println("Valor a pagar: R$" + valorPagar);

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise6() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Lado 1: ");
            float lado1 = sc.nextFloat();

            System.out.print("Lado 2: ");
            float lado2 = sc.nextFloat();

            System.out.print("Lado 3: ");
            float lado3 = sc.nextFloat();

            if (lado1 > Math.abs(lado3 - lado2) && (lado1 < (lado2 + lado3)) ||
                lado2 > Math.abs(lado3 - lado1) && (lado2 < (lado1 + lado3)) ||
                lado3 > Math.abs(lado1 - lado2) && (lado3 < (lado2 + lado1)))
            {
                if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
                {
                    System.out.println("O triângulo é ESCALENO.");
                    return;
                }
                if (lado1 == lado2 && lado1 == lado3)
                {
                    System.out.println("O triângulo é EQUILÁTERO.");
                    return;
                }
                System.out.println("O triângulo é ISÓSCELES.");

            } else {
                System.out.println("Não é triângulo.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor inváido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise7() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira o valor: ");
            int value = sc.nextInt();

            // THROW ERROR WHEN VALUE IS NOT 4 DIGITS
            if (value < 1000) throw new InputMismatchException();

            // GET THE HALF OF THE VALUE
            int leftHalf = Integer.parseInt(Integer.toString(value).substring(0, 2));
            int rightHalf = Integer.parseInt(Integer.toString(value).substring(2));
            int halfSum = leftHalf + rightHalf;

            // CHECK IF IT HAS THE PROPERTIES
            if (Math.pow(halfSum, 2) == value) {
                System.out.println("POSSUI a mesma característica que o número 3025.");
                return;
            }
            System.out.println("NÃO POSSUI a mesma característica do número 3025.");

         // BUG HANDLER
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise8() {
        try {
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.print("Primeiro valor: ");
            float valor1 = sc.nextFloat();

            System.out.print("(+, -, x, /): ");
            String operador = sc.next().toLowerCase();

            System.out.print("Segundo valor: ");
            float valor2 = sc.nextFloat();

            System.out.println("\n----------RESULTADO----------\n");

            switch (operador)
            {
                case "+" -> System.out.println(df.format(valor1) + " + " + df.format(valor2) + " = " + df.format(valor1 + valor2));
                case "-" -> System.out.println(df.format(valor1) + " - " + df.format(valor2) + " = " + df.format(valor1 - valor2));
                case "x" -> System.out.println(df.format(valor1) + " x " + df.format(valor2) + " = " + df.format(valor1 * valor2));
                case "/" -> System.out.println(df.format(valor1) + " / " + df.format(valor2) + " = " + df.format(valor1 / valor2));
                default -> System.out.println("Operador inválido");
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void exercise9() {
        try {
            Scanner sc = new Scanner(System.in);
            float aumentoSalario;

            System.out.print("Plano de trabalho (A, B, C, D, E): ");
            char planoTrabalho = sc.next().toLowerCase().charAt(0);

            switch (planoTrabalho) {
                case 'a' -> aumentoSalario = 0.1f;
                case 'b' -> aumentoSalario = 0.15f;
                case 'c' -> aumentoSalario = 0.2f;
                case 'd' -> aumentoSalario = 0.25f;
                case 'e' -> aumentoSalario = 0.3f;
                default -> {
                    System.out.println("Plano inválido.");
                    return;
                }
            }
            System.out.print("Salário: R$");
            float salario = sc.nextFloat();

            System.out.println("Salário atualizado: R$" + (salario + (salario * aumentoSalario)));

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
