
/*Descrição: Engenhe um algortimo que, baseado na cotação atual do dólar, calcule a conversão do número
inserido pelo usuário para dólar.
 * Autor: Taina
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio03 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        double valorReais, valorDolar; // inicializando as variaveis
        // double Dolar;

        valorReais = 0.0; // atribuindo valores
        // Dolar = 0.0;
        valorDolar = 0.0;

        System.out.print("Digite o valor em reais: ");// digitar um valor
        valorReais = insira.nextDouble();// ler o valor

        /*
         * System.out.print("Digite o valor do dolar: ");
         * Dolar = insira.nextDouble();
         */

        // calculando a conversão de reais para dólar e mostrando o resultado
        valorDolar = valorReais / 5.01;

        System.out.print("O valor convertido para dolares: " + valorDolar);

        insira.close();
    }
}
