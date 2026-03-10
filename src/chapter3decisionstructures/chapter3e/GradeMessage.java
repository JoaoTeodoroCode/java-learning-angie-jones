package chapter3decisionstructures.chapter3e;
import java.util.Scanner;
/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

/* o "SWITCH" resolve os mesmo problemas que o "IF - ELSE IF - ELSE".

   Logo, o "SWITCH" e usado quandotemos 3 ou mais condições "independentes/exclusivas"
que podem acontecer no sistema

   A diferenca e que o "IF - ELSE IF - ELSE" verifica se a condição dentro do parenteses e verdadeira;Alem disso
as condições tem que dizer respeito a uma lista de valores(EX; if(x<10))

"IF - ELSE IF - ELSE" é usado quando condiçoes envolvem: "Intervalos", "Maior/Menor" ou "Múltiplas Condições";

   Já o "SWITCH" verifica por igualdade,ou seja so usamos o SWITCH quando queremos
comparar uma variavel contra os valores fixos possiveis para aquela variavel
EXEMPLO1: case 1: ou EXEMPLO2: case "A":

"SWITCH" usado quando condições envolvem comparação de "Igualdade Direta" com uma lista fixa valores possiveis
*/


public class GradeMessage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //1- Obter(Get) os valores para as variaveis que nao conhecemos

        System.out.println("Enter your letter grade:");
        String grade = scanner.next();

        String message;//Como vai ser usada para guardar os valores proveniente do SWITCH, nao atribuimos valor.

        //2- Estruturas de decisão e o OUTPUT

        //Dentro dos parenteses do SWITCH colocamos a variavel que queremos verificar/avaliar

        switch(grade) {


            /* dentro dos {} colocamos todos os casos(case) possiveis,
               que correspodem a todos os caminhos/valores(paths) possiveis
             */
            case "A": //lemos isto como "caso/se o valor da grade for "A" entao...
                message = "Excelent job!";
                /*Usamos o "break" para finalizar o case de modo a garantir que vai returnar o valor correto
                da variavel que queremos para aquele "case"
                */
                break;
            case "B":
                message = "Great job.";
                break;
            case "C":
                message = "Good job.";
                break;
            case "D":
                message = "You need to work more.";
                break;
            case "F":
                message = "Not good enough!";
                break;
            default:
                /*o "default" e usado para indicar ao sistema o que ele tem que fazer quando nao e
                  indicado na variavel nenhum valor dos indicados acima!
                 */
                message = "Error.Invalid Grade.";
                break;
        }
        System.out.println(message);

    }

}
