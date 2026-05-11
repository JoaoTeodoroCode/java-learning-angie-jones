package chapter10polymorphism;

//a class Dog é uma child class da Parent class Animal
//Ou seja, a class Dog inherites(herda) da class Animal todos os fields e metodos!
public class Dog extends Animal{

    //vamos override o metodo makeSound() que temos na parent class
    //Ou seja o metodo makeSound() vai ter um comportamento diferente na child class
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

    //Criar um metodo especifico para a child class dog chamada fetch()
    public void fetch(){
        System.out.println("Fetch is fun!");
    }

}
