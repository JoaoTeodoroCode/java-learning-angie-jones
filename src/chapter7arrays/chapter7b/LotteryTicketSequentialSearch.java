package chapter7arrays.chapter7b;


import java.util.Arrays;
import java.util.Random;

public class LotteryTicketSequentialSearch {

    //como queremos que este field tenha SEMPRE o mesmo valor CONSTANTE, e que NUNCA POSSA ser ATUALIZADO
    // em um metodo, entao para isso:
    // 1 - escrevemos keyword "final" ; 2-escrevemos o nome da variavel em maisuculas!
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        //ordenar o array ticket(por ordem crescente)
        Arrays.sort(ticket);
        //output do ticket ao user
        printTicket(ticket);

    }

    //criar um metodo para gerar 6 numeros aleatorios  E DIFERENETES e guarda-os (SET) em um array de valores
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
            int randomNumber;

            //fazemos um "DO WHILE" loop neste caso porque so queremos "criar" o
            // random number quando tivermos a certeza que o valor nao e repetido

            /*Gerar um número aleatório e, de seguida, pesquisar para garantir que este
              ainda não existe no array;
              Se já existir, criar outro número aleatório e pesquisar novamente. */

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(sequentialSearch(ticket, randomNumber));

            //Quando chegamos aqui, ja sabemos que o numero nao se repete e por isso adicionamos ao array!
            ticket[i]= randomNumber;
        }

        return ticket;


    }

    //criar metodo para verificar se o valor random criado ja esta no array

    /**
     * metodo que irá fazer um "sequential search" ao array para encontrar um valor
     * @param ticket - array onde iremos procurar
     * @param randomNumber - valor que iremos procurar se já esta no array
     * @return true se encontrar o valor; false se nao encontrar o valor
     */
    public static boolean sequentialSearch(int[] ticket, int randomNumber){
        /*
        exemplo de um "FOR EACH" LOOP.
        Ele percorre o 'array' e, em cada iteração,
         atribui o elemento atual à variável 'value'.
        */

        //TRADUCAO: "Para cada elemento int chamado value que esteja DENTRO DO array ticket"
        for(int value : ticket){
            if(value == randomNumber){
                return true;
            }
        }

        /*se chegarmos aqui significa que o valor que procuramos é unico, e que portanto
        nao foi encontrado dentro do array */

        return false;

    }

    //criar metodo para escrever o ticket gerado
    public static void printTicket(int[] ticket){
        //temos que fazer um ciclo for para conseguirmos imprimir/aceder aos elementos de cada posição do array
        for(int i=0; i <LENGTH; i++){
            //Como queremos que os resulados aparecem NAMESMA LINHA no ecrã, usamos o print em vez do println
            System.out.print(ticket[i] + "|");
        }
    }

    public static boolean binarySearch(int[] ticket, int randomNumber){

        //1 - ordenar(Sort) os valores do array
        Arrays.sort(ticket);
        //2 - fazer o binary search
        int index = Arrays.binarySearch(ticket, randomNumber);

        //Se valor for encontrado significa que o index e maior que 0
        if(index >=0){
            return true;
        }
        else{
            return false;
        }
    }
}
