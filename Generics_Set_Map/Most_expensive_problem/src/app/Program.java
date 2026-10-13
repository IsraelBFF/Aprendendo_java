package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import models.entities.Product;
import models.services.CalculationService;

public class Program {
    static void main(String[] args){
        String pathFile = "/home/israel/Documents/Java/Learning_Java/Generics_Set_Map/Most_expensive_problem/src/app/products.txt";
        ArrayList<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(pathFile))){
            String infoProduct = br.readLine();

            while(infoProduct != null){
                String[] fields = infoProduct.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                infoProduct = br.readLine();
            }

            Product max = CalculationService.max(products);
            
            IO.println("Most expensive: ");
            IO.println(max);
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
