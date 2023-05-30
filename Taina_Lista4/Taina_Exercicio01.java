/*
Descrição: Faça um programa que some todos os números cujo quadrado (x²) for divisível por 4.
autor Taina 
data: 10/05/2023
*/
public class Taina_Exercicio01{
    public static void main(String[] args){
        int lqd = 10; //limite para a soma dos quadrados
        double soma = 0; //variavel para somar 

        for(int cont = 1; cont  <= lqd; cont++ ){
         double quadrado = Math.pow(cont, 2); //encontrando o quadrado dos valores
            if(quadrado % 4 == 0){ // se o resto de divisão por 4 for igual a 0 
               soma = soma + cont; // some o valor da soma com o contador
               System.out.println("o quadrado de " +  cont + " é: " + quadrado);
               System.out.println("A soma é:" + soma);
               System.out.println();
            }
        }
    }
}
