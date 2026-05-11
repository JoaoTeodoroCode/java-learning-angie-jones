package chapter10polymorphism.independentexercise;


//a classe Apple e uma child class que herda(inherits) da parent class Fruit
public class Apple extends Fruit {
    //1 - Criar o constructor para criar um objeto da child class ja com as calorias definidas
    //2 - Como queremos usar o constructor da parent class, temos que escrever a keyword super()
    public Apple(int calories){
        super(calories);
    }

    //2 - Criar o metodo removeSeeds(), especifico para a child class Apple()
    public void removeSeeds(){
        System.out.println("Seeds of the Apple its removed!");
    }

    //Como queremos que o metodo makeJuice da parent class Fruit tenha comportamento diferente, temos que fazer um override
    @Override
    public void makeJuice(){
        System.out.println("Apple Juice is made!");
    }
}
