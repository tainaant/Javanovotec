/*Descrição: Faça um algoritmo que receba um número e mostre se ele é par ou ímpar
 * Autor: Tainá Antunes
 * Data: 08/05/23
 */
 import java.util.Scanner;

public class Taina_Exercicio10{
 public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        //inicializando a variavel
        int valor; 
        //atribuindo um valor
        valor = 0;
        //interção com o usuario - para digitar um valor
        System.out.print("Digite um valor: ");
        valor = insira.nextInt();
        if(valor%2==0){  // se o resto da divisão do valor inserido pelo usuario for 0 o número é par, senão o número é ímpar
            System.out.print("Par");
        }else{
            System.out.print("Impar");
        }
        insira.close();
    }
}