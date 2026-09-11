package entities.entities_exercicio_fixacao;

import java.util.ArrayList;

public class OrderItem {
    private Integer quantity;
    private Double price;
       
    // Builder

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price){
        this.quantity = quantity;
        this.price = price;
    }

    // Methods getters and setters

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    // Methods

    public Double subTotal(){
        return quantity * price;
    }
}
