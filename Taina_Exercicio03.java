/*Engenhe um algoritmo que gere 50 números inteiros e some eles numa variável. Depois
de somar todos, faça o mesmo com 50 números reais aleatórios. Após calcular tudo, mostre
as duas somas e aponte qual foi a maior.
autor Taina 
data: 10/05/2023*/

import java.util.Random;

public class Taina_Exercicio03{
    public static void main(String[]args){
        int n1 = 0; //variavel para a soma dos números inteiros
        int n2 = 0; // variavel para guardar os valores aleatórios inteiros
        double n3 = 0.0; // variavel para a soma dos números reais
        double n4 = 0.0; // variavel para guardar os valores aleatórios reais

       //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random(); //gerador dos numeros aleatórios inteiros
       // Random gerador2 = new Random(); //gerador dos números aleatórios reais
        
        //imprime sequência de 5 números inteiros aleatórios

        for (int cont = 0; cont < 5; cont++) {
            n2 = gerador.nextInt(11);
            n1 += n2;
            System.out.println("um numero aleátorio inteiro é: " + n2);
        }
        System.out.println("A SOMA DOS NÚMEROS INTEIROS É "+n1);
        System.out.println("========================================================");

        for (int cont = 0; cont < 5; cont++) {
          //  n4 = gerador2.nextDouble();
          n4 = gerador.nextDouble();
            n3 += n4;
            System.out.println("um numero aleátorio real é: " + n4);
        }
        System.out.println("A SOMA DOS NÚMEROS REAIS É: "+n3); 
        System.out.println("========================================================");
        if (n1 > n3) {
            System.out.println(n1 + "/INTEIRO é maior");
            
        }   else{
            System.out.println(n3 + "/REAL é maior");
        } 
    }
    }