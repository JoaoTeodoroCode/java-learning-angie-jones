package chapter6classes_and_objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //O metodo "getRoom" não é static.
        // Como o metodo "main" é static, para nao dar erro ao usar o "getRoom" dentro do main,
        // temos que criar uma instance da classe em que estamos a trabalhar usando o seguinte formato:
        //"nomeClasse" "nomeInstance" = new "nomeClasse"
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bedroom = calculator.getRoom();

        //calcular a soma das areas
        double totalArea = calculator.calculateTotalArea(kitchen,bedroom);

        //Output valor
        System.out.println("The total area is " + totalArea + ".");

        calculator.scanner.close();

    }

    //Ao criar o metodo "getRoom", vamos indicar que o dataType do metodo será "Rectangle".
    //Fazemos isto para conseguirmos usar todos os metodos que criamos dentro da classe "Rectangle"

    public Rectangle getRoom(){
        //Obter (get) do user o length do room
        System.out.println("What is the room length? ");
        double length = scanner.nextDouble();
        //Obter (get) do user o width do room
        System.out.println("What is the room width? ");
        double width = scanner.nextDouble();
        //Criar o room com os valores introduzidos pelo user
        Rectangle room = new Rectangle(length,width);
        return room;
    }

    public double calculateTotalArea(Rectangle kitchen, Rectangle bedroom){
        double totalArea = kitchen.calculateArea() + bedroom.calculateArea();
        return totalArea;
    }
}
