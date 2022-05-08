package Main.FundamentosDeProgramação.Objetos_E_Classes;

import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex4.Pessoa;
import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5.ControleRemoto;
import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex5.Televisao;
import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex6.ContaCorrente;

public class Main {
    public static void main(String[] args) {


/*        ================| EXERCÍCIO 4 |=====================        */

//        Pessoa p1 = new Pessoa("Gabriel", "05/08/2003", 183);
//        System.out.println(p1);
//        System.out.println(p1.getIdade());




/*        ================| EXERCÍCIO 5 |=====================        */

//        Televisao tv = new Televisao();
//        ControleRemoto cr = new ControleRemoto();
//
//        System.out.println(tv.getVolume());
//
//        cr.aumentarVolume();
//        cr.aumentarVolume();
//        cr.aumentarVolume();
//        cr.irParaCanal(58);
//
//        System.out.println(cr.getInfo());


/*        ================| EXERCÍCIO 6 |=====================        */
        ContaCorrente cc = new ContaCorrente(100);
        System.out.println(cc.getSaldo());

        cc.depositar(150);
        System.out.println(cc.getSaldo());

        cc.sacar(200);
        System.out.println(cc.getSaldo());

    }
}
