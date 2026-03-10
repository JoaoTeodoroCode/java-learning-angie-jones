package chapter5methods.chapter5a;

//Métodos são usados para "partir" problemas complexos em partes pequenas e gerenciáveis.
//Os métodos devem fazer uma tarefa especifica
//IMPORTANTE: O METODO SEMPRE RETORNA SOMENTE UM VALOR!!!

/*O metodo e constituido pelos seguinte:


METHOD HEADER:
ESTRUTURA:("acess modifier" "non acess modifier" "return type" "method signature" {"METHOD BODY"})
  * access modifier - indica quem pode acessar e usar o metodo!!
    * "public" - significa que qualquer codigo em qualquer classe do programa pode usar o metodo criado
    * "private" - significa que o metodo so pode ser usado na classe em que foi escrito/criado
    * "proteted" - O metodo é visível dentro do mesmo package e por subclasses (mesmo que estejam
noutros pacotes)

  * non acess modifier -
    * "static" - O metodo pertence à Classe e não ao objeto.
    * "final" - O metodo não pode ser alterado (sobrescrito) pelas classes que herdarem dele.
    * "abstract" - O metodo não tem "corpo" { }. Ele apenas define que o metodo deve existir,obrigando a
quem herda a escrever a lógica.
    * "synchronized" - Usado em multi-threading; garante que apenas uma "pessoa" (thread) use o metodo
por vez.

  * return type (OBRIGATORIO INDICAR) - indica o "data type" do valor final que o metodo irá retornar(quando
tiver escrito "void" significa que o metodo nao ira retornar nenhum valor)

  * method signature(TEM QUE TER UM VALOR UNICO( NAO REPETIDO) DENTRO DA CLASSE) - consiste no seguinte:
     * name - o nome do metodo deve refletir aquilo que o metodo vai fazer; deve comecar SEMPRE por um verbo
     * parenteses "( , )" - dentro deles ira estar indicado as variaveis/parametros
usadas dentro do metodo, e o seu data type


METHOD BODY:( O QUE VEM DENTRO DAS CHAVETAS "{}") - consiste nas linhas de código que serão executadas SEMPRE
QUE o metodo é "chamado" dentro de uma classe.
    *IMPORTANTE: SEMPRE que o data type do metodo for DIFERENTE de "void", o metodo deve ter SEMPRE o STATEMENT
"return", indicando o valor que o metodo ira returnar, sendo do mesmo data type que o definido no HEADER do
metodo

 */

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks a user for their name, then greets them by name.
 */
public class Greetings {


    //2 - Criar o metodo "main" para que o codigo da classe corra!!!
    // para o metodo "greatUser" correr, temos que o colocar dentro do metodo "main"!!!
    public static void main(String[] args){
        //1 - Obter(get) o nome do user
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scanner.next();

        //2 - Usar o metodo criado acima para enviar a mensagem de greatings
        greatUser(name);

    }
    //como nao queremos que o metodo "name" retone nenhum valor, entao o data type sera "void"

    //1 - Criar um metodo para escrever a mensagem de greatings
    public static void greatUser (String name){

        System.out.println("Hi " + name + "!");
    }

}
