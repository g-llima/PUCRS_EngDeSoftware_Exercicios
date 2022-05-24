package Main.FundamentosDeProgramação.Trabalhos.Trabalho3;

import java.text.ParseException;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new Funcionario("Adã", "66572549214", 10.5f, 44, false);
        funcionarios[1] = new Funcionario("Gabriel", "78598426884", 4, 44, true);
        funcionarios[2] = new Funcionario("Romero Brito", "89547836984", 11, 30, true);
        funcionarios[3] = new Funcionario("Benjamin", "25468459870", 44, 50, true);
        funcionarios[4] = new Funcionario("Periclão", "12345678991", 1, 35, false);

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
                case 1 -> cadastrarFuncionario(funcionarios);
                case 2 -> listarFuncionarios(funcionarios);
                case 3 -> removerFuncionario(funcionarios);
                case 4 -> editarSalarioFuncionario(funcionarios);
                case 5 -> funcionarioComMaiorSalario(funcionarios);
                case 6 -> percentualDeFuncionariosFilhos(funcionarios);
                case 7 -> {
                    isLooping = false;
                    System.out.println("\nSaindo do programa...");
                }
                default -> System.out.println("Valor inválido.");
            }

        } while (isLooping);
    }

    private static void cadastrarFuncionario(Funcionario[] arr) {
        int index = arr.length;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == null) {
                index = i;
                break;
            }

        if (index == arr.length) {
            System.err.println("\nNúmero máximo de funcionários registrados.\n");
            return;
        }

        System.out.println("\n-----------| CADASTRAR FUNCIONÁRIO |-----------\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("CPF do funcionário: ");
        String cpf = sc.nextLine();

        float horasTrabalhadas, cargaHorariaSemanal;
        boolean temFilhos;

        try {
            System.out.print("Remuneração por hora: ");
            horasTrabalhadas = Float.parseFloat(sc.nextLine());

            System.out.print("Carga horaria semanal: ");
            cargaHorariaSemanal = Float.parseFloat(sc.nextLine());

            System.out.print("Tem filhos? (1 = sim; 2 = não) ");
            temFilhos = Integer.parseInt(sc.nextLine()) == 1;
        } catch (Exception e) {
            System.err.println("Valor inválido.\n");
            return;
        }


        arr[index] = new Funcionario(nome, cpf, horasTrabalhadas, cargaHorariaSemanal, temFilhos);
    }
    private static void listarFuncionarios(Funcionario[] arr) {
        System.out.println("\n-----------| LISTA DOS FUNCIONÁRIOS |-----------\n");

        for (Funcionario f : arr) {
            if (f == null) break;

            System.out.println(f);
        }


        System.out.println("\n");
    }
    private static void removerFuncionario(Funcionario[] arr) {
        System.out.println("\n-----------| REMOVER FUNCIONÁRIO |-----------\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF: ");
        String cpfUsuario = sc.nextLine();

        int index = 0;
        Funcionario funcionario = null;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getCpf().equals(cpfUsuario)) {
                funcionario = arr[i];
                index = i;
                break;
            }
        }

        if (funcionario == null) {
            System.err.println("Funcionário não encontrado.\n");
            return;
        }

        do {
            System.err.println("\nVocê quer realmente remover o seguinte funcionário? (s,n)\n");
            System.out.println(funcionario);

            char respostaUsuario = sc.nextLine().toLowerCase().charAt(0);
            if (respostaUsuario == 's') {

                arr[index] = null;
                for (int i = index; i < arr.length - 1; i++)
                    arr[i] = arr[i + 1];

                System.out.println("\nFuncionário removido.");
                return;
            }
            if (respostaUsuario == 'n') {
                System.out.println("\nVoltando...");
                return;
            }

        } while (true);
    }
    private static void editarSalarioFuncionario(Funcionario[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF: ");

        String cpfUsuario = sc.nextLine();
        Funcionario funcionario = null;

        for (Funcionario f : arr)
            if (f != null && f.getCpf().equals(cpfUsuario))
                funcionario = f;


        if (funcionario == null) {
            System.err.println("\nFuncionário não encontrado.\n");
            return;
        }

        System.out.print("Insira o novo salário: (por hora) ");
        float novoRemuneracaoPorHora = Float.parseFloat(sc.nextLine());

        funcionario.setRemuneracaoPorHora(novoRemuneracaoPorHora);
        System.out.print("\nSalário de " + funcionario.getNome() + " modificado.\n");
    }
    private static void funcionarioComMaiorSalario(Funcionario[] arr) {

        Funcionario funcionarioMaior = arr[0];

        if (funcionarioMaior == null) {
            System.err.println("\nNenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario f : arr)
            if (f != null && f.getSalario() > funcionarioMaior.getSalario())
                funcionarioMaior = f;

        System.out.println("\n-----------| FUNCIONÁRIO COM MAIOR SALÁRIO |-----------\n");
        System.out.println(funcionarioMaior);
    }
    private static void percentualDeFuncionariosFilhos(Funcionario[] arr) {
        float total = 0, comFilhos = 0;

        for (Funcionario f : arr)
            if (f != null) {
                total++;
                if (f.getTemFilhos()) comFilhos++;
            }

        System.out.println("\n-----------| PERCENTUAL DE FUNCIONÁRIOS COM FILHOS |-----------\n");
        System.out.printf("%.2f %%\n", (comFilhos / total) * 100);
    }
}