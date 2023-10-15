package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("João");

        contaBancaria1.depositar(50);
        System.out.println(contaBancaria1.getSaldo());

        contaBancaria1.sacar(20);
        System.out.println(contaBancaria1.getSaldo());

        contaBancaria1.sacar(100);
    }
}
