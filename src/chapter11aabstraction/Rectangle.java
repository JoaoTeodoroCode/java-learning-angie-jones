package chapter11aabstraction;

//A class Rectangle e uma child class da class abstrata Shape

//Se nesta child class nao fossem implementados/escritos todos os metodos abstracts da parent class, esta
// child class tambem tinha que ser "abstract"

public class Rectangle extends Shape{
    //Identificar os fields
    private double length;
    private double width;

    //Criar o CONSTRUCTOR para criar um objeto da child class Rectangle
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length*width;
    }
}
