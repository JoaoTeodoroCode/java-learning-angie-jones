package chapter11binterfaces;

//Numa interface tambem teremos metodos sem body
//A diferenca entre uma interface e uma abstraction é que no method header nao precisamos
// escrever "abstract" quando estamos em uma interface

//Uma interface NÃO tera definido fields, SO tera definidos metodos SEM BODY

//O OBJETIVO de uma INTERFACE é servir como MOLDE(ESQUEMA/BLUEPRINT), garantindo que qualquer classe que implemente a interface
//terá os metodos da interface disponíveis.

//Para usar uma interface, no header da class escrevemos a keyword "implements" seguida do nome da interface

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    //non access modifier "default" - Usado em interfaces, indicando que o metodo tem um implementação pronta(codigo escrito)
    // dentro da interface.
    default String getBarcode(){
        return("No barcode");
    }
}
