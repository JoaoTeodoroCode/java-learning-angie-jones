package chapter7arrays.chapter7a;

//ARRAYS são objetos(ou containers) que podem guardar varios elements/valores


/*a declaration de um ARRAY é constituido pelo seguinte:

1 - QUANDO NAO SABEMOS OS VALORES QUE ESTARAO DENTRO DO ARRAY QUE IREMOS CRIAR!!

"datatype" [] "nomeDoArray" = new "datatype"[indicaraqui dentro onumero de elements/valores que o array terá(Ex:6)];

      data type -> indica o data type de TODOS os elements/valores que estarao dentro do array
      parenteses [] -> usado para indicar que ,em vez de uma variavel, estaremos a declarar um Array

Ex: int[] exemplo = new int[5]; (Neste caso os indices do array serão 0,1,2,3,4

2 - QUANDO SABEMOS OS VALORES QUE ESTARAO DENTRO DO ARRAY QUE IREMOS CRIAR!!!

"datatype" [] "nomeDoArray" = new {indicar aqui todos os elementos que queremos no array separados por ","};

Ex: int[] exemplo2 = new{10,20,30,40,50};
*/

//INDICE de um array -> indica a POSICAO de um element/valor dentro de um Array
//A contagem dos INDICES comeca em 0!!! OU SEJA o indice 0 representa o 1º element/valor dentro do array

/*para atribuir ou acessar valores de uma determinada posição do array, usamos o indice!!
EX: exemplo[0] = 10; -> isto significa que estamos a atribuir o elemento de indice 0 do array o valor "10".
*/


import java.util.Random;

public class LotteryTicket {

    //como queremos que este field tenha SEMPRE o mesmo valor CONSTANTE, e que NUNCA POSSA ser ATUALIZADO
    // em um metodo, entao para isso:
    // 1 - escrevemos keyword "final" ; 2-escrevemos o nome da variavel em maisuculas!
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        printTicket(ticket);

    }

    //criar um metodo para gerar 6 numeros aleatorios e guarda-os (SET) em um array de valores
    /*como, em vez de retornar um unico valor inteiro, vai retornar um array de valores, em vez de "int"
    escrevemos int[]; assim significa que o return type do metodo sera um array de valores inteiros*/
    public static int[] generateNumbers(){

        //criar um array
        int[] ticket = new int[LENGTH];

        //criar valores random
        Random random = new Random();

        //atribuir a cada elemento do array um valor random
        //como iremos repetir 6 vezes a atribuição, entao usaremos um ciclo FOR
        for(int i=0; i <LENGTH; i++){

            //colocamos random.nextInt() porque queremos que ele crie valores aleatórios INTEIROS
            //colocamos so BOUND porque so nos interessa neste caso colocar um valorlimite final parao random
            ticket[i]= random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;


    }

    //criar metodo para escrever o ticket gerado
    public static void printTicket(int[] ticket){
        //temos que fazer um ciclo for para conseguirmos imprimir/aceder aos elementos de cada posição do array
        for(int i=0; i <LENGTH; i++){
            //Como queremos que os resulados aparecem NAMESMA LINHA no ecrã, usamos o print em vez do println
            System.out.print(ticket[i] + "|");
        }
    }
}
