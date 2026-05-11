package chapter10polymorphism.exercise2createdbyme;

public class Cellphone extends Device {

    //Criar CONSTRUCTOR PARA A CHILD CLASS
    public Cellphone(String name){
        //usar super() para utilizar o CONSTRUCTOR da PARENT CLASS
        super(name);
    }
    @Override
    public void connectDevice(){
        System.out.println("Connecting cellphone " + name);
        System.out.println("Cellphone " + name + " connected successfully.");
    }
    public void connect5G(){
        System.out.println("Connecting 5G");
        System.out.println("5G connected successfully.");
    }
}
