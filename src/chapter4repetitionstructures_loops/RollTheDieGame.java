package chapter4repetitionstructures_loops;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args){
        //1 - Criar variaveis para aquilo que sabemos
        int total = 20;
        int rolls = 5;
        int space = 0;
        int remaining = 20;
        Random random = new Random();

        //3 - estrutura de repetição
        for (int i=0; i<rolls; i++){
            //lançar o dado
            int die = random.nextInt(6) + 1;
            space = space + die;
            remaining = remaining - die;
            if (remaining>0){
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + space +
                        " and have " + remaining + " more to go.");
            }
            else if (remaining==0){
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + space +
                        ". You Win!!");
                break;
            }
            else{
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You exceed " + total + ". Sorry!!!You lose.");
                break;
            }
        }
        if (remaining>0){
            System.out.println("Sorry!You lost the game.");
        }

    }
}
