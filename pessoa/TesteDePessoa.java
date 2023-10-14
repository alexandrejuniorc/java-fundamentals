package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "1234";
        pessoa.idade = 12;
        pessoa.nome = "João";
        pessoa.imprimirDadosDaPessoa();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "12345454";
        pessoa1.idade = 122;
        pessoa1.nome = "João1";
        pessoa1.imprimirDadosDaPessoa();
    }
}
