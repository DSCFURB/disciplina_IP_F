/*
__ Enunciado: 
Uma transportadora utiliza uma esteira de separação rápida para pacotes leves, 
visando agilizar a logística. Escreva um algoritmo que leia o peso de uma 
caixa (em kg). Se o peso for menor ('<') que 2.5 kg, o programa deve informar: 
"Encaminhar para a Esteira Rápida (Pacote Leve)".

__ Análise: ok
__ Gordura: Uma transportadora utiliza... Escreva um algoritmo que...
//__ Entradas: 
ler(peso)

//__ Processos: 
se peso < 2.5 então
  imprimir "Encaminhar para a Esteira Rápida (Pacote Leve)"
fim se

//__ Saídas: 
imprimir(destino)
*/
import java.util.Scanner;

public class Uni4Comp03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Peso: ");
    double peso = teclado.nextDouble();

    if (peso < 2.5) {
      System.out.println("Encaminhar para a Esteira Rápida (Pacote Leve)");
    }

    teclado.close();
  }
}
/*
__ Valores de Testes: 
_ Caso 1 ___
peso = 1.5
Saída = "Encaminhar para a Esteira Rápida (Pacote Leve)"

_ Caso 2 ___
peso = 3.0
Saída = (vazia)
*/
