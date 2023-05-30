/* Descrição: - Faça um software que some 10 valores inteiros positivos(ignore valores negativos, caso
o usuário os insira) e mostre sua raiz quadrada.
autor Taina 
data: 10/05/2023*/

import java.util.Scanner;

        public class Taina_Exercicio06{
       
            public static void main(String[] args) {
                Scanner insira = new Scanner(System.in);
               int valor = 0; 
               int soma = 0; 
               int cont = 1;
       
               while(cont<=4){ //enquanto o valor ser menor ou igual a 10 faça a soma
                System.out.println("Digite um numero");
                valor = insira.nextInt();
                cont ++;
                if (valor > 0) {
                    soma += valor; 
                    System.out.println("a soma dos valores inseridos é: " + soma);
                   }
               
               }
               double raiz = Math.sqrt(soma);
               System.out.println("a raiz quadrada é: " + raiz);

              // if (valor > 0) {
                //double raiz = Math.sqrt(soma);
                //System.out.println("a raiz quadrada é: " + raiz);
             //  }
           }
        }
 