
/**
 * @author Guilherme Legal de Oliveira
 * @version 1.0
 * @description Sorteador simples
 * @date 2026-03-24
 */

import java.util.Scanner;
import java.util.Random;

public class SorteadorSimples {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("=== SORTEADOR SIMPLIFICADO ===");

        // Entrada de dados simples
        System.out.print("Digite o número inicial: ");
        int inicio = leitor.nextInt();

        System.out.print("Digite o número final: ");
        int fim = leitor.nextInt();

        // Lógica de sorteio:
        // O nextInt(limite) gera de 0 até o limite.
        // Ajustamos o cálculo para que ele respeite o intervalo do aluno.
        int intervalo = (fim - inicio) + 1;
        int numeroSorteado = gerador.nextInt(intervalo) + inicio;

        System.out.println("\n------------------------------");
        System.out.println("O número sorteado foi: " + numeroSorteado);
        System.out.println("------------------------------");
        System.out.println("Para sortear novamente, execute o programa de novo.");

        leitor.close();
    }
}