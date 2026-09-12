package application.Enum;

import entities.entities_exercicio_fixacao.*;
import entities.enums.OrderStatus;

import java.util.Scanner;
import java.util.Date; 

public class Exercicio_fixacao {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Client cliente = new Client();
        Order pedido = new Order();
        
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        cliente.setName(sc.next());

        System.out.print("Email: ");
        sc.nextLine();
        cliente.setEmail(sc.nextLine());

        System.out.println("Birth date (dd/mm/yyyy): ");
        cliente.setBirthDate(sc.next());

        System.out.println("\nEnter order data:");
        System.out.println("Status: ");
        pedido.getOrderStatus();

        System.out.println("\nHow many items to this order? ");
        int qntdItem = sc.nextInt();

        


        sc.close();
    }
}
