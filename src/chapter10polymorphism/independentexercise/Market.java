package chapter10polymorphism.independentexercise;


//Class criada para testar o polymorphism
public class Market {
    public static void main(String[] args){
        //1 - Criar um objeto da parent class Fruit e testar o metodo makeJuice()
        Fruit fruit = new Fruit(100);
        fruit.makeJuice();

        //aplicar o polymorphism
        //Vamos criar um objeto do tipo Fruit, mas indicamos que sera uma instancia do tipo da child class Apple()

        // IMPORTANTE: O tipo Fruit (o "rótulo") define quais métodos podemos chamar (apenas os da Fruit).
        // A instância Apple (o "objeto real") define como esses métodos serão executados (se houver Override).
        // Métodos exclusivos da Apple ficam escondidos, a menos que se use um Cast.
        Fruit apple = new Apple(120);
        juice(apple);

        Fruit banana = new Banana(100);
        juice(banana);

    }
    //Usando na pratica o polymorphism
    //Criar metodo para correr o metodo makejuice consoante o tipo de fruit
    //Este metodo utiliza polimorfismo para aceitar como argumento qualquer instância da parent class Fruit
    // ou das suas subclasses
    public static void juice(Fruit fruit){
        if (fruit instanceof Apple){
            // Métodos exclusivos da Apple ficam escondidos, a menos que se use um Cast.
            //Se quisermosusar metodosque soestao escritos na child class, temosque fazer um cast, porque otipo do objeto é Fruit enao Apple
            ((Apple) fruit).removeSeeds();
            System.out.println("Apple juice is made!");
        }
        else if(fruit instanceof Banana){
            // Métodos exclusivos da Banana ficam escondidos, a menos que se use um Cast.
            //Se quisermosusar metodosque soestao escritos na child class, temosque fazer um cast, porque otipo do objeto é Fruit enao Banana
            ((Banana) fruit).peel();
            System.out.println("Banana juice is made!");
        }

    }
}
