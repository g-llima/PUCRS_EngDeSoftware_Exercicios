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
}
