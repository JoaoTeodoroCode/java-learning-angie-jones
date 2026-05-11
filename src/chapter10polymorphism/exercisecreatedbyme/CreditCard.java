package chapter10polymorphism.exercisecreatedbyme;

public class CreditCard extends Payment{

    public CreditCard(double amount){
        super(amount);
    }
    public void validateCard(){
        System.out.println("--- Validação Cartão Crédito ---");
        System.out.println("1. Verificando número do cartão...");
        System.out.println("2. Verificando data de expiração...");
        System.out.println("3. Cartão validado com sucesso!");
    }
    @Override
    public void processPayment(){
        System.out.println("Pagamento com Cartão de Crédito no valor de " + amount + " efetuado com sucesso.");
    }
}
