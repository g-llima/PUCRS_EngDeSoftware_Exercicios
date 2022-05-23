package Main.FundamentosDeProgramação.Trabalhos.Trabalho3;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Adã", "66572549214", 10.5f, 44, false));
        funcionarios.add(new Funcionario("Gabriel", "78598426884", 4, 44, true));
        funcionarios.add(new Funcionario("Romero Brito", "89547836984", 11, 30, true));
        funcionarios.add(new Funcionario("Benjamin", "25468459870", 44, 50, true));
        funcionarios.add(new Funcionario("Periclão", "12345678991", 1, 35, false));

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
                    cadastrarFuncionario(funcionarios);
                    break;
                case 2:
                    listarFuncionarios(funcionarios);
                    break;
                case 3:
                    removerFuncionario(funcionarios);
                    break;
                case 4:
                    editarSalarioFuncionario(funcionarios);
                    break;
                case 5:
                    funcionarioComMaiorSalario(funcionarios);
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

    private static void cadastrarFuncionario(List<Funcionario> arr) {
        System.out.println("\n-----------| CADASTRAR FUNCIONÁRIO |-----------\n");
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

        arr.add(new Funcionario(nome, cpf, horasTrabalhadas, cargaHorariaSemanal, temFilhos));
    }
    private static void listarFuncionarios(List<Funcionario> arr) {
        System.out.println("\n-----------| LISTA DOS FUNCIONÁRIOS |-----------\n");

        for (Funcionario f : arr) {
            System.out.println(f);
        }
        System.out.println("\n\n");
    }
    private static void removerFuncionario(List<Funcionario> arr) {
        System.out.println("\n-----------| REMOVER FUNCIONÁRIO |-----------\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF: ");
        String cpfUsuario = sc.nextLine();

        Funcionario funcionario = arr.stream().filter(x -> cpfUsuario.equals(x.getCpf())).findAny().orElse(null);

        if (funcionario == null) {
            System.err.println("\nFuncionário não encontrado.\n");
            return;
        }

        boolean isLooping = true;

        do {
            System.out.println("\nVocê quer realmente remover o seguinte funcionário? (s,n)");
            System.out.println(funcionario);

            char respostaUsuario = sc.nextLine().toLowerCase().charAt(0);
            if (respostaUsuario == 's') {
                arr.remove(funcionario);
                System.out.println("Funcionário removido.");
                isLooping = false;
                return;
            }
            if (respostaUsuario == 'n') {
                System.out.println("Voltando...");
                isLooping = false;
                return;
            }
        } while (isLooping);
    }
    private static void editarSalarioFuncionario(List<Funcionario> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF:");
        String cpfUsuario = sc.nextLine();

        Funcionario funcionario = arr.stream().filter(x -> cpfUsuario.equals(x.getCpf())).findAny().orElse(null);

        if (funcionario == null) {
            System.err.println("\nFuncionário não encontrado.\n");
            return;
        }

        System.out.print("Insira o novo salário: (por hora)");
        float novoRemuneracaoPorHora = Float.parseFloat(sc.nextLine());

        funcionario.setRemuneracaoPorHora(novoRemuneracaoPorHora);
        System.out.print("Salário de " + funcionario.getNome() + " modificado.\n");
    }
    private static void funcionarioComMaiorSalario(List<Funcionario> arr) {
        if (arr.size() == 0) {
            System.err.println("\nNenhum funcionário cadastrado.\n");
            return;
        }

        float maior = arr.get(0).getSalario();
        Funcionario funcionarioMaior = arr.get(0);

        for (Funcionario f : arr) {
            if (f.getSalario() > maior) {
                maior = f.getSalario();
                funcionarioMaior = f;
            }
        }
        System.out.println("\n-----------| FUNCIONÁRIO COM MAIOR SALÁRIO |-----------\n");
        System.out.println(funcionarioMaior.toString());
    }
}