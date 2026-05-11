package chapter11aabstraction;

/*
  A Abstraction(Abstração) é utilizada quando queremos definir um modelo (template) para uma
classe ou para um metodo, mas não pretendemos que esse modelo seja utilizado
tal como está (ou seja, não queremos que seja instanciado diretamente).
  Para indicar que estamos perante uma Abstraction(Abstração), temos que escrever no
header da class ou metodo o non acess modifier "abstract"
 */

//os Metodos abstract não tem body/código!!!! -> Basicamente só definimos o header do metodo! (Ex:"public abstract void connect();"

/*
 * Uma classe abstrata não é desenhada para ser instanciada (não podes criar um objeto dela).
 * Ela é desenhada para ser estendida/herdada(inheritance), transferindo assim a responsabilidade (o fardo)
 * da implementação para a CHILD CLASS.
 */

//IMPORTANTE: UMA CLASSE ABSTRATA PODE TER TAMBEM METODOS QUE NAO SAO ABSTRATOS

//Todas as childs classes que herdam um metodo abstract sao obrigadas a escrever o codigo / implementar desse metodo

//EXEMPLO: "public abstract void connect();"

public abstract class Shape {
    //Criar um metodo abstrato chamado calculateArea
    //o metodo nao tera body porque o codigo do metodo sera escrito nas child classes!!
    abstract double calculateArea();

    //IMPORTANTE: UMA CLASSE ABSTRATA PODE TER TAMBEM METODOS QUE NAO SAO ABSTRATOS
    public void print(){
        System.out.println("I am a shape!");
    }
}
