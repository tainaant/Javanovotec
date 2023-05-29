/*Descrição: Faça um programa que mostre todos os números de 0 a 200 e a cada múltiplo de
10, mostre a mensagem “o número X é um múltiplo de 10”. Obs: não use resto de
divisão, multiplicação e/ou divisão, a ideia é usar duas variáveis contadoras,
sempre que uma delas chega em “10”, exibe o alerta.
Autor: Tainá 
Data: 17/05*/

import java.util.Scanner;

 public class Desafio01{

     public static void main(String[] args) {
        int cont = 0, conta = 0;  

        while(cont<=200){
            cont++; 
            conta++;
            if(conta==10){
                System.out.println( cont + " é multiplo de 10");
                conta = 0;

            }
            else{
                System.out.println(cont);
            }
        }
        
    }
 }
