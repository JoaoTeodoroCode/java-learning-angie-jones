package chapter12collections;

import java.util.*;

/* Maneiras de fazer loops em collections:
    1ª - usando um iterator; (FUNCIONA NOS TIPOS List; Set; Queue)
    2º - usando o enhanced for loop (ou for each loop); (FUNCIONA NOS TIPOS List; Set; Queue);
o enhanced for loop tambem funciona no maps, mas escrito de maneira diferente!!!
    3º - usando o metodo for each; (FUNCIONA NOS TIPOS List; Set; Queue)
o metodo for each tambem funciona no maps, mas escrito de maneira diferente!!!
 */

public class CollectionsDemo {
    public static void main(String[] args){
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();

    }
    public static void setDemo(){
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        System.out.println(fruit.size());
        System.out.println(fruit);
        //Fazer loop em collections usando um iterator
        var i = fruit.iterator();
        //o ".hasNext()" significa perguntar se "Ainda há mais elementos para ler nesta coleção?"
        while(i.hasNext()){
            //o ".next()" é o metodo que faz "saltar" para o próximo elemento e o devolve
            System.out.println(i.next());
        }
        //Fazer loop em collections usando o enhanced for loop (ou for each loop)
        for(String item:fruit){
            System.out.println(item);
        }
        //fazer loop em collections usando o metodo for each
        fruit.forEach(item -> System.out.println(item));

    }
    public static void listDemo(){
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }
    public static void queueDemo(){
        Queue<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);

        System.out.println(fruit.peek());
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);

        //Fazer loop no map usando o enhanced for loop (ou for each loop)
        for(var item : fruitCalories.entrySet()){
            System.out.println(item.getValue());
        }
        //fazer loop no map usando o for each method
        fruitCalories.forEach((k,v) -> System.out.println("Fruit " + k + ", Calories " + v));
    }
}
