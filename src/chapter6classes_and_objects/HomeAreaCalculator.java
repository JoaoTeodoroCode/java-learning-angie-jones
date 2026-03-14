package chapter6classes_and_objects;
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args){
        //1 - Criar primeira instance da class/object "Rectangle" para calcular area room1
        //Para criar temos que escrever tipo "nomeClasse" "nomeInstance" = new "constructor";
        Rectangle room1 = new Rectangle();

        //2 - Atribuir(set) os valores do "length" e "width" do room1
        //Para trabalhar sobre o objeto "room1" usando os metodos definidos na classe "Rectangle" usamos "room1.Metodo"
        room1.setLength(25);
        room1.setWidth(10);
        //3 - calcular area do room1
        double areaOfRoom1 = room1.calculateArea();

        //4 - Criar segunda instance da class/object "Rectangle" para calcular area room2 e atribuir os valores
        Rectangle room2 = new Rectangle(50,30);
        //5 - calcular area do room2
        double areaOfRoom2 = room2.calculateArea();

        //6 - Somar as duas areas
        double totalArea = areaOfRoom1 + areaOfRoom2;

        //7 - Escrever o Output
        System.out.println("The total area of the two rooms is "+ totalArea + ".");

    }
}
