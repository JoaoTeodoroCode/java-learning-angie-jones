package chapter10polymorphism;

/*
    Polimorfismo(polymorphism) é a capacidade de assumir múltiplas formas.
    Em Programação Orientada a Objetos, permite que uma subclasse defina comportamentos únicos,
mantendo a capacidade de partilhar comportamentos da sua superclasse.
 */

public class Zoo {

    public static void main(String[] args){

        //Instanciar(Criar) um objeto da class Dog chamada cao!
        Dog cao = new Dog();
        cao.fetch();
        cao.makeSound();
        feed(cao);

        //Aqui vamos praticar o polymorphism
        //Vamos criar um objeto do tipo Animal, mas indicamos que sera uma instancia do tipo da child class Dog()
        // IMPORTANTE: O tipo Animal (o "rótulo") define quais métodos podemos chamar (apenas os da Animal).
        // A instância Dog (o "objeto real") define como esses métodos serão executados (se houver Override).
        // Métodos exclusivos da Dog ficam escondidos, a menos que se use um Cast.

        Animal pet = new Dog();
        pet.makeSound();
        feed(pet);

        //Outro exemplo de polymorphism
        //Podemos associar avariável 'pet' auma nova instância,nestecaso, dotipo daoutra child class chamada Cat()
        pet = new Cat();
        pet.makeSound();
        feed(pet);

        /* CASTING (Downcasting):
              O Java limita o acesso a métodos com base no TIPO DA REFERÊNCIA (ex: Animal).
              Se o objeto for realmente um 'Cat', mas a variável for 'Animal', o Java "esconde"
        os métodos exclusivos do Cat. O casting permite "forçar" o Java a tratar o objeto
        como 'Cat' de forma pontual, recuperando o acesso a esses métodos específicos. */
        ((Cat) pet).scratch();

    }

    /*Criar metodo feed()
      Este metodo utiliza polimorfismo para aceitar como argumento qualquer
    instância da parent class Animal ou das suas subclasses (Dog, Cat, etc.). */

    public static void feed(Animal animal){

        //este metodo tera um comportamento diferente, dependendo da child class indicada ao isntanciar o objeto

        //Para dizer ao java qual a instancia a que nos tamos a referir em um determinado comportamento,
        // usamos "instanceof"

        if(animal instanceof Dog){
            System.out.println("Here´s the dog food!");
        }
        else if(animal instanceof Cat){
            System.out.println("Here´s the cat food!");
        }



    }
}
