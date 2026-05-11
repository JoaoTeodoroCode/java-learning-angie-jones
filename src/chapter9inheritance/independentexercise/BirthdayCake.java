package chapter9inheritance.independentexercise;

//BirthdayCase é uma child class da classe Cake. por isso no header escrevemos "extends"
public class BirthdayCake extends Cake {
    //indicar fields espicificos da child class
    private int candles;

    //criar constructor usado para criar um objeto da child class
    public BirthdayCake(String flavor){
        //usar super() para indicar que pretendemos usar um Constructor da parent class
        super(flavor);
    }
    //metodo get para "buscar" os valores que queremos atribuir aos fields
    public int getCandles(){
        return candles;
    }
    //metodo set para "atribuir" valores ao field
    public void setCandles(int candles){
        this.candles = candles;
    }
}
