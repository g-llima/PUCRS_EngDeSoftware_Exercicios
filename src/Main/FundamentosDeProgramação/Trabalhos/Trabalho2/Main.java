package Main.FundamentosDeProgramação.Trabalhos.Trabalho2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seletor;
        String str;
        boolean continuarLoop = true;

        while (continuarLoop) {

            System.out.println("""

                    Bem-vindo ao programa cifrador
                    Selecione ao peração desejada:
                    1. Cifrar
                    2. Decifrar
                    3. Sair
                    """);

            System.out.print("Digite uma opção: ");
            seletor = Integer.parseInt(sc.nextLine());

            switch (seletor) {
                case 1:
                    System.out.println("---------| CIFRAR |---------");
                    System.out.print("Digite o texto: ");
                    str = sc.nextLine();

                    System.out.print("\nTexto cifrado: ");
                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (ch == ' ') {
                            System.out.print(" ");
                            continue;
                        }

                        System.out.print("p" + ch);
                    }
                    System.out.println("\n----------------------------");
                    break;
                case 2:
                    System.out.println("---------| DECIFRAR |---------");
                    System.out.print("Digite o texto: ");
                    str = sc.nextLine();

                    System.out.print("\nTexto decifrado: ");

                    for (int i = 1; i < str.length(); i+=2) {


                        if (str.charAt(i - 1) == ' ') {
                            i++;
                            System.out.print(" ");
                        }

                        char ch = str.charAt(i);


                        System.out.print(ch);

                    }
                    System.out.println("\n----------------------------");
                    break;
                case 3:
                    System.out.println("\nSaindo...");
                    continuarLoop = false;
                    break;
                default:
                    System.out.println("\nOpção inválida.");
                    break;
            }

        }
    }

}
