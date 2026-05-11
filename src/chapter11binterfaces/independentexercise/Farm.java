package chapter11binterfaces.independentexercise;

public class Farm {
    public static void main(String[] args){
        //Usar o polymorphism para criar um objeto da classe Animal instanciado a partir da child class duck e pig
        Animal ducky = new Duck();
        Animal piggy = new Pig();
        ducky.makeSound();
        ducky.eat();
        piggy.makeSound();
        piggy.eat();
    }
}
