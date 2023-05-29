/*Descrição: Faça um algoritmo que leia um valor inteiro acima de 1 e mostre esse número a
quantidade de vezes que ele representa. Por exemplo: se o usuário inserir o número
5, o número “5” deve aparecer 5 vezes na tela. Assim para os demais valores.
 Autor: Taina 
 Data: 17/05
 */
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        int cont =1, numero  = 0; 
        System.out.print("Digite um número inteiro maior que 1: ");
        numero = insira.nextInt();

       /*  for (int cont = 1; cont <= numero; cont++) {
            System.out.println(numero); ou 
        }*/
        while (cont <= numero) {
            cont ++;
            System.out.println(numero);
            
        }
    }
}