package chapter7arrays.chapter7c;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grades {

    //inicializar o array grades
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("How many grades you will enter?: ");
        int grades_number = scanner.nextInt();

        //criar o array, usando como tamanho do mesmo o valor da variavel grades_number
        grades = new int[grades_number];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", averageGrades()) + ".");
        System.out.println("Highest: " + getHighestGrade());
        System.out.println("Lowest: " + getLowestGrade());

    }

    //metodo para perguntar ao utilizador qual o valor de cada grade que ele teve
    //e para guardar o valor no array grades
    public static void getGrades(){

        //como temos que peguntar ao user o numero de vezes que foi indicado na variavel grades_number,
        // iremos usar um ciclo for;
        //usamos o grades.length porque queremos usar o tamanho do array grades.
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter your grade" + (i+1));
            //guardar no array o valor indicado pelo user em cada iteração do ciclo for
            grades[i] = scanner.nextInt();
        }
    }

    //metodo que soma todas as notas do array Grades
    public static int sumGrades(){
        //inicializar a variavel sum com valor 0, que sera a variavel atualizada ao longo das iterações
        int sum = 0;
        //como ja temos valores dentro do array, em vez do ciclo "for", iremos usar o ciclo "for each"
        for(int value : grades){
            sum = sum + value;
        }
        return sum;
    }

    //metodo que calcula a media das notas do array Grades
    public static double averageGrades(){
        double average = sumGrades()/grades.length;
        return average;
    }

    //metodo para verificar qual o maior valor dentro do array Grades
    public static int getHighestGrade(){
        //criar variavel onde ficara guardado o valor maximo, e atribuir
        // inicialmente na variavel o valor do primeiro elemento do array
        int highest = grades[0];
        for(int value : grades){
            if(value > highest){
                highest = value;
            }
        }
        return highest;

    }

    //metodo para verificar qual o menor valor dentro do array Grades
    public static int getLowestGrade(){
        //criar variavel onde ficara guardado o valor minimo, e atribuir
        // inicialmente na variavel o valor do primeiro elemento do array
        int lowest = grades[0];
        for(int value : grades){
            if(value < lowest){
                lowest = value;
            }
        }
        return lowest;

    }


}
