package application.Exceções;

import entities.exceções.Account;
import exceptions.accountException;

import java.util.Scanner;

public class Program_fixacao {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        IO.println("Enter account data:");
        IO.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        IO.print("Holder: ");
        String holder = sc.nextLine();
        IO.print("Initial balance: ");
        double balance = sc.nextDouble();
        IO.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);
    
        IO.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            account.withdraw(amount);
            IO.println("New balance: " + account.getBalance());
        } catch (accountException e){
            IO.println(e.getMessage());
        }
        
    
        sc.close();
    }
}
