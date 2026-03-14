package chapter6classes_and_objects.independent_exercise;

import java.util.Scanner;

public class PhoneBillCalculatorEnhanced {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //1 - Obter(get) do user os valores dos fields "id","baseCost","allottedMinutes","usedMinutes"
        System.out.println("What is the id of your phone bill?: ");
        int idvalue = scanner.nextInt();
        System.out.println("What is your base cost?: ");
        double baseCostValue = scanner.nextDouble();
        System.out.println("What is the minutes included in your plan?: ");
        int allottedMinutesValue = scanner.nextInt();
        System.out.println("How many minutes did you actually use?: ");
        int usedMinutesValue = scanner.nextInt();

        //2 - Criar uma instance/objeto da classe PhoneBill
        //Para criar o objeto, iremos usar o CONSTRUCTOR completo "PhoneBill()", para que o objeto inicial
        //ja venha com todos os valores do field da classe preenchidos com os valores indicados pelo user!!!
        //Como os SETTERS ja estao escritos dentro do CONSTRUCTOR, nao precisamos escreve los!!
        PhoneBill bill = new PhoneBill(idvalue,baseCostValue,allottedMinutesValue,usedMinutesValue);

        //3- fazer o output(display) o bill no ecra
        //Nao metemos parametros dentro dos parenteses, porque eles ja tao definidos na classe "PhoneBill"
        //Nao precisamos escrever os outros metodos (Ex:"calculateTotal()") porque eles ja estao incluidos
        //   no metodo "displayBill()"!!!
        // Como ja estao incluidos, quando escrevemos "bill.displayBill()", ele vai correr
        //   todos os outros metodos que tao dentro deste tambem!!!
        bill.displayBill();
    }


}
