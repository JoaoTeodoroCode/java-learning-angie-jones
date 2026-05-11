package chapter11binterfaces.independentexercise;


//Como Animal e uma classe abstrata usamos a keyword "extends"
//NOTA: Se Animal fosse uma interface, teriamos que usar a keyword "implements"
public class Duck extends Animal{
    @Override
    void makeSound(){
        System.out.println("The Duck is making noise!");
    }
}
