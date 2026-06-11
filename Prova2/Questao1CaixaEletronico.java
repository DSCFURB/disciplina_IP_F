import java.util.Scanner;

/**
 * ============================================================================
 * ENUNCIADO:
 * Desenvolva um programa que leia uma quantidade indeterminada de transações
 * financeiras (tipo: 'D' ou 'S' e valor). A leitura encerra ao digitar valor 0.
 * Valide valores negativos e tipos inválidos. Ao fim, exiba os totais
 * acumulados,
 * a média de saques e o percentual de depósitos.
 * * ENTRADAS (LER):
 * - valor (double): Valor da transação financeira.
 * - tipoOperacao (char): 'D' para depósito, 'S' para saque.
 * * PROCESSAMENTO:
 * - Laço infinito (while true) com quebra (break) se valor == 0.
 * - Filtro (continue) se valor < 0.
 * - Laço interno para garantir que tipoOperacao seja apenas 'D' ou 'S'.
 * - Acumular totalDepositos e qtdDepositos se 'D'.
 * - Acumular totalSaques, somaValoresSaque e qtdSaques se 'S'.
 * - Após o laço, calcular:
 * -> mediaSaques = somaValoresSaque / qtdSaques (evitando divisão por zero)
 * -> percentualDepositos = (qtdDepositos / totalTransacoes) * 100
 * * SAÍDAS (ESCREVER):
 * - Total acumulado em Depósitos.
 * - Total acumulado em Saques.
 * - Média aritmética dos valores de Saque válidos.
 * - Percentual de transações de Depósito em relação ao total.
 * ============================================================================
 */
public class Questao1CaixaEletronico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totalDepositos = 0;
        double totalSaques = 0;
        double somaValoresSaque = 0;

        int qtdDepositos = 0;
        int qtdSaques = 0;

        while (true) {
            System.out.print("Digite o valor da transação (0 para encerrar): R$ ");
            double valor = teclado.nextDouble();

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                System.out.println("Erro: Valor Inválido! A transação não pode ser negativa.");
                continue;
            }

            char tipoOperacao;
            while (true) {
                System.out.print("Digite o tipo de operação (D - Depósito / S - Saque): ");
                tipoOperacao = teclado.next().toUpperCase().charAt(0);

                if (tipoOperacao == 'D' || tipoOperacao == 'S') {
                    break;
                }
                System.out.println("Erro: Tipo de operação desconhecido. Tente novamente.");
            }

            if (tipoOperacao == 'D') {
                totalDepositos += valor;
                qtdDepositos++;
            } else {
                totalSaques += valor;
                somaValoresSaque += valor;
                qtdSaques++;
            }
        }

        int totalTransacoesProcessadas = qtdDepositos + qtdSaques;

        System.out.println("\n============== RELATÓRIO ==============");
        System.out.printf("1. Total em Depósitos: R$ %.2f\n", totalDepositos);
        System.out.printf("2. Total em Saques: R$ %.2f\n", totalSaques);

        if (qtdSaques > 0) {
            double mediaSaques = somaValoresSaque / qtdSaques;
            System.out.printf("3. Média de Saques: R$ %.2f\n", mediaSaques);
        } else {
            System.out.println("3. Média de Saques: N/A");
        }

        if (totalTransacoesProcessadas > 0) {
            double percentualDepositos = ((double) qtdDepositos / totalTransacoesProcessadas) * 100;
            System.out.printf("4. Percentual de Depósitos: %.2f%%\n", percentualDepositos);
        } else {
            System.out.println("4. Percentual de Depósitos: 0.00%");
        }

        teclado.close();
    }
}

/*
 * ============================================================================
 * MESA DE TESTES (Simulação de Execução)
 * ----------------------------------------------------------------------------
 * Entrada 'valor' | Entrada 'tipo' | totalDep | totalSaq | qtdDep | qtdSaq |
 * Ação do Algoritmo
 * 100.0 | 'D' | 100.0 | 0.0 | 1 | 0 | Processa e acumula depósito.
 * -50.0 | (não lê) | 100.0 | 0.0 | 1 | 0 | Rejeita negativo, volta ao topo
 * (continue).
 * 50.0 | 'X' -> 'S' | 100.0 | 50.0 | 1 | 1 | Rejeita 'X', aceita 'S', acumula
 * saque.
 * 0 | (não lê) | 100.0 | 50.0 | 1 | 1 | Quebra o laço principal (break).
 * ----------------------------------------------------------------------------
 * RESULTADOS FINAIS:
 * Média de Saques = 50.0 / 1 = 50.0
 * Percentual Depósitos = (1 / 2) * 100 = 50.0%
 * ============================================================================
 */