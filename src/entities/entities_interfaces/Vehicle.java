package entities.entities_interfaces;

public class Vehicle {
    private String model;

    // Builder

    public Vehicle(){}

    public Vehicle(String model){
        this.model = model;
    }

    // Methods getters and setters

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
