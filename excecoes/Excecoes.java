package excecoes;

import pessoa.Pessoa;

public class Excecoes {

    // Checked Exceptions
    // try {
    // validarNumero();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    // Unchecked Exceptions
    // Pessoa pessoa = new Pessoa();
    // Pessoa pessoa = null;
    // pessoa.getCpf();

    public static void main(String[] args) {
        // try {
        // validarNumero();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // Pessoa pessoa = new Pessoa();
        // Pessoa pessoa = null;
        // pessoa.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O numero deve ser maior que 100");
        }
    }
}
