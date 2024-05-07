package Model;

public class ContaEspecial extends ContaBancaria {
  private float limite;

  public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
    super(cliente, numConta, saldo);
    this.limite = limite;
  }

  public float getLimite() {
    return limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public void sacar(float valor) {
    if (getSaldo() + limite - valor >= 0) {
      setSaldo(getSaldo() - valor);
      System.out.println("Saque de " + valor + " realizado com sucesso.");
    } else {
      System.out.println("Limite de saldo excedido.");
    }
  }
}
