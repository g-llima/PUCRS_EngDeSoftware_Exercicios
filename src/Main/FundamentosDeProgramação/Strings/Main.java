package Main.FundamentosDeProgramação.Strings;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
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


    static boolean temVogal(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    static boolean temDigito(int ch) {
        return ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9';
    }
}
