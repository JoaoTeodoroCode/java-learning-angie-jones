package chapter10polymorphism.exercise2createdbyme;

public class Laptop extends Device{

    //Criar CONSTRUCTOR para criar um objeto da CHILD CLASS
    public Laptop(String name){
        //usar super() para utilizar o CONSTRUCTOR da PARENT CLASS
        super(name);
    }
    @Override
    public void connectDevice(){
        System.out.println("Connecting laptop " + name);
        System.out.println("Laptop " + name + " connected successfully.");
    }
    public void connectWifi(){
        System.out.println("Connecting Wifi");
        System.out.println("Wifi connected successfully.");
    }
}
