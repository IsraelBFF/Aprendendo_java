package application.Enum;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
    static void main(String[] args){
        Order order = new Order(123, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);

        // Formas de chamar o valor do enum

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf(("DELIVERED"));

        System.out.println(os1);
        System.out.println(os2);
    }
}
