package chapter4repetitionstructures_loops.chapter4b;
import java.util.Scanner;
/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

/*O DO WHILE loop e usado quando queremos que
  o loop (neste caso o WHILE) seja corrido pelo menos uma vez

 Usamos quando precisamos que o codigo dentro do DO{} seja executado obrigatoriamente primeiro, antes da
 verificação/condicao dentro do WHILE()
  */

public class AddNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Criamos a variavel "again" para usa-la como variavel "sentinel" no DO WHILE!!!
        boolean again = false;

        // Dizer boolean again; ou boolean again = false; É O MESMO!!!
        /*como queremos que o codigo corra (DO) enquanto (WHILE) o Operador nao dizer que quer acabar temos
        que usar o DO WHILE */

        do{
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum of the two numbers provided is " + sum + ".");

            System.out.println("Do you want to sum two numbers again?");
            again = scanner.nextBoolean();

        }while(again == true); // neste caso iremos correr código do DO enquanto a variavel again tiver um valor!!
        // Dizer while(again) ou while(again == true) É O MESMO!!!!

        scanner.close();

    }

}
