package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal;

import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Acoes.CadastroDinossauro;
import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades.Dinossauro;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Todo o programa foi feito por mim, de forma indivídual.
 * Autor: Gabriel.
 * N° da matrícula:
 *
 * IMPORTANTE: Estou utilizando o JDK 17, por isso o uso do switch simplificado e do print diferente. Alguns computadores
 * do laboratório precisam atualizar o JDK para rodar o código.
 */

public class Main {

    static CadastroDinossauro cd = new CadastroDinossauro();

    public static void main(String[] args) {
        exibirInterface();
    }

    private static void exibirInterface() {
        Scanner sc = new Scanner(System.in);
        boolean looping = true;

        System.out.println("""
    oooo ooooo     ooo ooooooooo.         .o.        .oooooo..o ooooo   .oooooo.         oooooooooooo   .oooooo.     .oooooo.  \s
   `888 `888'     `8' `888   `Y88.      .888.      d8P'    `Y8 `888'  d8P'  `Y8b       d'""\"""\"d888'  d8P'  `Y8b   d8P'  `Y8b \s
    888  888       8   888   .d88'     .8"888.     Y88bo.       888  888                     .888P   888      888 888      888\s
    888  888       8   888ooo88P'     .8' `888.     `"Y8888o.   888  888                    d888'    888      888 888      888\s
    888  888       8   888`88b.      .88ooo8888.        `"Y88b  888  888                  .888P      888      888 888      888\s
    888  `88.    .8'   888  `88b.   .8'     `888.  oo     .d8P  888  `88b    ooo         d888'    .P `88b    d88' `88b    d88'\s
.o. 88P    `YbodP'    o888o  o888o o88o     o8888o 8""88888P'  o888o  `Y8bood8P'       .8888888888P   `Y8bood8P'   `Y8bood8P' \s
`Y888P
""");

        while (looping) {
            System.out.println("""
                        
                    1. Adicionar dinossauro
                    2. Pesquisar dinossauro
                    3. Remover dinossauro
                    4. Exibir todos os dinossauros
                    5. Exibir relatorio da quantiade de dinossauros de cada tipo e categoria
                    6. Exibir relatorio do dinossauro mais pesado de um tipo e categoria
                    7. Exibir relatorio da quantidade de carne gasta para os carnivoros
                    8. Exibir relatorio para verificar se eh possivel fugir de um dinossauro
                    9. Exibir relatorio dos 10 dinossauros mais rapidos
                    10. Sair
                                    
                    Insira um valor: """);

            try {
                int opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1 -> addDino();
                    case 2 -> getDino();
                    case 3 -> removeDino();
                    case 4 -> exibirDinos();
                    case 5 -> exibirRelatDinosTipoCat();
                    case 6 -> exibirRelatDinosMaisPesadoTipoCat();
                    case 7 -> exibirRelatCarneCarnivoros();
                    case 8 -> exibirRelatFugirDino();
                    case 9 -> exibirRelatTopCorredores();
                    case 10 -> { return; }
                    default -> throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Opcão invalida.");
            }
        }
    }
    private static void addDino() {
        Scanner sc = new Scanner(System.in);
        Dinossauro dino;

        do {
            System.out.println("\n ------ ADICIONAR DINOSSAURO ------ ");

            System.out.print("\nNome da raca: ");
            String nomeRaca = sc.nextLine();

            System.out.print("\nTipo do dinossauro (1 = carnivoro, 2 = herbivoro): ");
            int tipo;
            try {
                tipo = Integer.parseInt(sc.nextLine());
                if (tipo != 1 && tipo != 2) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("\nTipo invalido.");
                continue;
            }

            System.out.print("\nCategoria do dinossauro (1 = PP, 2 = MP, 3 = GP): ");
            int categoria;
            try {
                categoria = Integer.parseInt(sc.nextLine());
                if (categoria != 1 && categoria != 2 && categoria != 3) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("\nCategoria invalida.");
                continue;
            }

            System.out.print("\nPeso do dinossauro (kg): ");
            double peso;
            try {
                peso = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nPeso invalido.");
                continue;
            }

            System.out.print("\nVelocidade do dinossauro (km/h): ");
            double velocidade;
            try {
                velocidade = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nVelocidade invalida.");
                continue;
            }
            dino = new Dinossauro(cd.tamanhoVetorNaoNulo(), nomeRaca, tipo, categoria, peso, velocidade);
            break;
        } while (true);
        System.out.println(cd.adicionarDinossauro(dino));
    }
    private static void getDino() {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            try {
                System.out.println("\n ------ PESQUISAR DINOSSAURO ------ ");
                System.out.print("\nInsira o ID do dinossauro: ");
                id = Integer.parseInt(sc.nextLine());
                System.out.println("\n" + cd.pesquisarDinossauro(id));
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nID invalido.");
            }
        } while (true);

    }
    private static void removeDino() {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            try {
                System.out.println("\n ------ REMOVER DINOSSAURO ------ ");
                System.out.print("Insira o ID do dinossauro: ");
                id = Integer.parseInt(sc.nextLine());
                System.out.println("\n" + cd.removerDinossauro(id));
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nID invalido.");
            }
        } while (true);

    }
    private static void exibirDinos() {
        System.out.println("\n ------ LISTA DE DINOSSAUROS ------ ");
        if (!cd.exibirDinossauros()) {
            System.out.println("\nNenhum dinossauro encontrado.");
        }
    }
    private static void exibirRelatDinosTipoCat() {
        System.out.println("\n ------ RELATORIO QUANTIDADE DE DINOSSAUROS POR TIPO E CATEGORIA ------ \n");
        System.out.println(cd.relatorioPorTipoECategoria());
    }
    private static void exibirRelatDinosMaisPesadoTipoCat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ------ RELATORIO QUANTIDADE DE DINOSSAUROS MAIS PESADO DO TIPO E CATEGORIA ------ \n");
        int tipo;
        int categoria;

        do {
            System.out.print("\nTipo do dinossauro (1 = carnivoro, 2 = herbivoro): ");
            try {
                tipo = Integer.parseInt(sc.nextLine());
                if (tipo != 1 && tipo != 2) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("\nTipo invalido.");
                continue;
            }

            System.out.print("\nCategoria do dinossauro (1 = PP, 2 = MP, 3 = GP): ");
            try {
                categoria = Integer.parseInt(sc.nextLine());
                if (categoria != 1 && categoria != 2 && categoria != 3) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("\nCategoria invalida.");
                continue;
            }
            break;
        }while (true);

        System.out.println("\n" + cd.relatorioPesoPesado(tipo, categoria));
    }
    private static void exibirRelatCarneCarnivoros() {
        System.out.println("\n ------ RELATORIO QNT. DE CARNE NECESSARIA PARA ALIMENTAR OS DINOS CARNIVOROS ------ \n");
        System.out.println(cd.relatorioQntCarneCarnivoros() + " kg/mes");
    }
    private static void exibirRelatFugirDino() {
        Scanner sc = new Scanner(System.in);
        int id;
        double distanciaDinoBunker, distanciaPessBunker;

        do {
            System.out.println("\n ------ RELATORIO SE EH POSSIVEL CORRER DE UM DINOSSAURO ------ ");
            try {
                System.out.print("Insira o ID do dinossauro: ");
                id = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nID invalido.");
                continue;
            }

            try {
                System.out.print("Insira a distância que o dinossauro esta do banker (km): ");
                distanciaDinoBunker = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nDistância invalida.");
                continue;
            }

            try {
                System.out.print("Insira a distância que a pessoa esta do banker (km): ");
                distanciaPessBunker = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nDistância invalida.");
                continue;
            }
            break;
        } while (true);
        System.out.println("\n" + cd.relatorioPossivelFuga(id, distanciaDinoBunker, distanciaPessBunker));
    }
    private static void exibirRelatTopCorredores() {
        System.out.println("\n ------ RELATORIO TOP 10 CORREDORES ------ \n");
        int count = 0;
        for (Dinossauro d : cd.relatorioMaioresVelocidades()) {
            if (d == null) break;
            count = 1;
            System.out.println(d);
        }
        if (count == 0) System.out.println("Nenhum dinossauro encontrado.");
    }
}
