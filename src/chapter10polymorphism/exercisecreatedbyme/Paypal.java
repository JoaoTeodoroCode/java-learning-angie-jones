package chapter10polymorphism.exercisecreatedbyme;

public class Paypal extends Payment{

    public Paypal(double amount){
        super(amount);
    }
    public void loginPaypal(){
        System.out.println("Login no Paypal efetuado com sucesso");
    }
    @Override
    public void processPayment(){
        System.out.println("Pagamento via Paypal no valor de " + amount + " foi efetuada com sucesso");
    }

}
