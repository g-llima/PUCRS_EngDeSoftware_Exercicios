package Main.FundamentosDeProgramação.Objetos_E_Classes;

import Main.FundamentosDeProgramação.Objetos_E_Classes.Ex4.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gabriel", "05/08/2003", 183);
        System.out.println(p1);
        System.out.println(p1.getIdade());

    }
}
