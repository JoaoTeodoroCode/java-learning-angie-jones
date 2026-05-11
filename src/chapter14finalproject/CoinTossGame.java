package chapter14finalproject;

import java.util.Scanner;

public class CoinTossGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        String player1Side = askSide();
        scanner.close();
        String player2Side = lastSide(player1Side);
        Coin coin = new Coin();
        String flipResult = coin.flip();
        checkWinner(player1, player1Side, player2 , player2Side, flipResult);
    }

    public static String askSide(){
        String side;
        do{
            System.out.println("Choose side: ");
            side = scanner.next();
        }while(!side.equals("Head") && !side.equals("Tail"));

        return side;

    }

    public static String lastSide(String side1){
        String side2;
        if(side1.equals("Head")){
            side2 = "Tail";
        }
        else{
            side2 = "Head";
        }
        return side2;
    }

    public static void checkWinner(Player player1,String player1Side,Player player2,String player2Side,String flipResult){

        if(player1Side.equals(flipResult)){
            player1.setGuess(true);
            System.out.println("The Winner is " + player1.getName());
        }
        else{
            player2.setGuess(true);
            System.out.println("The Winner is " + player2.getName());
        }
    }
}
