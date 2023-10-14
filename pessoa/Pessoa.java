package pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo nomeDaVariavel

    String nome;
    int idade;
    String cpf;

    public void imprimirDadosDaPessoa () {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
    }
}
