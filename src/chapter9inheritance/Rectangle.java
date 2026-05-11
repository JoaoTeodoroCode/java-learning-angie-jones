package chapter9inheritance;
import java.util.Scanner;

/*
    Uma CHILD CLASS pode "OVERRIDE" de um metodo INHERITED("herdado") da PARENT CLASS
    "OVERRIDE" consisteem alterar na CHILD CLASS ofuncionamento de metodo INHERITED("herdado") da PARENT CLASS
* */


public class Rectangle {
   /* acess modifier "protected" - O metodo/field é visível e pode ser usado dentro do mesmo package e tambem
   por subclasses (mesmo que estejam noutros pacotes) */
    protected double length;
    protected double width;
    protected double sides = 4;
    protected Scanner scanner = new Scanner(System.in);

    public double getLength(){
        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        return length;
    }
    public double getWidth(){
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getSides(){
        System.out.println("Enter sides: ");
        double sides = scanner.nextDouble();
        return sides;
    }
    public void setSides(double sides){
        this.sides = sides;
    }
    //Não escrevemos parametros nometodo porque queremos queo metodo use ovalor dosfields guardados na classe
    public double calculatePerimeter(){
        return 2*length+2*width;
    }
}
