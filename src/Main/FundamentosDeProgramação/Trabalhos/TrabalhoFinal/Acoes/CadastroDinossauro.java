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
    public boolean removerDinossauro(int id) {
        int index = -1;
        for (int i = 0; i < dinossauros.length; i++) {
            if (dinossauros[i] == null) break;
            if (dinossauros[i].getId() == id) index = i;
        }
        if (index != -1) {
            dinossauros[index] = null;

            for (int i = index; i < dinossauros.length - 1; i++) {
                dinossauros[i] = dinossauros[i + 1];
            }
        }
        System.out.println(index);
        return index != -1;
    }
    public void exibirDinossauros() {
        for (Dinossauro d : dinossauros) {
            if (d !=  null) System.out.println(d);
        }
    }


    //          MÉTODOS PARA GERAR RELATÓRIOS

    public String relatorioPorTipoECategoria() {
        int carPP = 0, carMP = 0, carGP = 0;
        int herPP = 0, herMP = 0, herGP = 0;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == 1) {
                if (d.getCategoria() == 1) carPP++;
                else if (d.getCategoria() == 2) carMP++;
                else carGP++;
            } else {
                if (d.getCategoria() == 1) herPP++;
                else if (d.getCategoria() == 2) herMP++;
                else herGP++;
            }
        }
        return "Carnívoros: PP: " + carPP + ", MP: " + carMP + ", GP: " + carGP + ". Herbívoros: PP: " + herPP + ", MP: " + herMP + ", GP: " + herGP + ".";
    }
    public Dinossauro relatorioPesoPesado(int tipo, int categoria) {
        Dinossauro maisPesado = null;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == tipo && d.getCategoria() == categoria) {
                maisPesado = d;
                break;
            }
        }

        for (Dinossauro d : dinossauros) {
            if (d == null || maisPesado == null) break;

            if (d.getTipo() == tipo && d.getCategoria() == categoria && d.getPeso() > maisPesado.getPeso()) {
                maisPesado = d;
            }
        }
        return maisPesado;
    }
    public double relatorioQntCarneCarnivoros() {
        float valor = 0;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == 1) {
                if (d.getCategoria() == 1) valor += (d.getPeso() * 0.1f);
                else if (d.getCategoria() == 2) valor += (d.getPeso() * 0.15f);
                else valor += (d.getPeso() * 0.2f);
            }
        }
        return valor * 30;
    }
    public boolean relatorioPossivelFuga(int idDino, float distanciaDinoBunker, float distanciaPessoaBunker) {
        Dinossauro dino = null;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getId() == idDino) {
                dino = d;
                break;
            }
        }

        if (dino != null) {
            float tempoDinoBunker = (float) (distanciaDinoBunker / dino.getVelocidade());
            float tempoPessoaBunker = distanciaPessoaBunker / 20f;
            return tempoPessoaBunker < tempoDinoBunker;
        }

        return false;
    }
    public Dinossauro[] relatorioMaioresVelocidades() {
        Dinossauro[] vetorDinos = new Dinossauro[100];

        for (int i = 0; i < 10; i++) {
            if (dinossauros[i] == null) break;
            vetorDinos[i] = dinossauros[i];
        }
        return bubbleSort(vetorDinos);
    }


    private Dinossauro[] bubbleSort(Dinossauro[] arr) {
        boolean trocou = true;
        Dinossauro[] resultado = arr;

        while (trocou) {
            trocou = false;
            for (int i = 0; i < resultado.length - 1; i++) {
                if(resultado[i + 1] == null) break;
                if (resultado[i].getVelocidade() < resultado[i + 1].getVelocidade()) {
                    Dinossauro temp = resultado[i];
                    resultado[i] = resultado[i + 1];
                    resultado[i + 1] = temp;
                    trocou = true;
                }
            }
        }
        return resultado;
    }
}
