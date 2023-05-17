/*Descrição: Empreenda um algoritmo que receba um valor e mostre a mensagem “Acertou”
apenas se ele for um número inteiro positivo entre 94 e 456. Do contrário, mostre a
mensagem “Tente de novo”.
Autor: Tainá 
Data: 08/05/2023
*/
import java.util.Scanner;

public class Taina_Exercicio07 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        System.out.print("Digite um valor: "); // digite um valor
        int valor = insira.nextInt(); //lendo o valor atribuido na variavel valor
        if (valor >= 94 && valor <= 456) { // se o valor for maior ou igual 94 e menor ou igual 456 mostramos "acertou", senão mostramos "tente novamente"
            System.out.println("Acertou!");
        } else {
            System.out.println("Tente novamente.");
        }
        insira.close();
    }
}