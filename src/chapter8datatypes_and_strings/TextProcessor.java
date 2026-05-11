package chapter8datatypes_and_strings;


public class TextProcessor {

    public static void main(String[] args){
        countWords("I love Quality Assurance");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){

        /*1 - separar todas as palavras da String pelos espaços (" ") e guardar na variavel words
        (que sera um array of strings) */
        var words = text.split(" ");

        //contar quantas palavras tem a string e guardar em uma variavel
        int numberOfWords = words.length;

        //2 - Contar quantas palavras estao na string e fazer o output do resultado

        /*o %d e um placeholder usado para deixar um espaço reservado numa frase para ser preenchido
        posteriormente por algo (no caso do %d é por um numero inteiro
          o %s e um placeholder usado para deixar um espaço reservado numa frase para ser preenchido
        posteriormente por algo (no caso do %s é por uma string/texto
          o %f e um placeholder usado para deixar um espaço reservado numa frase para ser preenchido
        posteriormente por algo (no caso do %f é por um numero decimais/com virgulas
        */

        /*o ".format" serve para criar frases/texto de forma mais organizada, em vez de usar os " + " tal como
        usamos dentro dos parenteses do System.out.println por exemplo
        */
        String message = String.format("Your text contains %d words",numberOfWords);
        System.out.println(message);

        //3 - output de todas as palavras que estao contidas na string
        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
}
