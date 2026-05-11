package chapter10polymorphism.exercisecreatedbyme;

public class Payment {
    protected double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public void processPayment(){
        System.out.println("Processando pagamento de " + amount + ".");
    }
}
