/*
__ Enunciado: 
Escreva um programa que valide um cupom de desconto em formato de texto. 
Leia o nome do cupom digitado pelo usuário. Se o cupom for exatamente 
igual a "SOUFURB", o programa deve exibir a mensagem: 
"Desconto de 15% aplicado com sucesso!"

__ Análise: ok
__ Gordura: Escreva um programa que... o programa deve exibir...
//__ Entradas: 
ler(cupomTexto)

//__ Processos: 
se cupomTexto for igual a "SOUFURB" então
  imprimir "Desconto de 15% aplicado com sucesso!"
fim se

//__ Saídas: 
imprimir(sucesso)
*/
import java.util.Scanner;

public class Uni4Comp05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Cupom: ");
    String cupomTexto = teclado.next();

    // Nota: Para comparar Strings usamos o método .equals()
    if (cupomTexto.equals("SOUFURB")) {
      System.out.println("Desconto de 15% aplicado com sucesso!");
    }

    teclado.close();
  }
}
/*
__ Valores de Testes: 
_ Caso 1 ___
cupomTexto = "SOUFURB"
Saída = "Desconto de 15% aplicado com sucesso!"

_ Caso 2 ___
cupomTexto = "OUTRO"
Saída = (vazia)
*/
