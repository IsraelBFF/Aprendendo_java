package entities.entities_heranca_polimorfismo;

import entities.enums.heranca_polimorfismo.*;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    // Builder 

    public Rectangle(){

    }

    public Rectangle(Color color, Double width, Double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    // Methods getters and setters

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
    
    public Double getHeight() {
        return height;
    }
   
    public void setHeight(Double height) {
        this.height = height;
    }

    // Methods

    @Override 
    public Double area(){
        return height * width;
    }

}
