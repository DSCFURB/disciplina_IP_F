import java.util.Scanner;

public class Uni4Prova03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o código (P, M, V ou PL): ");
        String entrada = teclado.next().toUpperCase();

        // Lógica Híbrida: Testando == para char e .equals para String
        if (entrada.length() == 1) {
            char c = entrada.charAt(0); // Extrai o char para usar ==
            
            if (c == 'P') {
                System.out.println("Descrição: Papel");
            } else if (c == 'M') {
                System.out.println("Descrição: Metal");
            } else if (c == 'V') {
                System.out.println("Descrição: Vidro");
            } else {
                System.out.println("Código Desconhecido");
            }
        } else if (entrada.equals("PL")) { // Usa .equals para a String de 2 dígitos
            System.out.println("Descrição: Plástico");
        } else {
            System.out.println("Código Desconhecido");
        }

        teclado.close();
    }
}