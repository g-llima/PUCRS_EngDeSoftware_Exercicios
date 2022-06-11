package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal;

import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Acoes.CadastroDinossauro;
import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades.Dinossauro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CadastroDinossauro cd = new CadastroDinossauro();

        Dinossauro d1 = new Dinossauro(0, "T-REX", 1, 3, 2030, 30);
        Dinossauro d2 = new Dinossauro(1, "PTERO", 2, 1, 529, 69);
        Dinossauro d3 = new Dinossauro(2, "VELOCI", 1, 1, 53, 70);
        Dinossauro d4 = new Dinossauro(3, "VELOCI2", 1, 1, 53, 0);
        Dinossauro d5 = new Dinossauro(4, "VELOCI3", 1, 1, 53, 90);
        Dinossauro d6 = new Dinossauro(5, "VELOCI4", 1, 1, 53, 1020);
        Dinossauro d7 = new Dinossauro(6, "T-REX", 1, 3, 2030, 30);
        Dinossauro d8 = new Dinossauro(7, "PTERO", 2, 1, 529, 69);
        Dinossauro d9 = new Dinossauro(8, "VELOCI", 1, 1, 53, 70);
        Dinossauro d10 = new Dinossauro(9, "VELOCI2", 1, 1, 53, 0);
        Dinossauro d11 = new Dinossauro(10, "VELOCI3", 1, 1, 53, 90);
        Dinossauro d12 = new Dinossauro(11, "VELOCI4", 1, 1, 53, 1020);

        cd.adicionarDinossauro(d1);
        cd.adicionarDinossauro(d2);
        cd.adicionarDinossauro(d3);
        cd.adicionarDinossauro(d4);
        cd.adicionarDinossauro(d5);
        cd.adicionarDinossauro(d6);
        cd.adicionarDinossauro(d7);
        cd.adicionarDinossauro(d8);
        cd.adicionarDinossauro(d9);
        cd.adicionarDinossauro(d10);
        cd.adicionarDinossauro(d11);
        cd.adicionarDinossauro(d12);


        System.out.println(cd.relatorioPossivelFuga(-1, 20, 6));


    }
}
