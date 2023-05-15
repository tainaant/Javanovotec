/*Descrição: Monte um algoritmo que calcule o perímetro de um círculo, onde o valor do raio será inserido
pelo usuário. (Perímetro = 2π * r)
 * Autor: Taina
 * Data: 08/05/23
 */

import java.util.Scanner;

public class Taina_Exercicio06 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        double raio, perimetro; // inicializando as variaveis

        raio = 0; // atribuindo valor as variaveis
        perimetro = 0;

        System.out.print("Digite o valor do raio: "); // digite o valor
        raio = insira.nextDouble(); // leia o valor

        perimetro = 2 * 3.14 * raio; // calculo e mostra do perimetro // duas vezes 3,14 vezes o raio digitado pelo
                                     // usuario

        System.out.print("O perimetro do circulo: " + perimetro);

        insira.close();
    }
}
