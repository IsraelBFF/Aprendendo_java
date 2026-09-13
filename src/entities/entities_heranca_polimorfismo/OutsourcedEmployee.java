package entities.entities_heranca_polimorfismo;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    // Builders

    public OutsourcedEmployee (String name, Integer hour, Double valuePerHour, Double additionalCharge){
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    // Methods getters and setters

    public Double getAdditionalCharge(){
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge){
        this.additionalCharge = additionalCharge;
    }

    // Methods 

    @Override 
    public Double payment(){
        return (hour * valuePerHour) + (additionalCharge * 1.1);
    }
}