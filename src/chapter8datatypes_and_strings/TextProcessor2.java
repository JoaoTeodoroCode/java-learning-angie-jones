package chapter8datatypes_and_strings;

public class TextProcessor2 {

    public static void main(String[] args){
        reverseString("Hello World");
    }

    public static void reverseString(String text){

        //ciclo for para percorrer os characters da string;
        //Como tens que comecar de tras para a frente, nao podemos usar i = 0;
        //Para inicializador do for usamos int i = text.length() - 1 (correspondente ao ultimo valor do texto;
        //Como o incremento e i--, a condição para o for funcionar tem que ser i>=0;
        for(int i = text.length() - 1; i>=0; i--){
            //Como querer fazer output na mesma linha em vez de println fazer print
            //usamos o "charAt" para indicar a posicao/indice do valor que queremos imprimir
            System.out.print(text.charAt(i));
        }

    }
}
