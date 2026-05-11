package chapter10polymorphism.exercisecreatedbyme;

public class PaymentProcessor {
    public static void main(String[] args){
        Payment generalBill = new Payment(100);
        generalBill.processPayment();

        //Aplicar o polymorphism
        Payment creditCardBill = new CreditCard(120);
        pay(creditCardBill);
        Payment PaypalBill = new Paypal(110);
        pay(PaypalBill);

    }
    public static void pay(Payment payment){
        if(payment instanceof CreditCard){
            ((CreditCard) payment).validateCard();
            payment.processPayment();
        }
        else if(payment instanceof Paypal){
            ((Paypal) payment).loginPaypal();
            payment.processPayment();
        }
    }
}
