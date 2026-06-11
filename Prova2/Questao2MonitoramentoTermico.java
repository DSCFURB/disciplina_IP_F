import java.util.Scanner;

/**
 * ============================================================================
 * ENUNCIADO:
 * Leia 24 temperaturas (entre 15.0 e 60.0) e armazene em um vetor.
 * Calcule a média, a maior temperatura e a hora, e quantas horas ficaram acima
 * da média. Crie um segundo vetor reduzindo 1.5C das originais maiores que
 * 40.0C.
 * * ENTRADAS (LER):
 * - tempLida (double): Lida 24 vezes, representando as horas.
 * * PROCESSAMENTO:
 * - Laço 1: Valida tempLida. Salva no vetor e acumula.
 * - Calcula mediaDiaria.
 * - Laço 2: Acha a maior temperatura e conta as horas acima da média.
 * - Laço 3: Gera vetor de calibração (-1.5 se > 40.0).
 * * SAÍDAS (ESCREVER):
 * - Estatísticas (Média, Pico e Horas acima).
 * - Impressão completa do vetor calibrado.
 * ============================================================================
 */
public class Questao2MonitoramentoTermico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tamanhoJanela = 24;
        double[] temperaturasOriginal = new double[tamanhoJanela];
        double[] temperaturasCalibradas = new double[tamanhoJanela];

        double somaTemperaturas = 0;

        // Laço 1: Carga e Validação
        for (int i = 0; i < temperaturasOriginal.length; i++) {
            while (true) {
                System.out.printf("Leitura para a hora %02d:00: ", i);
                double tempLida = teclado.nextDouble();

                if (tempLida >= 15.0 && tempLida <= 60.0) {
                    temperaturasOriginal[i] = tempLida;
                    somaTemperaturas += tempLida;
                    break;
                }
                System.out.println("  [ERRO] Fora dos limites (15.0C - 60.0C).");
            }
        }

        double mediaDiaria = somaTemperaturas / temperaturasOriginal.length;

        double maiorTemp = temperaturasOriginal[0];
        int horaMaiorTemp = 0;
        int horasAcimaMedia = 0;

        // Laço 2: Processamento Estatístico
        for (int i = 0; i < temperaturasOriginal.length; i++) {
            if (temperaturasOriginal[i] > maiorTemp) {
                maiorTemp = temperaturasOriginal[i];
                horaMaiorTemp = i;
            }
            if (temperaturasOriginal[i] > mediaDiaria) {
                horasAcimaMedia++;
            }
        }

        System.out.println("\n============== RESULTADOS ==============");
        System.out.printf("Média: %.2f°C\n", mediaDiaria);
        System.out.printf("Pico: %.2f°C (às %02d:00)\n", maiorTemp, horaMaiorTemp);
        System.out.println("Horas acima da média: " + horasAcimaMedia);

        System.out.println("\n============== VETOR CALIBRADO ==============");
        // Laço 3: Calibração
        for (int i = 0; i < temperaturasOriginal.length; i++) {
            if (temperaturasOriginal[i] > 40.0) {
                temperaturasCalibradas[i] = temperaturasOriginal[i] - 1.5;
            } else {
                temperaturasCalibradas[i] = temperaturasOriginal[i];
            }
            System.out.printf("[%02d:00] -> %.2f°C\n", i, temperaturasCalibradas[i]);
        }

        teclado.close();
    }
}

/*
 * ============================================================================
 * MESA DE TESTES (Simulação com tamanhoJanela = 3 para brevidade)
 * ----------------------------------------------------------------------------
 * 'i' | tempLida | Vetor Original | somaTemp | media | maiorTemp | Vetor
 * Calibrado
 * 0 | 20.0 | [20.0, 0.0, 0.0] | 20.0 | - | 20.0 | [20.0, 0.0, 0.0]
 * 1 | 10.0 -> 42.0 | [20.0, 42.0, 0.0] | 62.0 | - | 42.0 | [20.0, 40.5, 0.0]
 * <-- Regra de calibração (-1.5)
 * 2 | 31.0 | [20.0, 42.0, 31.0] | 93.0 | 31.0 | 42.0 | [20.0, 40.5, 31.0]
 * ----------------------------------------------------------------------------
 * AVALIAÇÃO DO LAÇO 2 (horasAcimaMedia):
 * i=0 -> 20.0 > 31.0 ? Falso
 * i=1 -> 42.0 > 31.0 ? Verdadeiro (horasAcimaMedia = 1)
 * i=2 -> 31.0 > 31.0 ? Falso
 * ============================================================================
 */