package chapter14finalproject;

public class Player {
    private String name;
    private Boolean guess;

    public Player(String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGuess(Boolean guess){
        this.guess = guess;
    }

    public String getName(){
        return name;
    }
    public Boolean getGuess(){
        return guess;
    }
}
