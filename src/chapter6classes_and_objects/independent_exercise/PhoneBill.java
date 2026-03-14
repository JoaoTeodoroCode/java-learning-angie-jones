package chapter6classes_and_objects.independent_exercise;

public class PhoneBill {
    //1 - Identificar os fields/variaveis da classe/objeto
    //Como queremos queos fields so sejam usados/acedidos pelosmetodos destaclasse, iremos coloca-los "private"
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;


    //2 - Criar metodos para cada comportamento/açao que queremos que a classe faça
    //Como queremos queos metodos possamser usados/acedidos emoutras classes/codigo, iremos coloca-los "public"

    //metodo CONSTRUCTOR default (atribuir/"set" a todos os fields o valor inicial "0")para conseguir
    // criar/instanciar um objeto;
    //o metodo CONSTRUCTOR tem que ter o mesmo nome da classe em que esta inserido!;
    public PhoneBill(){
        setId(0);
        setBaseCost(0);
        setAllottedMinutes(0);
        setUsedMinutes(0);
    }
    //Metodo CONSTRUCTOR que so aceita como parametro o field "id" para conseguir criar/instanciar um objeto;
    //o metodo CONSTRUCTOR tem que ter o mesmo nome da classe em que esta inserido!;
    //Como somente o field "id" e um parametro do CONSTRUCTOR, os restantes fields
    // da classe terao valor inicial "0"
    public PhoneBill(int id){
        setId(id);
        setBaseCost(0);
        setAllottedMinutes(0);
        setUsedMinutes(0);
    }
    //Metodo CONSTRUCTOR que aceita como parametros todos os fields da classe para criar/instanciar um objeto;
    //o metodo CONSTRUCTOR tem que ter o mesmo nome da classe em que esta inserido!;
    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        setId(id);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setUsedMinutes(usedMinutes);
    }

    //metodo "set" para conseguir "atribuir" um valor ao field da classe "id"
    //como nao queremos "retornar" nenhum valor quando usamos este metodo, escrevemos "void"
    public void setId(int id){
        this.id = id;
    }
    //metodo "set" para conseguir "atribuir" um valor ao field da classe "baseCost"
    //como nao queremos "retornar" nenhum valor quando usamos este metodo, escrevemos "void"
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    //metodo "set" para conseguir "atribuir" um valor ao field da classe "allottedMinutes"
    //como nao queremos "retornar" nenhum valor quando usamos este metodo, escrevemos "void"
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    //metodo "set" para conseguir "atribuir" um valor ao field da classe "usedMinutes"
    //como nao queremos "retornar" nenhum valor quando usamos este metodo, escrevemos "void"
    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }
    //metodo "get" para conseguir "buscar/retornar" o valor atribuido pelo metodo "set" ao field "id"
    //como queremos retornar um valor quando usamos o metodo, NAO PODEMOS USAR "void";
    // O que temos que indicar/usar e o "data type" do valor que o metodo vai retornar(Ex: "int")
    public int getId(){
        return id;
    }
    //metodo "get" para conseguir "buscar/retornar" o valor atribuido pelo metodo "set" ao field "baseCost"
    //como queremos retornar um valor quando usamos o metodo, NAO PODEMOS USAR "void";
    // O que temos que indicar/usar e o "data type" do valor que o metodo vai retornar(Ex: "int")
    public double getBaseCost(){
        return baseCost;
    }
    //metodo "get" para conseguir "buscar/retornar" o valor atribuido pelo metodo "set" ao field "allottedMinutes"
    //como queremos retornar um valor quando usamos o metodo, NAO PODEMOS USAR "void";
    // O que temos que indicar/usar e o "data type" do valor que o metodo vai retornar(Ex: "int")
    public int getAllottedMinutes(){
        return allottedMinutes;
    }
    //metodo "get" para conseguir "buscar/retornar" o valor atribuido pelo metodo "set" ao field "allottedMinutes"
    //como queremos retornar um valor quando usamos o metodo, NAO PODEMOS USAR "void";
    // O que temos que indicar/usar e o "data type" do valor que o metodo vai retornar(Ex: "int")
    public int getUsedMinutes(){
        return usedMinutes;
    }
    //metodo para calcular o valor a pagar pelos overage minutes
    //neste metodo nao colocamos parametros para que o metodo use os valores guardados nos fields da classe
    public double calculateOverageMinutesCharge(){
        double chargeValue = 0.25;
        int overageMinutes = usedMinutes - allottedMinutes;
        double overageMinutesCharge = chargeValue * overageMinutes;
        return overageMinutesCharge;
    }
    //metodo para calcular o valor da taxa a pagar
    //Como precisamos do valor calculado no metodo "calculateOverageMinutesCharge",
    // entao tenho que o "chamar" dentro do metodo "calculateTax".
    //neste metodo nao colocamos parametros para que o metodo use os valores guardados nos fields da classe
    public double calculateTax(){
        double taxValue = 0.15;
        double tax = taxValue * (baseCost + calculateOverageMinutesCharge());
        return tax;
    }
    //metodo para calcular o valor do total a pagar
    //neste metodo nao colocamos parametros para que o metodo use os valores guardados nos fields da classe
    public double calculateTotal(){
        return baseCost + calculateOverageMinutesCharge()
                + calculateTax();
    }
    public void displayBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Phone Bill ID: " + id);
        System.out.println("Plan:" + baseCost + "€");
        System.out.println("Overage:" + calculateOverageMinutesCharge() + "€");
        System.out.println("Tax:" + calculateTax() + "€");
        System.out.println("Total:" + calculateTotal() + "€");
    }







}
