package chapter12collections.list;

import java.util.ArrayList;
import java.util.List;

/* --- COLLECTION LIST ---
   2. Como o List é uma interface, não pode ser instanciado, mas pode ser o tipo de um objeto.
(ou seja para usa lo temos que aplicar Polimorfismo)
   2. Permite Duplicados: Podes ter vários elementos iguais (ex: duas "lemon").
   3. Mantém a Ordem: Os elementos ficam guardados exatamente na ordem em que os inseres.
   4. Baseada em Índices: Podes aceder a qualquer item pela sua posição (começa no 0).
   5. Uso em Automação: É a estrutura mais usada no Selenium para lidar com múltiplos elementos
(ex: listas de resultados, menus, tabelas). */

public class ListExample {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }
}
