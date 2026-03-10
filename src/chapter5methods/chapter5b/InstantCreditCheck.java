package chapter5methods.chapter5b;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

//Uma variavel declarada so esta disponivel dentro dos parenteses {} onde ela se encontra declarada!!!
/*Quando queremos usar uma variavel em mais que um metodo, temos que
  a declarar "fora de todos os metodos da classe( Ex: a variavel "minimumSalary")!! */

/*IMPORTANTE: TEMOS SEMPRE QUE CRIAR UM METODO PARA CADA VALOR/SITUAÇÃO QUE QUEREMOS QUE SEJA FORNECIDO
  AO METODO "MAIN"
  ISTO PORQUE CADA METODO SO É CAPAZ DE FORNECER O VALOR DE SOMENTE 1 VARIAVEL AO METODO "MAIN" */

import java.util.Scanner;

public class InstantCreditCheck {

    //1 - Criar variaveis para os valores que sabemos
    /*Como sao variaveis que vao ser usadas em varios metodos, entao colocamos elas "ao nivel" da
      classe e nao dentro de um metodo especifico!!! */

    //Como os metodos sao "static", as variaveis tambem terao que ser "static"
    static int minimumSalary = 25000;
    static int minimumCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //1 - Obter(get) os valor do salario do user que nao conhecemos("chamando" o metodo "getSalary") criado abaixo
        //Para poder usar o valor do metodo, temos que guarda lo em uma variavel dentro do "main"
        double salaryRecieved = getSalary();
        //2 - Obter(get) os valor do creditScore do user que nao conhecemos("chamando" o metodo "getCreditScore") criado abaixo
        int creditScoreRecieved = getCreditScore();
        //4 - Fechar os scanners usados nos metodos acima
        scanner.close();

        //3 - Estrutura de decisão (para saber se o user e qualificado (chamando metodo "isUserQualified" criado abaixo)
        //Para que funcione, nos metodos escritos do "main" tenho que passar as variavies necessarias para que ele possa correr!!!
        //Como iremos precisar de usar o valor deste metodo, iremos criamos uma variavel para guardar o seu valor
        boolean qualified = isUserQualified(salaryRecieved,creditScoreRecieved);

        //4 - Notificar o user
        notifyUser(qualified);
    }

    /*Criar metodos para buscar valores, e verificar se esta qualificado!,
    ficando somente dentro do metodo "main" a execução do codigo/metodos para resolver o problema!!!
     */
    //Colocamos no header "void" porque so queres "buscar informação" e nao pretendes que metodo retorne valores.

    //Metodo para obter o salario do user
    //Como queremos que metodo retone valores ao metodo "main" temos que escrever o datatype em vez de "void"
    public static double getSalary(){
        System.out.println("What is your salary?: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    //Metodo para obter o creditScore do user
    //Como queremos que metodo retone valores ao metodo "main" temos que escrever o datatype em vez de "void"
    public static int getCreditScore(){
        System.out.println("What is your credit score?: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    //Como queremos verificar se esta qualificado, e é uma situação de "true/false" usaremos o data type boolean
    //Para conseguirmos usar as variaveis criadas dentro de outros metodos,
    public static boolean isUserQualified(double salary, int creditScore){
        if (salary >= minimumSalary && creditScore >= minimumCreditScore){
            return true;
        }
        else{
            return false;
        }

    }
    public static void notifyUser (boolean isQualified){
        if(isQualified == true){
            System.out.println("You have been approved!!");
        }
        else{
            System.out.println("You have not been approved!!");
        }

    }
}
