package chapter4repetitionstructures_loops.chapter4d;
import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

public class AverageTestScores {
    public static void main(String[] args){
        //1 - Criar variaveis para o que conhecemos
        int students = 24;
        int tests = 4;
        Scanner scanner = new Scanner(System.in);

        //2 - Estrutura de repetição
        //Para cada estudante(1ºfor) queremos calcular a media dos 4 testes(2ºfor)
        for(int i=0; i<students; i++){
            double score = 0;
            for(int j=0; j<tests; j++){
               System.out.println("Whats the score of the test " + j + "?");
               double testscore = scanner.nextDouble();
               score = score + testscore;
            }
            double average = score/tests;
            System.out.println("The average of the test scores of the student " + i + " is " + average);
        }
        scanner.close();
    }
}
