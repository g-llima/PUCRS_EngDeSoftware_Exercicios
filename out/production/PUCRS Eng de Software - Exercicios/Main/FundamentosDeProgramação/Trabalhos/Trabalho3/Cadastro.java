package Main.FundamentosDeProgramação.Trabalhos.Trabalho3;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Funcionario("Adã", "66572549214", 30, 44, false),
                new Funcionario("Gabriel", "78598426884", 4, 44, true),
                new Funcionario("Romero Brito", "89547836984", 30, 30, true),
                new Funcionario("Benjamin", "25468459870", 44, 50, true),
                new Funcionario("Periclão", "12345678991", 30, 35, false),
        };

        boolean isLooping = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    """
                    -----------| MENU |-----------
                    1. Cadastrar novo funcionario
                    2. Listar todos os funcionários cadastrados
                    3. Remover um funcionário a partir de um CPF
                    4. Editar o salário de um funcionário a partir de um CPF
                    5. Imprimir funcionário com maior salário
                    6. Imprimir percentual de funcionário que possuem filhos
                    7. Sair do programa.
                    """);

            int userInput = Integer.parseInt(sc.nextLine());
            switch (userInput) {
                case 1:
                    break;
                case 2:
                    System.out.println("\n-----------| LISTA DOS FUNCIONÁRIOS |-----------");
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    System.out.println("\n-----------| REMOVER FUNCIONÁRIO |-----------");
                    removerFuncionario(funcionarios);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    isLooping = false;
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("Valor inválido.");
            }

        } while (isLooping);
    }

    private static void cadastrarFuncionario(Funcionario[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("CPF do funcionário: ");
        String cpf = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        float horasTrabalhadas = Float.parseFloat(sc.nextLine());

        System.out.print("Carca horaria semanal: ");
        float cargaHorariaSemanal = Float.parseFloat(sc.nextLine());

        System.out.print("Tem filhos? (1 = sim; 2 = não) ");
        boolean temFilhos = Integer.parseInt(sc.nextLine()) == 1;
    }
    private static void listarFuncionarios(Funcionario[] arr) {
        for (Funcionario f : arr) {
            System.out.println(f);
        }
        System.out.println("\n\n");
    }
    private static void removerFuncionario(Funcionario[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF:");
        String cpfUsuario = sc.nextLine();

    }
    private static void editarSalarioFuncionario(Funcionario[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF:");
        String cpfUsuario = sc.nextLine();

        System.out.print("Insira o novo salário:");
        float novoSalario = Float.parseFloat(sc.nextLine());



    }
}
