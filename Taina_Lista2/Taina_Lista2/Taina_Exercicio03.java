/* Descrição: Engenhe um algoritmo que calcule a área de um triângulo e mostre-a. (Área = (base
* altura) / 2)
 * Autor: Tainá 
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Taina_Exercicio03 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);
        double base, altura, area; //inicialização das variaveis
        base = 0;
        altura = 0; //atribuindo valores
        area = 0; 

        System.out.print("Digite a base do triangulo: "); //digitando um valor
        base = insira.nextDouble(); //lendo os valores

        System.out.print("Digite a altura do triangulo: "); //digitando um valor
        altura = insira.nextDouble(); //lendo os valores

        area = (base * altura) / 2.0; // multiplicação e divisão para encontrar a área do triângulo
        System.out.printf("A area do triangulo : " + area); // mostre a área
        insira.close();
    }
}
