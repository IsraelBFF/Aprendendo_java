package entities.entities_heranca_polimorfismo;

public class Product {
    private String name;
    private Double price;

    // Builder

    public Product(){}

    public Product(String name, Double price){
        this.name = name;
        this.price = price; 
    }

    // Methods getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    // Methods

    public String priceTag(){
        return name + " $ " + price;
    }


}
