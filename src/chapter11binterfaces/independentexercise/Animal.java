package chapter11binterfaces.independentexercise;

public abstract class Animal {
    //metodo abstract makeSound() -> Como é abstract, o metodo nao terá body!
    abstract void makeSound();
    //metodo nao abstract eat() -> Como não é abstract significa que terá body!
    void eat(){
        System.out.println("Im eating!");
    }
}
