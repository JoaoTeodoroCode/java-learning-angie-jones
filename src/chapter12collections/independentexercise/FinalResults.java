package chapter12collections.independentexercise;

import java.util.HashMap;
import java.util.Map;


public class FinalResults {
    public static void main(String[] args){
        compareResults();
    }
    public static void compareResults(){
        Map <String,Integer> firstResult = TestResults.getOriginalGrades();
        Map <String,Integer> secondResult = TestResults.getMakeUpGrades();
        Map <String,Integer> finalResult= new HashMap<>(firstResult);
        for(var item1 : secondResult.entrySet()){
            var nome = item1.getKey();
            var notaNova = item1.getValue();
            int notaAntiga = firstResult.get(nome);
            if(notaNova > notaAntiga){
                finalResult.put(nome,notaNova);
            }
        }
        System.out.println(finalResult);
    }
}
