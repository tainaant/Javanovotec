/*Descrição: Faça um programa para calcular a média entre 500 números inseridos. Obs: A
média só pode ser calculada após a inserção dos valores.
Dica: se o programa funcionar com 5~10 inserções, funcionará com N inserções!
Autor: Tainá 
Data: 16/05*/
import java.util.Scanner;

public class Taina_Exercicio03 {

    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        //inicializando as variáveis
        int cont = 0;
        double somadora = 0.0, media = 0.0; 


            while (cont < 500) { //enquanto a variável cont for menor que 500
                System.out.println("Digite um valor"); //peça ao usuário para digitar um valor

                int valor = insira.nextInt(); //leia o valor inserido pelo usuário
                somadora += valor; //somadora é igual a somadora mais o valor inserido pelo usu
              cont++; // incremente mais um a cont
            }
            media = somadora/5; //media é igual a somadora dividido por cinco
            System.out.println("A média é "+ media); // mostre a media 
            }
        }