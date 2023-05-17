/*Descrição: Jumiralds é uma vendedora de picolés e quer facilitar a venda de picolés. Ela vende
três sabores de picolés: Kiwi, Laranja e Romã. Cada picolé custa R$ 03,20, R$
02,39 e R$ 07,99, respectivamente.
Produza um algoritmo que receba a quantidade de picolés de Kiwi, Laranja e Romã
a ser comprado e calcule o valor total da compra e mostre-a.
Autor: Tainá 
Data: 08/05/2023
*/

import java.util.Scanner;

public class Taina_Exercicio06{

     public static void main (String[] arg){
        Scanner insira = new Scanner (System.in);
        double kiwi, laranja, roma, resultado; //inicializando as variaveis
        kiwi = 0.0; //atribuindo valores
        laranja = 0.0;
        roma = 0.0;
        resultado = 0.0; 

        System.out.print("Digite quantos picoles de kiwi voce deseja: "); // para o usuario inserir a quantidade de picolés de cada sabor
        kiwi = insira.nextDouble(); // ler a quantidade
        System.out.print("Digite quantos picoles de laranja voce deseja: ");
        laranja = insira.nextDouble();
         System.out.print("Digite quantos picoles de roma voce deseja: ");
        roma = insira.nextDouble();

        resultado = (kiwi*3.20)+(laranja*2.39)+(roma*7.0); //logica: o resultado da compra do usuario é a soma da multiplicação da quantidade de cada um pelo seu respectivo valor

        System.out.print("o valor a pagar: " + resultado); // mostre o resultado 
        insira.close();
     }
}