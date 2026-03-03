/**
 * @author Guilherme L Oliveira
 * @version 1.0
 *          Aula de introdução
 */

public class Variaveis {

    public static void main(String[] args) {

        // Inteiros
        byte numeroPequeno = 123; // -128 a 127
        short numeroShort = 1234; // -32767 a 32767
        int numeroInt = 123123; // -2147483648 a 2147483647
        long numeroLong = 1231231322131231l; // -9223372036854775808 a 9223372036854775807

        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);

        // Ponto flutuante
        float numeroFloat = 3.5f;
        double numeroDouble = 4.5;

        System.out.println(numeroFloat);
        System.out.println(numeroDouble);

        // variável do tipo caracter
        char letra = 'C';

        // variavel do tipo falso e verdadeiro
        boolean estouComFome = true;

        System.out.println(letra);
        System.out.println(estouComFome);

        // Classe String para texto
        String texto = "texto";
        System.out.println(texto);

    }
}