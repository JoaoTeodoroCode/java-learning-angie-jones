package chapter10polymorphism.exercise2createdbyme;

public class Device {
    String name;

    //Criar o CONSTRUCTOR
    public Device(String name){
        this.name = name;
    }

    public void connectDevice(){
        System.out.println("Connecting device " + name);
        System.out.println("Device " + name + " connected successfully.");
    }
}
