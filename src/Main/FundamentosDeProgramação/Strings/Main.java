package Main.FundamentosDeProgramação.Strings;

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
        ex8();
    }

    private static void ex1() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira uma frase: ");
            String strOriginal = sc.nextLine();
            int vogais = 0, digitos = 0;

            System.out.println("Número de caracteres: " + strOriginal.length());
            System.out.println("Frase em maiúsculo: " + strOriginal.toUpperCase());

            for (int i = 0; i < strOriginal.length(); i++) {
                if (temVogal(strOriginal.toLowerCase().charAt(i))) { vogais++; }
            }

            System.out.println("Número de vogais: " + vogais);
            System.out.println("A frase inicia com 'INS': " + strOriginal.toLowerCase().startsWith("ins"));
            System.out.println("A frase termina com 'AIS': " + strOriginal.toLowerCase().endsWith("ais"));

            for (int i = 0; i < strOriginal.length(); i++) {
                if (temDigito(strOriginal.charAt(i))) { digitos++; }
            }

            System.out.println("Número de dígitos: " + digitos);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex2() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = sc.nextLine().replaceAll(" e | do | da | dos | das | de | di | du ", " ");

            System.out.print(nome.toUpperCase().charAt(0));

            boolean novaPalavra = false;
            for (int i = 1; i < nome.length(); i++) 
            {
                char letra = nome.toUpperCase().charAt(i);

                if (letra == ' ') {
                    novaPalavra = true;
                } else if (novaPalavra) {
                    System.out.print(letra);
                    novaPalavra = false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex3() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira o texto: ");
            String texto = sc.nextLine();

            int caracteres = 0, palavras = 0;

            for (String s : texto.split(" ")) {
                caracteres += s.length();
                palavras++;
            }

            System.out.println("\nNúmero total de caracteres: " + caracteres);
            System.out.println("Número total de palavras: " + palavras);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex4() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira o seu nome: ");
            String nome = sc.nextLine();

            for (char ch : nome.toCharArray()) {
                System.out.println(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex5() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira o seu nome: ");
            String nome = sc.nextLine();

            for (int i = 1; i <= nome.length(); i++) {
                System.out.println(nome.substring(0, i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex6() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira uma data (DD/MM/AAAA): ");
            String data = sc.nextLine();

            if (data.charAt(2) != '/' || data.charAt(5) != '/') { throw new NumberFormatException(); }

            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(3, 5));
            int ano = Integer.parseInt(data.substring(6));

            System.out.printf("\nDia: %d", dia);
            System.out.printf("\nMês: %d", mes);
            System.out.printf("\nAno: %d", ano);

        } catch (NumberFormatException e) {
            System.err.println("Data inválida.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static void ex7() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Insira uma frase ou palavra: ");
            String textoOriginal = sc.nextLine().toLowerCase().replace(" ", "");
            String textoInvertido = "";

            for (int i = textoOriginal.length() - 1; i >= 0; i--) {
                textoInvertido += textoOriginal.charAt(i);
            }

            if (textoOriginal.equals(textoInvertido)) {
                System.out.println("O texto É palíndromo.");
                return;
            }
            System.out.println("O texto NÃO É palíndromo.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void ex8() {
        try {
            Scanner sc = new Scanner(System.in);
            String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            System.out.print("Insira uma palavra ou frase: ");
            String texto = sc.nextLine().toUpperCase();

            for (int i = 0; i < texto.length(); i++) {
                char ch = texto.charAt(i);
                int index;

                if (ch == ' ') {
                    System.out.print(" ");
                    continue;
                }

                if (ch == 'X') { index = -3; }
                else if (ch == 'Y') { index = -2; }
                else if (ch == 'Z') { index = -1; }
                else {
                    index = letras.indexOf(ch);
                }

                System.out.print(letras.charAt(index + 3));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static boolean temVogal(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    static boolean temDigito(int ch) {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9';
    }
}
