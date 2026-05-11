package chapter9inheritance.independentexercise;

import java.util.Scanner;

public class Cake {
    //Criar os fields da classe(superclass);
    private  String flavor;
    private  double price;
    //metodo constructor que cria objeto com field "flavor" ja preenchido
    public Cake(String flavor){
        setFlavor(flavor);
    }
    //metodos get para "buscar" os valores que queremos atribuir aos fields
    public  String getFlavor(){
        return flavor;
    }
    public  double getPrice(){
        return price;
    }
    //metodos set para "atribuir" os valores aos fields da classe
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
