
/*Descrição: Faça um algoritmo que leia 4 números, inseridos pelo usuário, some os números e mostre o
resultado na tela. 
 * Autor: Taina
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio01 {
    public static void main(String[] arg) {
        Scanner insira = new Scanner(System.in);

        int num1, num2, num3, num4, soma; //inicializando as variaveis

        num1 = 0; //atribuindo valores
        num2 = 0;
        num3 = 0;
        num4 = 0;
        soma = 0;

        System.out.print("Digite um valor: "); //digitar um valor
        num1 = insira.nextInt(); //ler o valor

        System.out.print("Digite um segundo valor: ");
        num2 = insira.nextInt();

        System.out.print("Digite um terceiro valor: ");
        num3 = insira.nextInt();

        System.out.print("Digite um quarto valor: ");
        num4 = insira.nextInt();
        //somando todos os valores e mostrando o resultado
        soma = num1 + num2 + num3 + num4;

        System.out.print("Valor da soma: " + soma);
        insira.close();
    }
}
