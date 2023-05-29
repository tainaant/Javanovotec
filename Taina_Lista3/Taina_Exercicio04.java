/*Descrição: Engenhe um algoritmo que mostre apenas os números ímpares entre 0 e 1000.
Autor: Tainá 
Data: 16/05*/

public class Taina_Exercicio04 {
    public static void main(String[] args) {
        int cont = 0;
        //do while para mostrar apenas os numeros ímpares
            do{ 
                if(cont % 2 == 0) {
                cont++;
            } else{
                System.out.println(cont);
                cont++;
               }
            }while(cont < 1000);
        
    }
}
