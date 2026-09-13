package entities.entities_heranca_polimorfismo;

public class Natural_person extends Taxpayer {
    private Double health;

    // Builder 

    public Natural_person(){}

    public Natural_person(String name, Double annual_income, Double health){
        super(name, annual_income);
        this.health = health;
    }

    // Methods getters and setters
    
    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    // Methods

    @Override 
    public double valueTax(){
        double tax;
        
        if(getAnnual_income() < 20000){
            tax = getAnnual_income() * 0.15;
        } else {
            tax = getAnnual_income() * 0.25;
        }

        if (health > 0){
            tax -= health * 0.5;
        }

        return tax;
    }
}
