/*Crie um algoritmo que pega um texto inserido pelo usuário e verifique se a quantidade
de caracteres desse texto for maior que 10, mostre "você digitou um palavrão!", se não
mostre "você digitou uma palavrinha".
autor Taina 
data: 10/05/2023*/

import java.util.Scanner;


public class Taina_Exercicio04{
    public static void main(String[]args){
        Scanner insira = new Scanner(System.in);
        String palavra =" "; //variavel palavra

        System.out.print("Digite uma palavra: ");
        palavra = insira.nextLine();
        if(palavra.length()  > 10){ //função para medir o comprimento de um vetor ou uma palavra
            System.out.println("Você digitou um palavão");
        }else{
            System.out.println("Você digitou uma palavrinha");

      
    }
    }}
