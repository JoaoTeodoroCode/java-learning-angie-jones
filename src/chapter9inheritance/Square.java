package chapter9inheritance;


//A CHILD CLASS Square "herda"(inherit) da PARENT CLASS Rectangle
public class Square extends Rectangle {
    /*Aqui ja nao preciso de "declarar" os fields e metodos que tao no "Rectangle" porque
      "Square" e uma CHILD CLASS da Rectangle
       Só iremos declarar aqui metodos do PARENT CLASS, caso ele funcione de forma direfente na CHILD CLASS
    */

    //Nos queremos "override" o metodo "calculatePerimeter" que fomos buscar ao PARENT CLASS Rectangle;
    //Ou seja, queremos que o metodo "calculatePerimeter" tenha um comportamento diferente quando chamado
    // no CHILD CLASS square;

    //Para o java saber que queremos "override", ambos os metodos tem que ter o mesmo Header

    /*Não precisei declarar aqui os fields sides e length porque o CHILD CLASS vai
      busca-los diretamente à PARENT CLASS */

    //SEMPRE que fizermos um override, TEMOS QUE escrever a annotation "@override" para o java saber!!!
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
}
