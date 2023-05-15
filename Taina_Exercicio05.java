
/*Descrição: Elabore um algoritmo que leia a idade do usuário e mostre a sua faixa etária. Baseie-se na faixa
etária a seguir:
a. 0 ~ 12 anos = Criança;
b. 12 a 19 anos = Adolescente;
c. 19 a 65anos = Adulto;
d. 65 anos para cima = Idoso;
 * Autor: Taina
 * Data: 08/05/23
 */
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner insira = new Scanner(System.in);

        int idade; // inicializando a variavel

        System.out.print("Digite sua idade: ");// digitando o valor
        idade = insira.nextInt(); // lendo o valor

        if (idade >= 0 && idade <= 12) { // se idade for maior ou igual a 0 e idade for menor ou igual a 12 mostre:
                                         // criança
            System.out.print("Criança");
        } else if (idade > 12 && idade <= 19) { // senão se idade for maior que 12 e idade for menor ou igual a 19
                                                // mostre: adolescente
            System.out.print("Adolescente");
        } else if (idade > 19 && idade <= 65) {// senão se idade for maior que 19 e idade for menor ou igual a 65
                                               // mostre: adulto
            System.out.print("Adulto");
        } else {
            System.out.print("Idoso");// senão mostre: idoso
        }
        insira.close();
    }
}