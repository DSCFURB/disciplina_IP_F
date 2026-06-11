import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Vendas Mensais: ");
        double vendasMensais = teclado.nextDouble();
        System.out.print("Tempo de Casa (anos): ");
        int tempoCasaAnos = teclado.nextInt();
        System.out.print("Possui Certificação (true/false): ");
        boolean possuiCertificacao = teclado.nextBoolean();

        double comissao = vendasMensais * 0.05;

        if (tempoCasaAnos > 5) {
            comissao = comissao + 200;
        }

        String resultado = "";

        if (vendasMensais >= 10000) {
            if (possuiCertificacao) {
                resultado = "Promovido";
                comissao = comissao * 1.10;
            } else {
                resultado = "Aguardando Certificação";
            }
        } else {
            if (vendasMensais >= 5000) {
                resultado = "Manter Plano";
            } else {
                if (vendasMensais < 2000) {
                    resultado = "Treinamento Obrigatório";
                } else {
                    resultado = "Manter Plano";
                }
            }
        }

        System.out.println("Situação: " + resultado);
        System.out.printf("Comissão Final: R$ %.2f\n", comissao);

        teclado.close();
    }
}