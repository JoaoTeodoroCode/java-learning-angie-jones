package chapter8datatypes_and_strings;

public class TextProcessor3 {
    public static void main(String[] args){
        addSpaces("HelloWord!ItsMeTaylor!");
    }

    //Criar metodo para adicionar um espaço antes de uma letra maiuscula
    public static void addSpaces(String text){

        /*1 - adicionar um espaço " " antes das letras maiusculas e guardar na variavel modifiedText
        (que sera um array of strings) */

        //StringBuilder é uma ferramenta do Java usada para criar e modificar textos de forma eficiente.
        //As strings sao imutaveis. Logo para "manipula-las"/altera-las, temos SEMPRE que criar um StringBuilder
        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            //verificar se um character esta em Uppercase, e se estiver, adicionar um space antes
            //NOTA: Como nao queremos adicionar um espaço antes da primeira letra do Text, temos que colocar
            //na condição do if "i!=0"
            //Como queremos verificar letras/characters, temos que usar a WrapperClass "Character"
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                //Como tu queres avançar o espaço que tu adicionaste(para nao tares a criar espaços infinitos seguidos),
                //temos que incrementar (i++) logo apos termos adicionado um espaço
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
