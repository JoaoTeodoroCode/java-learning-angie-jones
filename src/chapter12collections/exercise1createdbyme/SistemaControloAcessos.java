package chapter12collections.exercise1createdbyme;

/*
Tens uma lista de IDs capturados pelo sensor: ["ID-10", "ID-20", "ID-10", "ID-30", "ID-20", "ID-40"].

Problema A: Como podes ver, alguns IDs aparecem repetidos (porque a pessoa passou o cartão duas vezes ou o sensor falhou).
            Tu precisas de uma lista final apenas com os IDs únicos, mas é obrigatório manter a ordem em que eles apareceram
            pela primeira vez.


Problema B: Depois de teres a lista de IDs únicos, precisas de associar cada ID ao Nome do Funcionário:
                ID-10 -> "Ana"
                ID-20 -> "Bruno"
                ID-30" -> "Carla"
                ID-40" -> "David"
 */


import java.util.*;

public class SistemaControloAcessos {
    public static void main(String[] args){
        //Problema A
        //Como nao queres valores repetidos tens que usar a Collection Set, mas a ordem e importante usaremos o LinkedHashSet
        List<String> Ids = IDs();
        Set<String> IDsUnicos = new LinkedHashSet<>(Ids);
        System.out.println(IDsUnicos);

        Map<String,String> mapeamento = MapIDsWithName();
        displayEmployee(mapeamento);

    }

    public static List<String> IDs(){
        List<String> Ids = new ArrayList<>();
        Ids.add("ID-10");
        Ids.add("ID-20");
        Ids.add("ID-10");
        Ids.add("ID-30");
        Ids.add("ID-20");
        Ids.add("ID-40");

        return Ids;
    }
    //Problema B
    //Como queres atribuir os valores dos IDs aos respetivos nomes, temos que fazer um "mapeamento".
    //Por isso iremos usar a Colection Map
    public static Map<String,String> MapIDsWithName(){
        Map<String,String> MapIDsWithName = new HashMap<>();
        MapIDsWithName.put("ID-10","Ana");
        MapIDsWithName.put("ID-20","Bruno");
        MapIDsWithName.put("ID-30","Carla");
        MapIDsWithName.put("ID-40","David");
        return MapIDsWithName;
    }
    public static void displayEmployee(Map<String,String> mapeamento){
        //Percorrer o Map para escrever mensagem de acesso autorizado para cada user
        //Para isso temos que usar o for each loop
        for(var value : mapeamento.entrySet()){
            String id = value.getKey();
            String nome = value.getValue();
            System.out.println("Acesso autorizado " + nome);
        }

    }

}
