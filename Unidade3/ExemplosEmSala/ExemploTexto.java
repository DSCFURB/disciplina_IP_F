public class ExemploTexto {
    public static void main(String[] args) {
        String frase = "Java 2026";

        // Métodos da classe String
        System.out.println("Frase: " + frase);
        System.out.println("Tamanho: " + frase.length());
        System.out.println("Caractere na posição 0: " + frase.charAt(0));
        System.out.println("É igual a 'Java'? " + frase.equals("Java "));

        // Métodos da classe Character (estáticos)
        char letra = frase.charAt(0);
        char digito = frase.charAt(5);

        System.out.println("\nAnálise de caracteres:");
        System.out.println("'" + letra + "' é letra? " + Character.isAlphabetic(letra));
        System.out.println("'" + digito + "' é número? " + Character.isDigit(digito));

        // Conversão usando Character
        System.out.println("Letra em maiúscula: " + Character.toUpperCase(letra));
    }
}