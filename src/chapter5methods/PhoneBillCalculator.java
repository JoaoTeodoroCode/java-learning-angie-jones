package chapter5methods;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double charge = 0.25;
    static double subtotalTax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //1 - Obter(get) do user o plan fee e o overage minutes
        double planFeeValue = getPlanFee();
        //2 - Obter(get) do user o overage minutes
        int overMinuteValue = getOverMinute();
        //3 - Charge o user 0.25 por cada overage minute
        double overMinuteChargeValue = overMinuteCharge(overMinuteValue);
        //4 - calcular o subtotal(plan fee + overMinuteCharge)
        double subTotalValue = subTotal(planFeeValue,overMinuteChargeValue);
        //5 -  e montante de taxas a pagar(15% do subtotal)
        double taxValue = calculateTax(subTotalValue);
        //6 - calcular o total(= subtotal + taxas)
        double billValue = calculateBill(subTotalValue,taxValue);
        //7 - Mostrar no ecrã o bill(com os parametros e valor total a pagar)
        displayBill(planFeeValue,overMinuteChargeValue,taxValue,billValue);
        scanner.close();
    }

    public static double getPlanFee(){
        System.out.println("What is your plan fee?: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverMinute(){
        System.out.println("What is your Overage minutes?: ");
        int overMinute = scanner.nextInt();
        return overMinute;
    }
    public static double overMinuteCharge(int minutes){
        double overMinuteCharge = charge * minutes;
        return overMinuteCharge;
    }
    public static double subTotal(double fee,double minutesCharge){
        double subTotal = fee + minutesCharge;
        return subTotal;
    }
    public static double calculateTax(double subTotal){
        double tax = subtotalTax * subTotal;
        return tax;
    }
    public static double calculateBill(double subTotal,double tax){
        double bill = subTotal + tax;
        return bill;
    }
    public static void displayBill(double planFee,double overMinuteCharge,
                                   double tax,double bill){
        System.out.println("Phone Bill statement");
        System.out.println("Plan: " + String.format("%.2f", planFee) + " €");
        System.out.println("Overage: " + String.format("%.2f", overMinuteCharge) + " €");
        System.out.println("Tax: " + String.format("%.2f", tax) + " €");
        System.out.println("Total: " + String.format("%.2f", bill) + " €");
    }
}
