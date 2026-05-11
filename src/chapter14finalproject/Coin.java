package chapter14finalproject;


import java.util.Random;

import static java.lang.Math.random;

public class Coin {
    private String side;

    //Como a variavel tem que ser constante, temos que usar o "final"
    public static final String HEAD = "Head";
    public static final String TAIL = "Tail";

    public String getSide(){
        return side;
    }
    public void setSide(String side){
        this.side = side;
    }

    public String flip() {
        if (Math.random() < 0.5) {
            side = HEAD;
        } else {
            side = TAIL;
        }
        return side;
    }

}
