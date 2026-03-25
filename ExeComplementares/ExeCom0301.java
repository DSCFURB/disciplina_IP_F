import java.util.Scanner;

public class ExeCom0301 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int num = teclado.nextInt();
        System.out.println("O número digitado foi: " + num);
        teclado.close();
    }
}
