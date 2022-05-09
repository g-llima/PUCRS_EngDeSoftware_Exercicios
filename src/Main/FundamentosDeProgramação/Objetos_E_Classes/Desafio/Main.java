class Main {  
  public static void main(String args[]) {     
    Veiculo v = new Veiculo(52, 13);       
    System.out.println(v.getCombustivelNoTanque());
    v.abastece(5);
    System.out.println(v.getCombustivelNoTanque());
    System.out.println(v.dirige(100));
    System.out.println(v.getCombustivelNoTanque());
  } 
}

class Veiculo {

  private double combNoTanque;
  private double combMax;
  private double combPorKM;

  public Veiculo(double combMax, double combPorKM) {
    this.combNoTanque = 0;
    this.combMax = combMax;
    this.combPorKM = combPorKM;
  }

  public double getCombustivelNoTanque() {
    return combNoTanque;
  }
  
  public double abastece(double l) {
      combNoTanque += l;
      return combMax - combNoTanque;
  }
  public double dirige(double d) {
    if (d / combPorKM < combNoTanque) {
      combNoTanque -= d / combPorKM;
      return d;
    }
    double resultado = combNoTanque * combPorKM;
    combNoTanque = 0;
    return resultado;
  }
  
}
