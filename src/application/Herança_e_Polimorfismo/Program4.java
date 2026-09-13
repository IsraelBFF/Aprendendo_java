package application.Herança_e_Polimorfismo;

import entities.entities_heranca_polimorfismo.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program4 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of tax payers: ");
        int qntdTaxPayer = sc.nextInt();

        List<Taxpayer> taxPayers = new ArrayList<>();

        for(int i = 0 ; i < qntdTaxPayer ; i++){
            System.out.println("Tax payer #" + (i+1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char p = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Annual income: ");
            double annual_income = sc.nextDouble();

            if(p == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxPayers.add(new Natural_person(name, annual_income, healthExpenditures));
            } else if (p == 'c'){
                System.out.print("Number of employees: ");
                int qntdEmployees = sc.nextInt();

                taxPayers.add(new Legal_person(name, annual_income, qntdEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");

        double sumTax = 0;
        for(Taxpayer t : taxPayers){
            System.out.printf("%s: $ %.2f\n", t.getName(), t.valueTax());
            sumTax += t.valueTax();
        }

        System.out.printf("\nTAXES PAID: $ %.2f", sumTax);

        sc.close();
    }
}
