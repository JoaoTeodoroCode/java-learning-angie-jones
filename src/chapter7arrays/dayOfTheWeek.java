package chapter7arrays;

import java.util.Scanner;

public class dayOfTheWeek {

    static Scanner scanner = new Scanner(System.in);
    static String[] daysWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args){
        int dayWeekNumber = getDayWeekNumber();
        displayDayWeekName(dayWeekNumber);
    }

    public static int getDayWeekNumber(){
        System.out.println("Enter the number of the day of week: ");
        int dayNumber = scanner.nextInt();
        scanner.close();
        while(dayNumber <= 0 || dayNumber > 7){
            System.out.println("Invalid day of week! Try again: ");
            dayNumber = scanner.nextInt();
        }
        return dayNumber;
    }

    public static void displayDayWeekName(int dayWeekNumber){
        String dayName = daysWeek[dayWeekNumber - 1];
        System.out.println(dayName);
    }
}
