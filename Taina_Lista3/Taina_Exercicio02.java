/*Descrição: Monte um programa que leia dois valores inteiros e mostre todos os números entre
eles.
Autor: Tainá 
Data: 16/05*/
import java.util.Scanner;

public class Taina_Exercicio02 {

    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        int valora, valorb; //inicializando as variáveis

        System.out.print("Digite um valor");
        valora = insira.nextInt();
        System.out.print("Digite outro valor");
        valorb = insira.nextInt();

        if (valora < valorb) { //se o primeiro valor inserido for menor que o segundo 
            valora++; // incremente 1 ao primeiro valor
            while (valora < valorb) { //enquanto o primeiro valor for menor que o segundo valor 
                System.out.println(valora); // mostre o primeiro valor
                valora++; //enquanto incrementa 1 
            }
        } else { // se não 
            valora--; // tire um do primeiro valor 
            while (valora > valorb) { //enquanto o primeiro valor for maior que o segundo valor 
                System.out.println(valora); // mostre o primeiro valor enquanto o primeiro valor for menor que o segundo valor
                valora--; //enquanto o primeiro valor for menor que o segundo valor 
            }
        }
    }

}