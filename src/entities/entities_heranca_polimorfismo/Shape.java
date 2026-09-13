package entities.entities_heranca_polimorfismo;

import entities.enums.heranca_polimorfismo.*;

public abstract class Shape {
    private Color color;

    // Builder

    public Shape(){}

    public Shape(Color color){
        this.color = color;
    }

    // Methods getters and setters

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    // Methods

    public abstract Double area();
}
