
/**
 * @author Guilherme Legal de Oliveira
 * @version 2.0
 * @description Programa de sorteio dinâmico via terminal com intervalo customizável 
 * e garantia de não repetição de resultados.
 * @date 2026-03-24
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteadorPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosDisponiveis = new ArrayList<>();

        System.out.println("=== Configurador de Sorteio ===");

        // Definição do intervalo
        System.out.print("Digite o número inicial (ex: 1): ");
        int inicio = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número final (ex: 31): ");
        int fim = Integer.parseInt(scanner.nextLine());

        // Validação básica (lógica)
        if (inicio >= fim) {
            System.out.println("Erro: O número final deve ser maior que o inicial.");
            scanner.close();
            return;
        }

        // Preenchimento da lista com base no intervalo escolhido
        for (int i = inicio; i <= fim; i++) {
            numerosDisponiveis.add(i);
        }

        // Embaralha a lista para ter aleatoriedade
        Collections.shuffle(numerosDisponiveis);

        System.out.println("\nPronto! Sorteio configurado de " + inicio + " até " + fim + ".");
        System.out.println("Total de números: " + numerosDisponiveis.size());

        while (!numerosDisponiveis.isEmpty()) {
            System.out.print("\n[ENTER] para sortear | ['s'] para sair: ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("s")) {
                break;
            }

            // Sorteia e remove o primeiro da lista embaralhada
            int sorteado = numerosDisponiveis.remove(0);

            System.out.println(">>> NÚMERO SORTEADO: " + sorteado + " <<<");
            System.out.println("Restam " + numerosDisponiveis.size() + " números no globo.");
        }

        if (numerosDisponiveis.isEmpty()) {
            System.out.println("\nTodos os números do intervalo foram sorteados!");
        }

        System.out.println("Fim do programa.");
        scanner.close();
    }
}