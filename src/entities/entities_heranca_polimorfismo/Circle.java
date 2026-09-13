package entities.entities_heranca_polimorfismo;

import entities.enums.heranca_polimorfismo.Color;

public class Circle extends Shape {
    private Double radius;

    // Builder

    public Circle (){}

    public Circle(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    // Methods getters and setters

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // Methods 

    @Override 
    public Double area(){
        return 3.14 * radius * radius;
    }

}
