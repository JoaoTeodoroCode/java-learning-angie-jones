package chapter13exceptions;

/*
    Uma exceção(exception) é um evento inesperado que ocorre durante a execução (runtime) devido a um erro.
    Uma "try/catch clause" é usada para tratar exceções dentro do teu código, para que o programa não vá abaixo(crash)
e para que possas fornecer uma mensagem útil em caso de erro.
    Dentro do try{} colocamos o código "perigoso" (aquele que pode dar erro, algo que pode falhar)
    Dentro do catch(){} dizemos duas coisas:
        dentro do () -> dizemos QUAL o erro/exception que esperamos
        dentro do {} -> dizemos o que fazer se o erro/exception acontecer
Quando temos a certeza da exception que pretendemos "apanhar" escrevemos ela diretamente(Ex: catch (IOException e))
Quando nao sabemos as exceptioms que o codigo do try pode dar, aplicamos Polymorphism, usando "Exception" (Ex: catch (Exception e))
    Podemos tambem ter uma finally clause (finally{})
    A finally clause é executada após o try clause e após quaisquer catch clause, mesmo que as cláusulas catch não sejam executadas.
    O codigo escrito dentro da finally clause (finally{}) É SEMPRE CORRIDO!!
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        //createNewFile();
        //numbersExceptionHandling();
        calculateSalary(42, 200);
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        //o "file.createNewFile()" da uma exception, por isso temos que o colocar dentro de uma "try/catch clause"
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory does not exist.");
            //O metodo printStackTrace() fornece informações sobre o erro e também o caminho que o código percorreu antes de lá chegar.
            e.printStackTrace();
        }
    }
    //Exemplo de como fazemos quando queremos "tratar" de multiplas exceptions(ou seja, ter varios catchs
    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            fileReader.close();
        }
    }
    //Aqui vamos fazer um rethrow de uma exception
    //Quando um metodo lança (throws) uma exceção, assume-se que a exceção será capturada e tratada por outro metodo,
    //ou lançada novamente (rethrown) por quaisquer métodos que o chamem.
    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        //o "file.createNewFile()" da uma exception, por isso temos que o colocar dentro de uma "try/catch clause"
        file.createNewFile();
    }

    //O metodo pode iniciar o lançamento(throw) de uma exceção utilizando a palavra `throw` dentro do corpo do metodo
    //e instanciando uma exceção.
    public static void calculateSalary(double hours, double rate){
        if(hours > 40){
            throw new IllegalArgumentException("We don´t allow overtime");
        }
    }

}

