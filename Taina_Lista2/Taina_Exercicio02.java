/* Descrição: Monte um algoritmo para receber 3 números e que mostre qual número inserido é o
maior.
 * Autor: Tainá 
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio02 {
    public static void main (String[] arg) {
        Scanner insira = new Scanner(System.in);

        int num1, num2, num3;//inicialização das variaveis

        num1 = 0;//atribuição de valores
        num2 = 0;
        num3 = 0;

        System.out.print("Digite um valor: ");//digitando um valor
        num1 = insira.nextInt();//lendo os valores
        System.out.print("Digite um segundo valor: ");//digitando um valor
        num2 = insira.nextInt();//lendo os valores
        System.out.print("Digite um  terceiro valor: ");//digitando um valor
        num3 = insira.nextInt();//lendo os valores

       if(num1 > num2 && num1 > num3){ //se a variavel 1 for maior que a variavel 2 e maior que a variavel 3 
        System.out.print(num1 + ": o maior"); // a variavel 1 é a maior 
       }
       else if(num2 > num1 && num2 > num3){ //senão se a variavel 2 for maior que a variavel 1 e maior que a variavel 3 
        System.out.print(num2 + ": o maior"); // a variavel 2 é a maior 
       }
       else{ 
        System.out.print(num3 + ": o maior");//senão a variavel 3 é a maior
       }
        insira.close();
    }
}
