import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Modalidade: 1-Diário | 2-Semanal | 3-Sócio");
        int modalidade = teclado.nextInt();

        double valorPagar = 0;

        switch (modalidade) {
            case 1:
                System.out.print("Quantidade de dias: ");
                int dias = teclado.nextInt();
                valorPagar = dias * 40.00;
                break;
            case 2:
                valorPagar = 180.00;
                break;
            case 3:
                System.out.print("Valor da mensalidade: ");
                double mensalidade = teclado.nextDouble();
                System.out.print("Dia do vencimento: ");
                int vencimento = teclado.nextInt();
                System.out.print("Dia do pagamento: ");
                int pagamento = teclado.nextInt();

                if (pagamento <= vencimento) {
                    valorPagar = mensalidade * 0.90;
                    System.out.println("Aviso: Pagamento Antecipado.");
                } else if (pagamento <= (vencimento + 5)) {
                    valorPagar = mensalidade;
                } else {
                    int diasAtraso = pagamento - vencimento;
                    double multa = mensalidade * 0.02;
                    valorPagar = mensalidade + multa + (diasAtraso * 5.00);
                }
                break;
            default:
                System.out.println("Modalidade Inválida.");
        }

        if (valorPagar > 0) {
            System.out.printf("Total a pagar: R$ %.2f\n", valorPagar);
        }

        teclado.close();
    }
}