package primeirasAulas;
import java.util.HashSet;

public class ColecaoHashSet {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Joaquim");

        System.out.println(nomes);

        for(String elemento: nomes) {
            System.out.println("O nome é: " + elemento);
        }


        System.out.println(nomes.contains("João"));
    }
}
