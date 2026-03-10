package chapter3decisionstructures.chapter3a;

import java.util.Scanner;

/*
IF Statement.
All salespeople get a salary of $1000 a week.
Salespeople who exceed the quota of 10 sales get an additional bonus of $250.
*/

/*O if é como um filtro unico.
ou seja, se a condiçao definida no if se VERIFICAR, faz o que ta escrito dentro do if.
se a condiçao definida no if NAO SE VERIFICAR, entao o sistema "segue" pelo codigo e "ignora" o que esta no if.
 */

public class SalaryCalculator {

    public static void main(String[] args){

        //1. Indicar os valores(variaveis) que conhecemos
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //2. Obter(Get) os valores(variaveis) que não conhecemos
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did you do?: ");
        int sales = scanner.nextInt();
        scanner.close();

        //3. Decidir se a pessoa tem direito ao bonus
        //if(condição/condiçoes/expressao respondidascomvalores boolean"True/False"){"tudo aqui dentro faz parte do if"}
        if(sales > quota){
            //aqui nao escrevemos "int" antes da variavel salary porque ela ja foi declarada na linha 14
            salary = salary + bonus;
        }

        //4. Output
        System.out.println("The employee's salary this week is " + salary + "€");
    }




}
