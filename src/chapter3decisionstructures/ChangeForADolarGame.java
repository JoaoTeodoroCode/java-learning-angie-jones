package chapter3decisionstructures;

import java.util.Scanner;

public class ChangeForADolarGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //1 - Declarar/Criar variaveis para os valores que sabemos

        double cent1 = 0.01;
        double cent2 = 0.02;
        double cent5 = 0.05;
        double cent10 = 0.10;
        double cent20 = 0.20;
        double cent50 = 0.50;
        double euro = 1.00;

        //2 - Obter(Get) o numero de cada tipo de moedas de centimos o operador recebeu
        System.out.println("How many 1 cent coins did you receive?:");
        int numOfCent1 = scanner.nextInt();

        System.out.println("How many 2 cents coins did you receive?:");
        int numOfCent2 = scanner.nextInt();

        System.out.println("How many 5 cents coins did you receive?:");
        int numOfCent5 = scanner.nextInt();

        System.out.println("How many 10 cents coins did you receive?:");
        int numOfCent10 = scanner.nextInt();

        System.out.println("How many 20 cents coins did you receive?:");
        int numOfCent20 = scanner.nextInt();

        System.out.println("How many 50 cents coins did you receive?:");
        int numOfCent50 = scanner.nextInt();

        scanner.close();

        //3 - Calcular o valor total do troco que recebemos

        /*
        NOTA: para que a variavel change seja um DOUBLE (valor com casas decimais), BASTA QUE UM DOS valores ou
        variaveis declaradas nela seja DOUBLE!!!!
         */

        double change = cent1*numOfCent1 + cent2*numOfCent2 + cent5*numOfCent5 + cent10*numOfCent10 + cent20*numOfCent20  + cent50*numOfCent50;


        /*3 - Estruturas de decisão:
            Se o valor do troco for 1€ entao ganhou o jogo;
            Se o valor do troco for superior a 1€, indica ao operador o valor acima de 1€ que ele recebeu;
            Se o valor do troco for inferior a 1€, indica ao operador o valor em falta para chegar a 1€;
         */

        /*
        Como a variavel "change" usada nas decisões(ifs) e uma variavel DOUBLE, entao o valor que estamos a
        indicar na condição dentro do if (NESTE CASO 1.00) tem que ser DOUBLE tambem
         */

        if (change == euro){
            System.out.println("Congratulations, you Win! The change is equal to 1€!");
        }
        else if (change < euro){
            double changeShort = euro - change;
            System.out.println("You lose!You need " + changeShort + "€ to reach 1€ of change!");
        }
        else{
            double extraChange = change - euro;
            System.out.println("You lose!You receive " + extraChange + "€ more than 1€ of change!");
        }
    }
}
