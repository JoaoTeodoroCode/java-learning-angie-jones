package chapter6classes_and_objects;

public class Rectangle {
    //1 - Os "fields" de um objeto sao as variaveis globais da classe(podem ser usadas em todos os metodos da classe)
    //Ou seja os "fields" são as caracteristicas do objeto

    /*Usando o principio do "encapsulamento" os fields criados para esta classe deve ser "private"
      Ou seja, as outras classes do codigo SO PODEM "aceder/usar" aos metodos da classe,
      mas NAO PODEM aceder/mudar os fields!!
      RESUMINDO: os FIELDS do objeto/classe são "private", e os METODOS do objeto/classe são "public" */
    private double length;
    private double width;

    //2 - Os "métodos" de um objeto são as ações que podem ser feitas dentro do objeto(usando os seus "fields")
    //Ou seja os "metodos" são aquilo que o objeto faz(comportamentos/açoes do objeto), usando os "fields"

    //METODOS CONSTRUTORES(CONSTRUCTORS) -> USADOS PARA CRIAR(INSTANCIAR) UM OBJETO E DAR LHE VALORES INICIAIS
    //OS METODOS CONSTRUCTORS TEM QUE TER O MESMO NOME DA CLASSE EM QUE ESTAO INSERIDOS!!
    //Construtor Default: Cria o objeto com valores iniciais padrão (vazio)
    public Rectangle(){
        length = 0;
        width = 0;
    }
    //Construtor com Parâmetros: É um "atalho" para criar o objeto já com valores iniciais definidos.
    public Rectangle(double length, double width){
        this.length = length;//pode ser escrito desta maneira
        setWidth(width);//ou pode ser escrito desta maneira(usando o metodo criado abaixo para fazer isto!
    }

    //Temos que criar este metodo para a class conseguir ir "buscar valor atribuido pelo
    // metodo "set" ao field "lenght"
    public double getLength(){
        return length;
    }
    //Temos que criar este metodo para a class conseguir ir "buscar valor atribuido pelo
    // metodo "set" ao field "width"
    public double getWidth(){
        return width;
    }
    //Temos que criar este metodo para a class conseguir ir "atribuir" valores para o field "length"
    public void setLength(double length){
        //O "this.lenght" significa que queres atribuir ao field "length" da classe o valor indicado no metodo
        //LOGO usamos o "this." quando queremos atribuir a uma field da classe um valor "calculado/indicado" no metodo
        this.length = length;
    }
    //Temos que criar este metodo para a class conseguir ir "atribuir" valores para o field "width"
    public void setWidth(double width){
        //O "this.width" significa que queres atribuir ao field "width" da classe o valor indicado no metodo
        //LOGO usamos o "this." quando queremos atribuir a uma field da classe um valor "calculado/indicado" no metodo
        this.width = width;
    }
    //Como queres que este metodo seja usado por outras classes do codigo nao podes escrever "static"
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    //Como queres que este metodo seja usado por outras classes do codigo nao podes escrever "static"
    public double calculateArea(){
        return length * width;
    }

    //Como o objetivo desta classe e servir de consulta para outras classes, nao precisa ter o metodo "main"

}
