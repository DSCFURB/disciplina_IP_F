
/**
 * @author Guilherme Legal de Oliveira
 * @version 3.0
 * @description Sorteador Turma F
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteadorAvancado {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> ativos = new ArrayList<>();

        // Adiciona apenas alunos ativos
        for (int i = 1; i <= 31; i++) {
            // Aluno não ativos
            if (i == 1 || i == 3 || i == 6 || i == 7 || i == 26) {
                continue;
            }
            ativos.add(i);
        }

        Collections.shuffle(ativos);

        System.out.println("=== SORTEADOR DE ALUNOS (25 ATIVOS) ===");

        while (!ativos.isEmpty()) {
            System.out.print("\n[ENTER] Próximo sorteado | [S] Sair: ");
            if (leitor.nextLine().equalsIgnoreCase("s"))
                break;

            int n = ativos.remove(0);
            System.out.println("----------------------------------------");
            System.out.printf("SORTEADO: #%02d - %s%n", n, buscarNome(n));
            System.out.println("----------------------------------------");
            System.out.println("Restam " + ativos.size() + " alunos.");
        }
        leitor.close();
    }

    public static String buscarNome(int n) {
        switch (n) {
            case 2:
                return "Antonio Leandro Silva dos Santos";
            case 4:
                return "Cassia Jeane da Silva";
            case 5:
                return "Danilo Schmitt";
            case 8:
                return "Gregory Cozer";
            case 9:
                return "Guilherme Emanuel Camargo de França";
            case 10:
                return "Gustavo Miranda Cunha";
            case 11:
                return "Hector Fernando Carneiro Lins de Oliveira";
            case 12:
                return "Henrique Barbieri de Brito";
            case 13:
                return "Igor Willms Schweigert";
            case 14:
                return "João Gabriel Marchiori Dantas";
            case 15:
                return "João Marcelo Pacheco Cruz";
            case 16:
                return "João Paulo Dalfovo";
            case 17:
                return "João Victor Dagostini";
            case 18:
                return "João Victor de Melo da Silva";
            case 19:
                return "João Vitor Soares Martins Pedreira da Silva";
            case 20:
                return "José Augusto Wagner";
            case 21:
                return "Lucas Boeing";
            case 22:
                return "Mateus Schmitz Pimentel";
            case 23:
                return "Matheus Hermann Starke Meier";
            case 24:
                return "Miguel Prada";
            case 25:
                return "Natanael Sousa Alves";
            case 27:
                return "Ruan Carlos Klug Castro";
            case 28:
                return "Ryan Wessling da Silva";
            case 29:
                return "Tais Leni Draeger";
            case 30:
                return "Victor Gabriel Farias da Silva";
            case 31:
                return "Victor Luiz Janke Cristofolini";
            default:
                return "Aluno não identificado";
        }
    }
}