/*
__ Enunciado: 
Uma loja virtual deseja presentear seus clientes mais fiéis. Escreva um programa que leia o nome de um cupom de desconto. Se o cupom digitado for exatamente igual a "SOUFURB", o programa deve exibir a mensagem: "Cupom validado! Você ganhou um adesivo exclusivo."

__ Análise: ok
__ Gordura: Escreva um programa que leia... exiba que...
//__ Entradas: ler(cupom)
//__ Processos: 
se cupom == "SOUFURB" então
  mensagem = "Cupom validado! Você ganhou um adesivo exclusivo."
fim se
//__ Saídas: imprimir(mensagem)
*/

import java.util.Scanner;

public class Uni4Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Digite o cupom: ");
    String cupom = teclado.next();

    // Processo / Saída
    if (cupom.equals("SOUFURB")) {
      System.out.println("Cupom validado! Você ganhou um adesivo exclusivo.");
    }

    teclado.close();
  }
}

/*
__ Valores de Testes: 
_ Caso 1 ___
cupom = "SOUFURB"
saída = "Cupom validado! Você ganhou um adesivo exclusivo."

_ Caso 2 ___
cupom = "PROMO10"
saída = (vazia)
*/
