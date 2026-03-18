/*
__ Enunciado: 
Uma loja virtual deseja dar um brinde para categorias específicas de clientes. 
Escreva um programa que leia um caractere representando o tipo de cupom 
('S' para Especial, 'C' para Comum). Se o cupom for igual ('==') a 'S', 
o programa deve exibir a mensagem: "Cupom validado! Você ganhou um adesivo exclusivo."

__ Análise: ok
__ Gordura: Uma loja virtual deseja... Escreva um programa que...
//__ Entradas: 
ler(tipoCupom)

//__ Processos: 
se tipoCupom == 'S' então
  imprimir "Cupom validado! Você ganhou um adesivo exclusivo."
fim se

//__ Saídas: 
imprimir(mensagem)
*/
import java.util.Scanner;

public class Uni4Comp01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Tipo de cupom (S/C): ");
    char tipoCupom = teclado.next().toUpperCase().charAt(0);

    if (tipoCupom == 'S') {
      System.out.println("Cupom validado! Você ganhou um adesivo exclusivo.");
    }

    teclado.close();
  }
}
/*
__ Valores de Testes: 
_ Caso 1 ___
tipoCupom = 'S'
Saída = "Cupom validado! Você ganhou um adesivo exclusivo."

_ Caso 2 ___
tipoCupom = 'C'
Saída = (vazia)
*/
