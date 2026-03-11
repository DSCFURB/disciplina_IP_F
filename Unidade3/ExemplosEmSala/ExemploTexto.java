public class ExemploTexto {
    public static void main(String[] args) {
        
        // Declarando uma variável do tipo String (Cadeia de caracteres)
        // Lembre-se: Strings em Java são objetos, não apenas tipos primitivos.
        String frase = "Java 2026";

        // --- MÉTODOS DA CLASSE STRING ---
        
        System.out.println("Conteúdo da frase: " + frase);

        // .length() retorna a quantidade total de caracteres (incluindo espaços)
        System.out.println("Tamanho total da frase: " + frase.length());

        // .charAt(index) busca o caractere em uma posição específica.
        // IMPORTANTE: Em Java, a contagem começa em 0. 
        // [J]=0, [a]=1, [v]=2, [a]=3, [ ]=4, [2]=5...
        System.out.println("O primeiro caractere (índice 0) é: " + frase.charAt(0));

        // .equals() compara o CONTEÚDO das Strings. 
        // Nunca use '==' para comparar textos em Java, use sempre .equals()
        System.out.println("A frase é exatamente igual a 'Java'? " + frase.equals("Java"));

        
        // --- MÉTODOS DA CLASSE CHARACTER ---
        
        // Aqui pegamos caracteres específicos para testar a classe Character
        char letra = frase.charAt(0); // Pega o 'J'
        char digito = frase.charAt(5); // Pega o '2'

        System.out.println("\n--- Análise Individual de Caracteres ---");

        // Character.isAlphabetic() verifica se o que está na variável é uma letra
        // Note que chamamos direto pelo nome da Classe (Método Estático)
        System.out.println("O caractere '" + letra + "' é uma letra? " + Character.isAlphabetic(letra));

        // Character.isDigit() verifica se o caractere é um número de 0 a 9
        System.out.println("O caractere '" + digito + "' é um número? " + Character.isDigit(digito));
        
        // --- CONVERSÃO ---
        
        // Character.toUpperCase() transforma um caractere minúsculo em maiúsculo
        // Se já estiver em maiúsculo, ele apenas mantém.
        System.out.println("Transformando '" + letra + "' em maiúscula: " + Character.toUpperCase(letra));
        
        // Exemplo extra: transformar em minúscula
        System.out.println("Transformando '" + letra + "' em minúscula: " + Character.toLowerCase(letra));
    }
}
