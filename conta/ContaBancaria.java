package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria() {
        this.saldo = 50;
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Depositar
    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " feito com sucesso!" + "Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("O valor de deposito precisa ser maior que zero");
        }
    }

    // Sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso");
        } else {
            System.out.println("Valor invalido");
        }
    }
}
