package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal;

import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Acoes.CadastroDinossauro;
import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades.Dinossauro;

public class Main {

    public static void main(String[] args) {
        CadastroDinossauro cd = new CadastroDinossauro();

        Dinossauro d1 = new Dinossauro(0, "T-REX", 1, 1, 2030, 30);
        Dinossauro d2 = new Dinossauro(1, "PTERO", 2, 1, 529, 69);
        Dinossauro d3 = new Dinossauro(2, "VELOCI", 2, 1, 53, 70);

        System.out.println(cd.adicionarDinossauro(d1));
        System.out.println(cd.adicionarDinossauro(d2));
        System.out.println(cd.adicionarDinossauro(d3));

        cd.exibirDinossauros();

//        System.out.println(cd.removerDinossauro(1));

        System.out.println(cd.relatorioPesoPesado(2, 1));


    }
}
