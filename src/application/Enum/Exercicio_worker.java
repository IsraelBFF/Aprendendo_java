package application.Enum;

import entities.enums.WorkerLevel;
import entities.*;

import java.text.*;
import java.util.*;

public class Exercicio_worker {
    static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter department's name: ");
        String nameDepartment = sc.next();

        System.out.println("\nEnter worker data:");
        System.out.print("Name: ");
        String nameWorker = sc.next();
        
        System.out.print("Level: ");
        String levelWorker = sc.next();
        
        System.out.print("Base salary: R$ ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker), baseSalary, new Department(nameDepartment));

        System.out.print("How manys contracts to this worker? ");
        int qntdContracts = sc.nextInt();

        for(int i = 0 ; i < qntdContracts ; i++){
            System.out.println("\nEnter contract #" + (i+1) + " data:");
           
            try{
                System.out.print("Date (dd/mm/yyyy): ");
                Date dateContract = sdf.parse(sc.next());

                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                
                System.out.print("Duration (hours): ");
                int duration = sc.nextInt();

                HourContract contract = new HourContract(dateContract, valuePerHour, duration);

                worker.addContract(contract);
            } catch (ParseException e){

            }


        }

        try{
            SimpleDateFormat dft2 = new SimpleDateFormat("MM/yyyy");

            System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
            String incomeDate = sc.next();

            Date dI = dft2.parse(incomeDate);

            Calendar dateIncome = Calendar.getInstance();
            dateIncome.setTime(dI);
            
            int month = 1 + dateIncome.get(Calendar.MONTH);
            int year = dateIncome.get(Calendar.YEAR);

            System.out.println("Name: " + worker.getName());
            System.out.println("Department: " + worker.getDepartment());
            System.out.printf("Income for %d/%d: %.2f ", month, year, worker.getIncome(year, month));
        } catch (ParseException e){}
    
        sc.close();
    }
}
