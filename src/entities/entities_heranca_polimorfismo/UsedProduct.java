package entities.entities_heranca_polimorfismo;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class UsedProduct extends Product {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private LocalDate manufactureDate;

    // Builder

    public UsedProduct(){

    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    } 

    // Methods getters and setters

    public String getManufactureDate() {
        return f1.format(manufactureDate);
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Methods

    @Override 
    public String priceTag(){
        return getName() + " (used) $ " + getPrice() + " (Manufacture date: " + getManufactureDate() + ")";
    }

}
