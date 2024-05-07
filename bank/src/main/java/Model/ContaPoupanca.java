package Model;

public class ContaPoupanca extends ContaBancaria {
  private int diaRendimento;

  public ContaPoupanca(String cliente, int numConta, float saldo, int diaRendimento) {
    super(cliente, numConta, saldo);
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo(float taxaRendimento) {
    float rendimento = getSaldo() * taxaRendimento / 100;
    setSaldo(getSaldo() + rendimento);
    System.out.println("Rendimento aplicado. Novo saldo: " + getSaldo());
  }

  public int getDiaRendimento() {
    return diaRendimento;
  }

  public void setDiaRendimento(int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }
}
