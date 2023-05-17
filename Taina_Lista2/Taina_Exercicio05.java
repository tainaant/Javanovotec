/*Descrição: Construa um algoritmo que receba um número e mostre: seu sucessor, o número e o
seu antecessor.
Autor: Taina
Data: 04/05/23
*/
import java.util.Scanner;

public class Taina_Exercicio05{
    public static void main(String[] arg){
        Scanner insira = new Scanner (System.in);

int valor, ant, sus; //inicializando as variaveis
valor = 0; //atribuindo valores 
ant = 0;
sus = 0;

System.out.print("digite um valor: "); //digite um valor
valor = insira.nextInt();//ler o valor
ant = valor - 1; //o antecessor é o valor - um
sus = valor + 1; //o sucessor é o valor + 1
System.out.print("o antecessor e:" + ant + "\n"); //mostre o antecessor e o sucessor do valor digitado
System.out.print("o sucessor e:" + sus );
insira.close();
    }
}
