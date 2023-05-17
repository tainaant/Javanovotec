/*Descrição:  Crie um algoritmo que use (tema livre):
a) Variáveis do tipo: real, inteiro, texto e caractere;
b) Ao menos uma decisão encadeada;
 * Autor: Taina
 * Data: 08/05/23
 */

import java.util.Scanner;

public class Taina_Exercicio08 {
    public static void main(String[] arg) {
        Scanner insira = new Scanner(System.in);
        
        // Declaração de variáveis
        int idade;
        double altura;
        String nome;
        char genero;

        //Atribuição de valores para as váriaveis
        idade = 0;
        altura = 0;
        nome = "";
        genero = 0;
        
        // Leitura dos valores
        System.out.print("Digite o seu nome: ");
        nome = insira.nextLine();
        
        System.out.print("Digite a sua idade: ");
        idade = insira.nextInt();
        
        System.out.print("Digite a sua altura: ");
        altura = insira.nextDouble();
        
        System.out.print("Digite o seu gênero (M ou F): ");
        genero = insira.next().charAt(0);
        
        // Verificação do gênero e exibição das informações
        if (genero == 'M') {
            System.out.println("\nNome: " + nome); //se o genero for M mostre as informações e seu gênero é masculino 
            System.out.println("\nIdade: " + idade);
            System.out.println("\nAltura: " + altura);
            System.out.println("\nGênero: Masculino");
        } else if (genero == 'F') { //senão se o genero for F mostre as informações e seu gênero é feminino 
            System.out.println("\nNome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            System.out.println("Gênero: Feminino");
        } else { //senão mostre genero não binarie 
            System.out.println("\nnão binarie.");
        }
        
        insira.close();
    }
}
