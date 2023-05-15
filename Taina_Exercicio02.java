
/*Descrição: Monte um algoritmo que: receba 4 números, inserido pelo usuário; calcule o quadrado de cada
um (número²); some todos os valores e mostre o resultado;
 * Autor: Taina
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] arg) {
        Scanner insira = new Scanner(System.in);

        int num1, num2, num3, num4, soma; // inicializando as variaveis
        int quadrado1, quadrado2, quadrado3, quadrado4; // inicializando as variaveis

        num1 = 0; // atribuindo valores
        num2 = 0;
        num3 = 0;
        num4 = 0;
        soma = 0;
        quadrado1 = 0;
        quadrado2 = 0;
        quadrado3 = 0;
        quadrado4 = 0;

        System.out.print("Digite um valor: "); // digitar um valor
        num1 = insira.nextInt(); // ler o valor

        System.out.print("Digite um segundo valor: ");
        num2 = insira.nextInt();

        System.out.print("Digite um terceiro valor: ");
        num3 = insira.nextInt();

        System.out.print("Digite um quarto valor: ");
        num4 = insira.nextInt();

        quadrado1 = num1 * num1; // calculo do quadrado dos valores
        quadrado2 = num2 * num2;
        quadrado3 = num3 * num3;
        quadrado4 = num4 * num4;

        System.out.print(num1 + " ao quadrado, bem como: " + quadrado1); // mostrando os valores ao quadrado
        System.out.print(num2 + " ao quadrado, bem como: " + quadrado2);
        System.out.print(num3 + " ao quadrado, bem como: " + quadrado3);
        System.out.print(num4 + " ao quadrado, bem como: " + quadrado4);
        // somando o quadrado dos valores e mostrando o resultado
        soma = quadrado1 + quadrado2 + quadrado3 + quadrado4;

        System.out.print("Valor da soma: " + soma);
        insira.close();
    }
}
