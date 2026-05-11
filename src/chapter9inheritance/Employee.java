package chapter9inheritance;

/*
    A classe "Employee" será uma child class( ou subclass) da parent class Person
    Para criar uma relação de INHERITANCE(herança), no header da child class escrevemos a keyword "extends",
    seguido do nome da parent class
    Ex: "public class child extends parent {}"
 */

/*
    Criar a child class Employee que irá herdar os membros da parent class Person
    Assim sendo, a Employee class tem acesso a tudo incluido na classe Person(incluindo os metodos)
    Tudo o que for escrito dentro da child case "Person", SOMENTE DIZ REPEITO Á CHILD CASE; Ou seja,
os fields e metodos escritos dentro da CHILD CASE são EXCLUSIVOS da CHILD CASE;
*/

import java.util.Scanner;

public class Employee extends Person {
    /*Aqui ja nao preciso de "declarar" os fields e metodos que tao no "Rectangle" porque
      "Square" e uma CHILD CLASS da Rectangle
       Só iremos declarar aqui metodos do PARENT CLASS, caso ele funcione de forma direfente na CHILD CASE
       */
    //Como só queremos que os fields sejam usados pela CHILD CLASS, temos que os colocar "private"
    private String employeeID;
    private String title;
    private Scanner scanner = new Scanner(System.in);


    /*Criar CONSTRUCTOR DEFAULT (Criar um Objeto da classe Employee com os
     fields (tanto da classe Person como da classe Employee) todos vazios */
    public Employee(){
        /*quando queremos usar um determinado CONSTRUCTOR da PARENT CLASS dentro do CONSTRUCTOR da CHILD CLASS,
        usamos a keyword "super()"*/
        /*quando escrevemos "super()" e sem nada dentro dos parenteses, significa que queremos usar o
        CONSTRUCTOR DEFAULT DO PARENT CLASS */

        //super();

        /*Se quiseres usar o CONSTRUCTOR que tenha parametros, tens que indicar dentro do parenteses do
        "super()" qual os valores que queres atribuir para os parametros, por ordem que sao declaradas
        no CONSTRUCTOR */
        super("John");
        System.out.println("Usei o CONSTRUCTOR DEFAULT");
    }



    public String getEmployeeID(){
        System.out.println("Enter your employeeID: ");
        String employeeID = scanner.next();
        return employeeID;
    }
    public String getTitle(){
        System.out.println("Enter your title: ");
        String title = scanner.next();
        return title;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
