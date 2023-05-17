/* Descrição:  Construa um algoritmo que receba dois valores e troque os valores. Por exemplo:
var_A ← 5 e var ←_B = 7. Após a troca: A = 7 e B = 5.
 * Autor: Tainá 
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio04 {
    public static void main (String[] arg) {
        Scanner insira = new Scanner(System.in);

        double valor1, valor2 , valor3; //inicializando as variaveis

        valor1 = 0.0; //atribuindo valores
        valor2 = 0.0;
        valor3 = 0.0;

        System.out.print("Digite um valor: "); //digitando um valor
        valor1 = insira.nextDouble(); //lendo um valor 

        System.out.print("Digite um segundo valor: "); //digitando um valor
        valor2 = insira.nextDouble(); //lendo um valor 

        System.out.print("Os valores digitados foram: " + valor1 + " e " + valor2); //mostrando os valores 1 e 2 que foram digitados respectivamente 

        valor3 = valor1; //logica: armazenar o valor 1 na variavel 3, depois na variavel 1 armazenar o valor de 2 e na variavel 2 colocar o valor que tinha sido armazenado na variavel 3. 
        valor1 = valor2;
        valor2 = valor3; 
        System.out.print("\nagora temos: " + valor1 + " e " + valor2 ); //mostrando os valores 1 e 2 respectivamente 
        insira.close();
    }
}