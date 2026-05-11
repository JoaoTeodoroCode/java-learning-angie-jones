package chapter11aabstraction;

public class ShapeTester {
    public static void main(String[] args){

        //Como a class Shape é abstract, para criar um objeto do tipo Shape, temos que aplicar o Polymorphism,
        //indicando que sera uma instancia do tipo da child class Rectangle

        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
