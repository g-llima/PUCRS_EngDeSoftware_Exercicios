package Main.FundamentosDeProgramação.Objetos_E_Classes;

import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex4.Pessoa;
import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5.ControleRemoto;
import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5.Televisao;

public class Main {
    public static void main(String[] args) {


/*        ================| EXERCÍCIO 4 |=====================        */

//        Pessoa p1 = new Pessoa("Gabriel", "05/08/2003", 183);
//        System.out.println(p1);
//        System.out.println(p1.getIdade());


/*        ================| EXERCÍCIO 5 |=====================        */

        Televisao tv = new Televisao();
        ControleRemoto cr = new ControleRemoto();

        System.out.println(tv.getVolume());

        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.aumentarVolume();
        cr.irParaCanal(58);

        System.out.println(cr.getInfo());

    }
}
