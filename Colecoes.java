import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>(); 
        notas.put("Ale", 10);
        notas.put("Dani", 7);
        notas.put("Joao", 5);

        var nota = notas.get("Ale");

        for(Map.Entry<String, Integer> entry: notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é: " + key + " e o valor é: " + value);
        }

    }
}
