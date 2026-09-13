package application.Herança_e_Polimorfismo;

import entities.entities_heranca_polimorfismo.*;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Program2 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of products: ");
        int qntdProducts = sc.nextInt();

        ArrayList<Product> products = new ArrayList<>();

        for(int i = 0 ; i < qntdProducts ; i++){
            System.out.println("\nProduct #" + (i+1) + " data:");
            System.out.print("Comon, used or imported (c, u, i)? ");
            char answer = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(answer == 'u'){
                DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.print("Manufacture date: ");
                String dateStr = sc.next();

                LocalDate date = LocalDate.parse(dateStr, f1);

                products.add(new UsedProduct(name, price, date));
            } else if(answer == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS:");

        for(Product p : products){
            System.out.println(p.priceTag());
        }
        
        sc.close();
    }
}
