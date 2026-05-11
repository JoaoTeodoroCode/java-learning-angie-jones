package chapter12collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/* --- COLLECTION QUEUE ---
   1. Como o Queue é uma interface, não pode ser instanciado, mas pode ser o tipo de um objeto.
(ou seja para usa lo temos que aplicar Polimorfismo)
   2. Ordem de Chegada (FIFO): First-In, First-Out. O primeiro a entrar é o primeiro a sair.
   3. Fila de Espera: Ideal para quando tens uma lista de tarefas ou dados que
precisam de ser processados um por um, na ordem correta.
   4. Implementação comum: Em Java, usamos muito o 'new LinkedList<>()' para criar uma Queue. */

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]

        fruit.remove();
        System.out.println(fruit); //[lemon, banana, orange, lemon]

        System.out.println(fruit.peek()); //lemon
    }
}
