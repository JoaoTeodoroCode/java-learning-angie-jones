package chapter3decisionstructures.chapter3c;
import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

/* NESTED ifs - e o mesmo que dizer "temos um if/else dentro de outro if"
    NESTED if sao usados quando temos DUAS OU MAIS CONDIÇOES QUE DEPENDEM UMA DA OUTRA.
   Só olhamos para os ifs de "dentro" se a condicao do if de "fora" se verificar.
 Logica para o NESTED ifs é "Só verificar a condição do if/else "dentro" se a condicao do if "fora" se verificar"
*/
public class LoanQualifier {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //1- Declarar/Criar variaveis para os valores que sabemos

        int requiredSalary = 30000;
        int requiredYear = 2;

        //2- Obter(Get) os valores para as variaveis que nao conhecemos

        System.out.println("How much money do you make?: ");
        double salary = scanner.nextDouble();

        System.out.println("How many years are you working with your current employer?: ");
        double year = scanner.nextDouble();

        scanner.close();

        //3- Estruturas de decisão e Escrever output

        /* Temos 4 possibilidades tendo em conta as nossas condiçoes:
            1 - salario >=30000 e year >=2
            2 - salario >=30000 e year <2
            3 - salario <30000 ( basta este porque independentemente do numero anos faz sempre o mesmo resultado)
         */

        if(salary >= requiredSalary){
            if (year >= requiredYear){
                System.out.println("Congratulations!You are qualified for the loan.");
            }
            else{

                System.out.println("Sorry, You are not qualified for the loan. You need to work at least "
                        + requiredYear + " years." );
            }
        }
        else{

            System.out.println("Sorry, You are not qualified for the loan. You need to earn at least " + requiredSalary
                    + "$.");
        }
    }
}
