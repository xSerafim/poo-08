package Model;

public class ContaBancaria {
  private String cliente;
  private int numConta;
  private float saldo;

  public ContaBancaria(String cliente, int numConta, float saldo) {
    this.cliente = cliente;
    this.numConta = numConta;
    this.saldo = saldo;
  }

  public void sacar(float valor) {
    if (saldo - valor >= 0) {
      saldo -= valor;
      System.out.println("Saque de " + valor + " realizado com sucesso.");
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(float valor) {
    saldo += valor;
    System.out.println("Depósito de " + valor + " realizado com sucesso.");
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
}
