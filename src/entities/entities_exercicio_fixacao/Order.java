package entities.entities_exercicio_fixacao;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
    SimpleDateFormat momentFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment = new Date();
    private OrderStatus status;

    private ArrayList<OrderItem> itens = new ArrayList<>();

    // Builder 

    public Order(){

    }

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    // Methods getters and setters

    public String getMoment(){
        return momentFormat.format(moment);
    }

    public OrderStatus getOrderStatus(){
        return status;
    }

    public void setOrderStatus(String statusStr){
        this.status = OrderStatus.valueOf(statusStr);
    }

    // Methods

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public Double total(){
        double sum = 0;

        for(OrderItem i : itens){
            sum += i.subTotal();
        }

        return sum;
    }
    
}
