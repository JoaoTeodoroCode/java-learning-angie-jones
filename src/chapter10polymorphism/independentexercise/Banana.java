package chapter10polymorphism.independentexercise;

//a classe Banana e uma child class que herda(inherits) da parent class Fruit
public class Banana extends Fruit {
    //1 - Criar o constructor para criar um objeto da child class ja com as calorias definidas
    //2 - Como queremos usar o constructor da parent class, temos que escrever a keyword super()
    public Banana(int calories){
        super(calories);
    }

    //2 - Criar o metodo peel(), especifico para a child class Banana()
    public void peel(){
        System.out.println("Banana its peel!");
    }

    //3 - //Como queremos que o metodo makeJuice da parent class Fruit tenha comportamento diferente, temos que fazer um override
    @Override
    public void makeJuice(){
        System.out.println("Banana Juice is made!");
    }
}
