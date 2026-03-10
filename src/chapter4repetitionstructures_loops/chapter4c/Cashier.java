package chapter4repetitionstructures_loops.chapter4c;
import java.util.Scanner;
/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */


public class Cashier {
    public static void main(String[] args){
        //1 - obter(get) os valores que nao sabemos

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items will you scan?: ");
        int numOfItems = scanner.nextInt();
        double total =0;

        for(int i=0; i<numOfItems; i++){
            System.out.println("Whats the price of the item "+ i +"?");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("The total cost of the items are " +  total + "€.");
    }
}
