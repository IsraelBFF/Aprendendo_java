package application.Interfac;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.entities_interfaces.Contract;
import services.interfac.ContractService;
import services.interfac.OnlinePaymentService;
import services.interfac.PaypalService;

public class Exercicio_fixacao {
    static void main(String[] args){
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        
        IO.println("Enter the data of contract:");
        IO.print("Number: ");
        int number = sc.nextInt();
        IO.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),f1);
        IO.print("Total value: ");
        Double totalValue = sc.nextDouble();
        
        Contract c = new Contract(number, date, totalValue);
        
        IO.print("Number of installments: ");
        int qntdInstallment = sc.nextInt();
        
        ContractService cs = new ContractService(new PaypalService());

        IO.println("Installments:");
        cs.processContract(c, qntdInstallment, new PaypalService());

        sc.close();
    }
}
