package chapter2javafundamentals;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String [] args) {
        //Estas duas barras criam comentários

        /*
        1. Obter(Get) o número de horas que o empregado trabalhou

        O "Scanner" serve para nos recebermos aquilo que o utilizador escreve no ecrã
        O "System.in" diz nos que a direção do fluxo de dados é "Teclado" -> "Programa/código"
        Ou seja o "System.in" indica que a informação vai para "dentro" do sistema/Programa/código
        */
        Scanner scanner = new Scanner(System.in);

        // "System.out.println()" serve para indicar ao Java o que se pretende que seja escrito no ecrã

        System.out.println("Enter the number of hours the employee worked.");

        /*
        As variáveis são usadas para guardar valores(data), para que os possamos usar depois
        Ao declarar variáveis primeiro indicamos o tipo("int" ou "float",...) e depois indicamos o nome dela
        Nota: "fazer um assignment" = "atribuir um valor a uma variavel criada"
        */
        int hours = scanner.nextInt();

        /*
        2. Obter(Get) o valor que o empregado recebe por hora de trabalho
        O "System.out" diz nos que a direção do fluxo de dados é "Programa/código" -> "Ecrã"
        Ou seja o "System.out" indica que a informação sai do sistema
        */
        System.out.println("Enter the employee`s pay rate.");
        // Como já declaraste/criaste uma vez o "Scanner" aqui não precisas criar de novo, podes usar o criado antes
        double rate = scanner.nextDouble();

        // Nós temos sempre que fechar o último scanner que fazemos no código
        scanner.close();
        /*
        3. Multiplicar o número de horas pelo valor pago por hora ao trabalhador

        quando queremos usar uma variável, usamos o nome que demos a ela quando a criámos
        */
        double grossPay = hours * rate;
        /*
        4. Mostrar o resultado no ecrã

        o símbolo "+" dentro do println serve para fazer "append"("adicionar" ou "juntar") textos com variáveis
        */
        System.out.println("The employee`s gross pay is " + grossPay + "€");

    }
}
