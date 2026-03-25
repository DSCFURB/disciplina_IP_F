import java.util.Scanner;

public class ExeCom0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String n = sc.nextLine();
        System.out.print("Cidade: ");
        String c = sc.nextLine();
        System.out.print("Comida: ");
        String f = sc.nextLine();

        System.out.printf("%s, de %s, provavelmente quer comer %s agora.", n, c, f);
        sc.close();
    }
}
