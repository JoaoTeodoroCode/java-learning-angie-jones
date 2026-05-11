package chapter10polymorphism.independentexercise;

public class Fruit {
    /* acess modifier "protected" - O metodo/field é visível e pode ser usado dentro do mesmo package e tambem
   por subclasses (mesmo que estejam noutros pacotes) */
    protected int calories;

    //Criar um constructor para criar um objeto da class Fruit ja com as calorias definidas
    public Fruit(int calories){
        setCalories(calories);
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made!");
    }

}
