package Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Acoes;

import Main.FundamentosDeProgramação.Trabalhos.TrabalhoFinal.Entidades.Dinossauro;

public class CadastroDinossauro {

    Dinossauro[] dinossauros = new Dinossauro[10];

    public boolean adicionarDinossauro(Dinossauro dino) {
        int pos = -1;
        for (int i = 0; i < dinossauros.length; i++)
            if (dinossauros[i] == null) {
                pos = i;
                break;
            }
        if (pos != -1) {
            dinossauros[pos] = dino;
            return true;
        }
        return false;
    }
    public Dinossauro pesquisarDinossauro(int id) {
        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getId() == id) return d;
        }
        return null;
    }

    public void exibirDinossauros() {
        for (Dinossauro d : dinossauros) {
            System.out.println(d);
        }
    }
}
