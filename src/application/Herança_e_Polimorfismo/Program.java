package application.Herança_e_Polimorfismo;

import entities.entities_heranca_polimorfismo.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int qntdEmployees = sc.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for(int i = 0 ; i < qntdEmployees ; i++){
            System.out.printf("\nEmployee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Hours: ");
            int hour = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(outsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employees.add(new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge));
            } else{
                employees.add(new Employee(name, hour, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS:");

        for(Employee e : employees){
            System.out.println(e.getName() + " - $ " + e.payment());
        }

        sc.close();
    }    
}
