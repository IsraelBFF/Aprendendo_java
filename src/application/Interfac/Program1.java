package application.Interfac;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.entities_interfaces.*;
import services.BrazilTaxService;
import services.RentalService;

public class Program1 {

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        IO.println("Enter the rental details:");
        IO.print("Model car: ");
        String model = sc.nextLine();
        IO.print("Pickup: ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        IO.print("Return: ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(model));

        IO.print("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        IO.print("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rs.processInvoice(cr);

        IO.print(new Invoice(cr.getInvoice().getBasicPayment(), cr.getInvoice().getTax()));

        sc.close();
    }
}