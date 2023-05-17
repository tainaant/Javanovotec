
/*Descrição: Crie um algoritmo que receba dois números e mostre:
a) “Os números são iguais”, se forem iguais;
b) “O primeiro é maior”, se diferentes e o primeiro for maior;
c) “O segundo é maior”, se diferentes e o segundo for maior;
Autor: Tainá 
Data: 08/05/2023
*/
import java.util.Scanner;
public class Taina_Exercicio09{
    public static void main (String[] arg){
        Scanner insira = new Scanner(System.in);
        // inicializando as variaveis 
        int a, b; 
        //atribuição de valores
         a = 0;
         b = 0; 
         //interação com o usuario - digite dois valores
         System.out.print("Digite um numero: "); 
         a = insira.nextInt(); // lendo um valor
             System.out.print("Digite outro numero: ");
         b = insira.nextInt(); //lendo outro valor

        if (a==b) { //se a for igual b mostre que os valores são iguais 
            System.out.print("Os valores são iguais"); 
        }else if(a > b){ // senão se a for maior que b mostre que a é maior
            System.out.print(a + " maior que " + b);
        }else{ //senão mostre que b é maior 
            System.out.print(b + " maior que " + a);
        }
        insira.close();
    }
}