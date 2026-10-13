package app;

import java.util.Scanner;

import models.interfaces.InterestService;
import models.services.BrazilInterestService;

public class Program {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("Amount: ");
        double amount = sc.nextDouble();
        IO.print("Months: ");
        int months = sc.nextInt();
        IO.println("Payment after " + months + " months:");

        InterestService is = new BrazilInterestService(2.0);

        IO.println(String.format("%.2f", is.payment(amount, months)));

        sc.close();
    }
}
