package application.Enum;

import entities.entities_exercicio_fixacao.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercicio_fixacao {
    static void main(String[] args){
        SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        Order pedido = new Order();
        
        System.out.println("Enter client data:");
        
        System.out.print("Name: ");
        String nameClient = sc.nextLine();

        System.out.print("Email: ");
        String emailClient = sc.next();

        System.out.print("Birth date (dd/mm/yyyy): ");
        String dateBirthday = sc.next();

        try{
            Client cliente = new Client(nameClient, emailClient, birthDateFormat.parse(dateBirthday));
            pedido.setClient(cliente);
        }
        catch (ParseException p) {p.printStackTrace();}

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        pedido.setOrderStatus(sc.next());

        System.out.print("How many items to this order? ");
        int qntdItem = sc.nextInt();

        for(int i = 1 ; i <= qntdItem ; i++){
            System.out.println("\nEnter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantProduct = sc.nextInt();

            Product product = new Product(nameProduct, priceProduct);
            OrderItem item = new OrderItem(quantProduct, priceProduct, product);
            pedido.addItem(item);
        }

        // Order summary

        System.out.println("\nORDER SUMMARY:");
        System.out.println(pedido);

        sc.close();
    }
}
