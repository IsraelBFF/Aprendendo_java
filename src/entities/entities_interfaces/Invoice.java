package entities.entities_interfaces;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    // Builder


    public Invoice (){}

    public Invoice (Double basicPayment, Double tax){
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    // Methods getters and setters

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public double getTotalPayment(){
        return getBasicPayment() + getTax(); // If I to alter any method, the result isn't affected -> Because I used the methods get's  
    }

    @Override 
    public String toString(){
        return "INVOICE:\n"
            + String.format("Basic payment: %.2f\n", getBasicPayment())
            + String.format("Tax: %.2f\n", getTax())
            + String.format("Total payment: %.2f\n", getTotalPayment());
    }

}
