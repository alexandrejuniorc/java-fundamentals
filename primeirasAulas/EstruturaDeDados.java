package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    
    public static void main(String[] args) {
        // Lista

        List<String> nomes = new ArrayList<String>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Joaquim");

        System.out.println(nomes);

        // for(String nome: nomes) {
        //     System.out.println("O nome é: " + nome);
        // }

        nomes.forEach(nome -> {
            System.out.println("O nome é: " + nome);
        });
    }
}
