/* Descrição: Faça um algoritmo que capture um valor inserido pelo usuário e desconte 15% do
número inserido. Após isso, mostre o valor original e o valor com desconto.
 * Autor: Tainá 
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio01 {
    public static void main (String[] arg) {
        Scanner insira = new Scanner(System.in);

        double valor, desconto , valorComDesconto; //inicialização das variaveis

        valor = 0.0; //atribuição de valores
        desconto = 0.0;
        valorComDesconto = 0.0;

        System.out.print("Digite um valor: "); //digitando um valor
        valor = insira.nextDouble(); //lendo os valores
        desconto = valor * 0.15; //variavel desconto é igual a variavel valor vezes 0.15 
        valorComDesconto = valor - desconto; //subtração pra saber o valor com descoto
        System.out.print("Valor original: " + valor + "\n");
        System.out.print("Valor com desconto: " + valorComDesconto);
        insira.close();
    }
}






