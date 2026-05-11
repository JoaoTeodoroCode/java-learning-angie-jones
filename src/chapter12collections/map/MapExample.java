package chapter12collections.map;

import java.util.HashMap;
import java.util.Map;

/* --- COLLECTION MAP ---
   1. Como o Map é uma interface, não pode ser instanciado, mas pode ser o tipo de um objeto.
(ou seja para usa lo temos que aplicar Polimorfismo)
   2. Par Chave-Valor (Key-Value): Cada entrada tem uma identificação única (Chave) e um dado (Valor).
   3. Chaves Únicas: Não podes ter chaves repetidas. Se tentares usar uma chave que já existe,
o Java substitui o valor antigo pelo novo.
   4. Acesso Rápido: É excelente para encontrar dados rapidamente sem ter de percorrer a lista toda.
   5. Uso em Automação: Perfeito para guardar "Massa de Dados" (ex: Username -> Password)
ou para ler configurações de ficheiros. */

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, lemon=17}

        System.out.println(fruitCalories.get("lemon")); //17

        System.out.println(fruitCalories.entrySet()); //[banana=105, orange=45, apple=95, lemon=17]

        fruitCalories.remove("orange");
        System.out.println(fruitCalories); //{banana=105, apple=95, lemon=17}
    }
}
