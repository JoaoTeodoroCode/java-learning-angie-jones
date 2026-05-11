package chapter11binterfaces.independentexercise;


//Como Animal e uma classe abstrata usamos a keyword "extends"
//NOTA: Se Animal fosse uma interface, teriamos que usar a keyword "implements"
public class Pig extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Pig is making noise!");
    }
}
