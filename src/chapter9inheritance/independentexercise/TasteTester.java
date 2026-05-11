package chapter9inheritance.independentexercise;

import java.util.Scanner;

public class TasteTester {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //Criar um objeto da parent class Cake
        System.out.println("Enter flavor of cake: ");
        String flavor = scanner.next();
        Cake cake = new Cake(flavor);
        System.out.println("Enter price of cake: ");
        double price = scanner.nextDouble();
        cake.setPrice(price);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price : " + cake.getPrice());

        //Criar um objeto da child class BirthdayCake
        System.out.println("Enter flavor of birthDay cake: ");
        String flavorBirth = scanner.next();
        System.out.println("Enter price of birthDay cake: ");
        double priceBirth = scanner.nextDouble();
        System.out.println("Enter number of candles of birthDay cake: ");
        int candlesBirth = scanner.nextInt();
        BirthdayCake birth = new BirthdayCake(flavorBirth);
        birth.setPrice(priceBirth);
        birth.setCandles(candlesBirth);
        System.out.println("BirthdayCake flavor: " + birth.getFlavor());
        System.out.println("BirthdayCake price : " + birth.getPrice());
        System.out.println("BirthdayCake candles : " + birth.getCandles());

        //Criar um objeto da child class WeddingCake
        System.out.println("Enter flavor of wedding cake: ");
        String flavorWedding = scanner.next();
        WeddingCake wedding = new WeddingCake(flavorWedding);
        System.out.println("Enter price of wedding cake: ");
        double priceWedding = scanner.nextDouble();
        System.out.println("Enter tiers of wedding cake: ");
        int tiersWedding = scanner.nextInt();
        wedding.setPrice(priceWedding);
        wedding.setTiers(tiersWedding);

        System.out.println("WeddingCake flavor: " + wedding.getFlavor());
        System.out.println("WeddingCake price : " + wedding.getPrice());
        System.out.println("WeddingCake tiers : " + wedding.getTiers());
    }
}
