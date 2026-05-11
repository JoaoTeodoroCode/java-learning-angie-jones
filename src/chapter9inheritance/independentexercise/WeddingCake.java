package chapter9inheritance.independentexercise;

//WeddingCake é uma child class da classe Cake. por isso no header escrevemos "extends"
public class WeddingCake extends Cake {
    //indicar fields espicificos da child class
    private int tiers;

    //criar constructor usado para criar um objeto da child class
    public WeddingCake(String flavor){
        //usar super() para indicar que pretendemos usar um Constructor da parent class
        super(flavor);
    }
    //metodo get para "buscar" os valores que queremos atribuir aos fields
    public int getTiers(){
        return tiers;
    }
    //metodo set para "atribuir" valores indicados pelo metodo get aos fields
    public void setTiers(int tiers){
        this.tiers = tiers;
    }
}
