/*
__ Enunciado: 
Um portal de jogos educativos possui uma área de chat restrita para adolescentes. 
Para acessar, o usuário deve ter uma idade mínima. Escreva um programa que leia 
a idade do usuário e, caso ela seja maior ou igual ('>=') a 13 anos, 
exiba a mensagem: "Acesso ao chat liberado!".

__ Análise: ok
__ Gordura: Um portal de jogos... Escreva um programa que...
//__ Entradas: 
ler(idade)

//__ Processos: 
se idade >= 13 então
  imprimir "Acesso ao chat liberado!"
fim se

//__ Saídas: 
imprimir(permissao)
*/
import java.util.Scanner;

public class Uni4Comp04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Idade: ");
    int idade = teclado.nextInt();

    if (idade >= 13) {
      System.out.println("Acesso ao chat liberado!");
    }

    teclado.close();
  }
}
/*
__ Valores de Testes: 
_ Caso 1 ___
idade = 13
Saída = "Acesso ao chat liberado!"

_ Caso 2 ___
idade = 10
Saída = (vazia)
*/
