package chapter12collections.set;

import java.util.HashSet;
import java.util.Set;

/* --- COLLECTION SET ---
   1. Como o Set é uma interface, não pode ser instanciado, mas pode ser o tipo de um objeto.
(ou seja para usa lo temos que aplicar Polimorfismo)
   2. Não permite duplicados: Se tentares adicionar um elemento que já existe, o Java ignora-o.
   3. Sem Ordem Garantida: Ao contrário da List, o Set não guarda os itens por ordem de chegada
(o HashSet, por exemplo, baralha-os).
   4. Sem Índice: Não podes fazer "get(0)" porque não existe uma posição fixa.
   5. Uso em Automação: Excelente para validar se todos os IDs, nomes de produtos ou links de uma página são únicos.
*/

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]
    }
}
