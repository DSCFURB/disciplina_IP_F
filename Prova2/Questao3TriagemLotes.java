import java.util.Scanner;

/**
 * ============================================================================
 * ENUNCIADO:
 * Crie dois vetores de tamanho 10 (código do material e peso).
 * Leia os lotes convertendo o texto para maiúsculo. Peça um material alvo,
 * busque nos vetores e exiba os índices e pesos encontrados.
 * Ao fim, exiba o peso total acumulado.
 * * ENTRADAS (LER):
 * - código (String): Vetor codigosMateriais[i].
 * - peso (double): Vetor pesosLotes[i].
 * - materialBuscado (String): Alvo da pesquisa.
 * * PROCESSAMENTO:
 * - Laço 1 (Carga): Lê dados, aplica .toUpperCase() e soma pesoTotalGeral.
 * - Laço 2 (Busca): Usa .equals() para comparar o alvo com os códigos salvos.
 * - Controle booleano (loteEncontrado) para saber se houve sucesso na busca.
 * * SAÍDAS (ESCREVER):
 * - Índices e pesos localizados (ou mensagem de "Nenhum lote localizado").
 * - Soma total de peso.
 * ============================================================================
 */
public class Questao3TriagemLotes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalLotes = 10;
        String[] codigosMateriais = new String[totalLotes];
        double[] pesosLotes = new double[totalLotes];

        double pesoTotalGeral = 0;

        // Laço 1: Carga dos dados
        for (int i = 0; i < totalLotes; i++) {
            System.out.printf("Código do Material %d: ", (i + 1));
            codigosMateriais[i] = teclado.next().toUpperCase();

            System.out.printf("Peso do Lote %d (kg): ", (i + 1));
            pesosLotes[i] = teclado.nextDouble();

            pesoTotalGeral += pesosLotes[i];
        }

        // Entrada da busca
        System.out.print("\nDigite o Código do Material para busca: ");
        String materialBuscado = teclado.next().toUpperCase();

        System.out.println("\n============== RESULTADO DA BUSCA ==============");
        boolean loteEncontrado = false;

        // Laço 2: Busca Linear
        for (int i = 0; i < totalLotes; i++) {
            if (codigosMateriais[i].equals(materialBuscado)) {
                System.out.printf("-> Índice [%d]: Peso = %.2f kg\n", i, pesosLotes[i]);
                loteEncontrado = true;
            }
        }

        if (!loteEncontrado) {
            System.out.println("Nenhum lote localizado para o material especificado.");
        }

        System.out.println("================================================");
        System.out.printf("SOMA GERAL: Peso total dos %d lotes: %.2f kg\n", totalLotes, pesoTotalGeral);

        teclado.close();
    }
}

/*
 * ============================================================================
 * MESA DE TESTES (Simulação com totalLotes = 3 para brevidade)
 * ----------------------------------------------------------------------------
 * 'i' | código | peso | Vetor códigos | Vetor pesos | pesoGeral
 * 0 | "vidro"->VIDRO | 12.5 | ["VIDRO", "", ""] | [12.5, 0.0, 0.0] | 12.5
 * 1 | "PAPEL" | 20.0 | ["VIDRO", "PAPEL", ""] | [12.5, 20.0, 0.0] | 32.5
 * 2 | "Vidro"->VIDRO | 8.0 | ["VIDRO", "PAPEL", "VIDRO"] | [12.5, 20.0, 8.0] |
 * 40.5
 * ----------------------------------------------------------------------------
 * SIMULAÇÃO DA BUSCA: Alvo = "VIDRO"
 * i=0 -> "VIDRO".equals("VIDRO") == true -> Exibe: Índice [0], Peso = 12.5 kg
 * (loteEncontrado = true)
 * i=1 -> "PAPEL".equals("VIDRO") == false -> Ignora.
 * i=2 -> "VIDRO".equals("VIDRO") == true -> Exibe: Índice [2], Peso = 8.0 kg
 * ----------------------------------------------------------------------------
 * RESULTADO FINAL: Exibe Soma Geral = 40.5 kg.
 * ============================================================================
 */