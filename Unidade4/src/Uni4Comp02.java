/*
__ Enunciado: 
Um sistema de monitoramento de TI verifica o status de um servidor através de 
códigos numéricos. O código 1 significa que o sistema está "OK". Escreva um 
algoritmo que leia um número inteiro representando o status atual. Se o status 
for diferente ('!=') de 1, o programa deve exibir o alerta: 
"ATENÇÃO: Sistema operando com instabilidade!"

__ Análise: ok
__ Gordura: Um sistema de... Escreva um algoritmo que...
//__ Entradas: 
ler(status)

//__ Processos: 
se status != 1 então
  imprimir "ATENÇÃO: Sistema operando com instabilidade!"
fim se

//__ Saídas: 
imprimir(alerta)
*/
import java.util.Scanner;

public class Uni4Comp02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Status: ");
    int status = teclado.nextInt();

    if (status != 1) {
      System.out.println("ATENÇÃO: Sistema operando com instabilidade!");
    }

    teclado.close();
  }
}
/*
__ Valores de Testes: 
_ Caso 1 ___
status = 2
Saída = "ATENÇÃO: Sistema operando com instabilidade!"

_ Caso 2 ___
status = 1
Saída = (vazia)
*/
