package entities.entities_exercicio_fixacao;

public class Product {
    private String name;
    private Double price;

    // Builder

    public Product(){

    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    // Methods getters and setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }
}
