package entities.entities_heranca_polimorfismo;

public abstract class Taxpayer {
    private String name;
    private Double annual_income;

    // Builder

    public Taxpayer(){}

    public Taxpayer(String name, Double annual_income){
        this.name = name;
        this.annual_income = annual_income;
    }

    // Methods getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnual_income() {
        return annual_income;
    }

    public void setAnnual_income(Double annual_income) {
        this.annual_income = annual_income;
    }

    // Methods

    public abstract double valueTax();
}
