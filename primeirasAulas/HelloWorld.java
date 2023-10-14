package primeirasAulas;

/**
 * HelloWorld = Nome da minha classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */
public class HelloWorld {

    // Todo conteudo devera ser inserido aqui dentro

    public static void main(String[] args) {
        /**
         * Tipos de dados
         * Numeros (int, double, float, long)
         * Texto (String)
         * Boleano (boolean)
         */

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 10.0;
        float dadoDoTipoFloat = 10.0f;
        long dadoDoTipoLong = 10L;
        String dadoDoTipoString = "Hello World";
        boolean dadoDoTipoBoolean = true;

        // if - else
        if (dadoDoTipoInt == 10) {
            // sysout - print
            System.out.println("Entrou no if");
        } else if (dadoDoTipoInt == 20) {
            System.out.println("Entrou no else if");

        } else {
            System.out.println("Entrou no else");
        }


        // While (Enquanto algo for verdadeiro, faça alguma coisa) 
        int valorInicial = 0;
        while(valorInicial < 3) {
            // System.out.println(valorInicial);
            valorInicial++; // valor inicial = valor inicial + 1
        }

        // For
        for (int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " + i);
        }
    }

}

// Fora do escopo da classe
