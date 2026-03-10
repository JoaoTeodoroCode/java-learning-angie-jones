package chapter2javafundamentals;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. asks a user for a season of the year
        System.out.println("Enter the season of the year: ");
        String seasonOfTheYear = scanner.nextLine();

        // 2. asks a user for a whole number
        System.out.println("Enter a Whole number: ");
        int wholeNumber = scanner.nextInt();

        // 3. asks a user for an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        scanner.close();

        // 4.And use the input to complete the sentence below. Output the result.
        System.out.println("On a " + adjective + seasonOfTheYear + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");

    }

}
