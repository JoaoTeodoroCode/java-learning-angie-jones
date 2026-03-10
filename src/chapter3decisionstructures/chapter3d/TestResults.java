package chapter3decisionstructures.chapter3d;
import java.util.Scanner;


/*
 * "if" - "else if" - "else"
 * Display the letter grade for a student based on their test score.
 */

/* "if" - "else if" - "else"
Usado quando temos 3 ou mais condições "independentes/exclusivas" que podem acontecer no sistema
A ultima condição "independentes/exclusivas" escrita tem que ser SEMPRE usado o "else"
se for SO DUAS condições "independentes/exclusivas" possiveis, entao USAMOS if/else como nos exercicios anteriores
O sistema corre os if, else ifs e else de  cima para baixo. Assim que se encontrar um if ou else if
que seja verdadeiro, o sistema executa-o e IGNORA TODAS AS CONDICOES que vem a seguir ao if/else if executado
*/

public class TestResults {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //1- Obter(Get) os valores para as variaveis que nao conhecemos

        System.out.println("Whats your test score?");
        double testScore = scanner.nextDouble();

        /*2- Estruturas de decisão e Escrever output
        Based on the test score we will determine the letter grade
        */

        // datatype "char" é usado quando temos strings que so "aceitam" valores com 1 caracter(char) de texto.

        /* declaramos assim as variaveis(sem atribuir logo valores) quando o valor das variaveis
           dependem do if/caminho/condicao que o sistema entra
        */
        char grade;

        //neste caso a variavel "grade" vai depender do valor do testScore!!!

        if(testScore < 60){
            grade = 'F';
        }
        else if(testScore < 70){
            grade = 'E';
        }
        else if(testScore < 80){
            grade = 'C';
        }
        else if(testScore < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is " + grade + ".");
    }
}
