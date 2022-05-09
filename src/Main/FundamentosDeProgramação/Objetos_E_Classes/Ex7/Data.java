package Main.FundamentosDeProgramação.Objetos_E_Classes.Ex7;

import java.text.ParseException;

public class Data {

    private String data;
    private int dia;
    private int mes;
    private int ano;

    public Data(String data) {
        try {
            int[] dataArray = getDataSeparado(data);

            this.dia = dataArray[0];
            this.mes = dataArray[1];
            this.ano = dataArray[2];

            if (this.dia > 30 ||
                    this.dia <= 0 ||
                    this.mes > 12 ||
                    this.mes <= 0 ||
                    this.ano > 9999 ||
                    this.ano <= 0) { throw new Exception(); }

            this.data = data;
        } catch (Exception e){
            this.data = "01/01/0001";
        }
    }

    public int compara(Data data) {
        int[] dataParametroDataArray = getDataSeparado(data.getData());

        int diaParametro = dataParametroDataArray[0];
        int mesParametro = dataParametroDataArray[1];
        int anoParametro = dataParametroDataArray[2];

        if (this.ano > anoParametro ||
                (this.ano == anoParametro && this.mes > mesParametro) ||
                (this.ano == anoParametro && this.mes == mesParametro && this.dia > diaParametro)) return 1;
        if (this.ano == anoParametro && this.mes == mesParametro && this.dia == diaParametro) return 0;
        return -1;
    }

    private String getData() {
        return data;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public String getMesExtenso() {
        String mesExtenso;

        switch (this.mes) {
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Marco";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                mesExtenso = "Mes não encontrado";
        }

        /* NÃU FUNCIONA EM TODAS AS VERSÕES
        * String mesExtenso = switch (this.mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Marco";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mes não encontrado";
        };
        */

        return mesExtenso;
    }
    public int getAno() {
        return ano;
    }
    public Data clone() {
        return new Data(this.data);
    }

    private int[] getDataSeparado(String data) {
        String[] dataArray = data.split("/");
        return new int[] {Integer.parseInt(dataArray[0]), Integer.parseInt(dataArray[1]), Integer.parseInt(dataArray[2])};
    }
}
