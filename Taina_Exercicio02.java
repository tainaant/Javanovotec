/*Construa um algoritmo que receba três números, e enquanto a soma deles for diferente
de 48 ou 71, continue recebendo três valores infinitamente.
autor Taina 
data: 10/05/2023*/

import java.util.Scanner;

public class Taina_Exercicio02{
    public static void main(String[]args){
        Scanner insira = new Scanner(System.in);
         int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int soma = 0;
        do{
        System.out.println("Digite um numero");
        n1 = insira.nextInt();
        System.out.println("Digite um numero");
        n2 = insira.nextInt();
        System.out.println("Digite um numero");
        n3  = insira.nextInt();
        soma = n1 + n2 + n3; 
        System.out.println("a soma é: " + soma);

        if(soma == 48 || soma == 71){
            break;
        }

        } while(soma != 48 || soma != 71);
    }
}
