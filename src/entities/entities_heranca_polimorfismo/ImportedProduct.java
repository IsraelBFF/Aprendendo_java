package entities.entities_heranca_polimorfismo;

public class ImportedProduct extends Product {
    private Double customsFee;

    // Builder

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    // Methods getters and setters 
      
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Methods

    @Override
    public String priceTag(){
        return super.getName() + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

}
