import java.util.Scanner;

public class ExeCom0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpeza de buffer
        System.out.print("Profissão: ");
        String prof = sc.nextLine();

        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nProfissão: " + prof);
        sc.close();
    }
}
