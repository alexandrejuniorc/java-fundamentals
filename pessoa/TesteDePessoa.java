package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("1234");
        professor.setIdade(12);
        professor.setNome("João Professor");
        professor.setSalario(2500.25);
        professor.imprimirDadosDaPessoa(); 

        Aluno aluno = new Aluno();
        aluno.setCpf("1234");
        aluno.setIdade(12);
        aluno.setNome("João Aluno");
        aluno.setMatricula("12345");
        aluno.imprimirDadosDaPessoa(); 
    }
}
