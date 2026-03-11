import java.util.Scanner; // Necessário para entrada de dados
import java.lang.Math; // Opcional (java.lang é importado automaticamente)

public class ExemploMatematica {
    public static void main(String[] args) {
        // Scanner precisa ser instanciado
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cálculos com java.lang.Math ---");
        System.out.print("Digite um número: ");
        double num = leitor.nextDouble();

        // Exemplos de métodos estáticos da classe Math
        System.out.println("Raiz Quadrada: " + Math.sqrt(num));
        System.out.println("Potência (num²): " + Math.pow(num, 2));
        System.out.println("Valor Absoluto: " + Math.abs(num));
        System.out.println("Seno (radianos): " + Math.sin(num));
        System.out.println("Logaritmo Natural: " + Math.log(num));

        leitor.close();
    }
}