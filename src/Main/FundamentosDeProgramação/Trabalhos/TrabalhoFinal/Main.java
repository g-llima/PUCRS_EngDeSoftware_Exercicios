package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal;

import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Acoes.CadastroDinossauro;
import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades.Dinossauro;

public class Main {

    public static void main(String[] args) {
        CadastroDinossauro cd = new CadastroDinossauro();

        Dinossauro d1 = new Dinossauro(0, "Raça do dino", 1, 203, 45);
        Dinossauro d2 = new Dinossauro(1, "Raça do dino2", 1, 203, 45);
        Dinossauro d3 = new Dinossauro(2, "Raça do dino2", 1, 203, 45);

        System.out.println(cd.adicionarDinossauro(d1));
        System.out.println(cd.adicionarDinossauro(d2));
        System.out.println(cd.adicionarDinossauro(d3));

        cd.exibirDinossauros();

        //System.out.println(cd.removerDinossauro(0));

        cd.exibirDinossauros();
        //System.out.println(cd.pesquisarDinossauro(0));
    }
}
