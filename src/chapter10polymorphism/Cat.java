package chapter10polymorphism;

//a class Cat é uma child class da Parent class Animal
//Ou seja, a class Cat inherites(herda) da class Animal todos os fields e metodos!
public class Cat extends Animal{

    //Fazer o override do metodo makeSound() para que o metodo tenha um comportamente diferente do indicado
    //na Parent Class quando o "chamamos" na Child Class
    @Override
    public void makeSound(){
        System.out.println("Miau!");
    }

    //Criar um metodo especifico para a child class dog chamada scratch()
    public void scratch(){
        System.out.println("I´m a cat. I scratch things!!!");
    }
}
