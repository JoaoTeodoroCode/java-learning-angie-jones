package chapter9inheritance;

/*
   INHERITANCE(herança) é onde uma classe se torna uma extensão de outra classe,
herdando, portanto, os membros dessa classe.
   Existem duas partes envolvidas numa INHERITANCE(herança):
       - a PARENT CLASS (or base class or superclass)
       - CHILD CLASS (or derived class or subclass)
   Quando uma relação de INHERITANCE(herança) é criada entre duas classes, a CHILD CLASS inherits(herda)
todos os membros da PARENT CLASS.
   OU SEJA, a CHILD CLASS passa a ter acesso a tudo o que esta incluido na PARENT CLASS(incluindo os metodos)
INHERITANCE(herança) permite que as classes reutilizem dados(members) que já existem dentro de outras classes.
   As CHILD CLASS devem ser uma forma mais especializada DA PARENT CLASS da qual herdam os membros.
INHERITANCE(herança) é conhecida como uma relação "is a".Exemplo:
      - Um EMPREGADO é uma PESSOA; logo o EMPREGADO é a CHILD CLASS, e a PESSOA é a PARENT CLASS;
      - Sendo uma CHILD CLASS, significa que class EMPREGADO é um tipo especifico da classe PESSOA;

    Para criar uma relação de INHERITANCE(herança), no header da child class escrevemos a keyword "extends",
seguido do nome da parent class
Ex: "public class child extends parent {}"
*/


import java.util.Scanner;

public class Person {
    //Escrever os fields(caracteristicas) da PARENT CLASS
    //Como só queremos que os fields sejam usados pela PARENT CLASS, temos que os colocar "private"
    private String name;
    private int age;
    private String gender;
    static Scanner scanner = new Scanner(System.in);

    /*Criar CONSTRUCTOR DEFAULT (Criar um Objeto da classe Person com os
      fields da classe Person todos vazios */
    public Person(){
        System.out.println("Usei o CONSTRUCTOR DEFAULT");
    }
    //Criar CONSTRUCTOR  que cria um objeto ja com o field name preenchido
    public Person(String name){
        System.out.println("Usei o 2º construtor que so usa name");
    }
    //Metodos get para "buscar" os valores atribuidos pelo metodo "set" aos fields da classe
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    //Metodos set para "atribuir" valores para os fields da classe
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
