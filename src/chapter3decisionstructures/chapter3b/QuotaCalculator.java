package chapter3decisionstructures.chapter3b;

import java.util.Scanner;
/*
 * IF ELSE
 * All salespeople are expected to make at least the quota of 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

/* if/else é usado quando temos SOMENTE DUAS condiçoes EXCLUSIVAS/INDEPENDENTES que podem acontecer no sistema
if/else significa - (ou acontece uma condiçao ou acontece a outra)
Apos verificar o que esta escrito no if/else, o sistema "segue" pelo codigo */

public class QuotaCalculator {

    public static void main(String[] args){
        //1 - Declarar/Criar Variaveis para os valores que conhecemos
        int quota =10;

        //2 - Obter(Get) os valores para as variaveis que nao conhecemos
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did you do?: ");
        int sales = scanner.nextInt();
        scanner.close();

        /*
        Estruturas de decisão
        3.1 - Decidir se recebe a mensagem de Congrats; se nao receber indicar quantos vendas faltou para a receber
        3.2 - Escrever o output
         */
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }

}
