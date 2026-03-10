package chapter4repetitionstructures_loops.chapter4a;
import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow the employee to work more hours
 * than the maximum number of hours of work per week permited.
 * Calculate de GrossPay.
 */

//O WHILE e usado quando queremos que o codigo SO comece a correr o loop se a condição do WHILE for satisfeita


/*Para que o WHILE nao corra indefinidamente dentro do programa,temos SEMPRE que terminar os loops
(neste caso o WHILE) atualizando o valor de uma variavel já criada antes de escrevermos os loops;
  A variavel que usamos para terminar os loops chamam se "sentinel";
  A variavel "Sentinel" e a variavel que ira controlar o fluxo dos loops e tambem controlar a condição
indicada no loop (neste caso no WHILE); Por esse motivo a variavel "sentinel" tem que ser uma das variaveis
usadas para escrever as condições do loop(neste caso do WHILE)
*/

public class GrossPayInputValidation {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //1 - Criar variaveis para os valores que conhecemos
        int rate = 15;
        int maxHour = 40;

        //2 - Obter(Get) do Operador os valores/variaveis que nao conhecemos
        System.out.println("How many hours did you work this week?:");
        double hourWorked = scanner.nextDouble();


        //3 - Validar o valor indicado pelo Operador (Estrutura de repetiçao)

        while(hourWorked > maxHour || hourWorked < 1){

            System.out.println("Invalid input. You have to enter a number between 1 and 40.Try again!");

            /*Como deixámos o Operador escrever um valor de novo(por causa do primeiro valor introduzido
              ser invalido, temos que voltar a ler o que ele escrever(ou seja usar de novo o scanner
              */

            /*como estas a ATUALIZAR o valor de uma variavel, nao precisas escrever "double" antes de "hourWorked"
              A variavel atualizada tem que ser SEMPRE uma das variaveis usada na condição do loop (neste caso do WHILE)
              */

            hourWorked = scanner.nextDouble();
            /* Neste caso a variavel "hourWorked" é a variavel "sentinel";
               (Porque é a variavel que e atualizada dentro do loop (neste caso do WHILE)
             */
        }
        // O programa só fará o que está escrito abaixo quando a condição do loop( neste caso do WHILE) for satisfeita
        //Só fechamos aqui o scanner porque ele ainda tem que ser usado no loop(neste caso no WHILE)
        scanner.close();

        //4 - Calcular o Gross Salary
        double gross = rate * hourWorked;
        System.out.println("Your gross pay is " + gross + "€.");
    }

}
