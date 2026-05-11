package chapter10polymorphism.exercise2createdbyme;

public class TestDevice {
    public static void main(String[] args){
        //Criar um objeto da parent class Device e testar metodo connectDevice()
        Device device = new Device("Dispositivo");
        device.connectDevice();

        //Aplicar polymorphism
        Device cellphone = new Cellphone("telemóvel");
        testOfDevice(cellphone);
        Device laptop = new Laptop("computador");
        testOfDevice(laptop);
    }

    public static void testOfDevice(Device device){
        if(device instanceof Cellphone){
            device.connectDevice();
            //Como o tipo do Objeto é Device, mas é uma instancia da child classe Cellphone,
            // para usarmos um metodo da classe Cellphone temos que fazer um CAST
            ((Cellphone) device).connect5G();
        }
        else if(device instanceof Laptop){
            device.connectDevice();
            //Como o tipo do Objeto é Device, mas é uma instancia da child classe Laptop,
            // para usarmos um metodo da classe Laptop temos que fazer um CAST
            ((Laptop)device).connectWifi();
        }
    }
}
