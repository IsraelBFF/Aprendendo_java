package application.Arquivos;

import entities.entities_arquivos.Product;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio_fixacao_arquivos {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // Reading the file products.csv
        String strPathSourceFile = "/home/israel/Documents/Java/Aprendendo/src/application/Arquivos/products.csv";
        File PathSourceFile = new File(strPathSourceFile);

        try(BufferedReader br = new BufferedReader(new FileReader(PathSourceFile))){
            // Reading each product in *products.csv*
            String line = br.readLine();
            
            while (line != null){
                String[] product = line.split(",");
            
                String nameProduct = product[0];
                double priceProduct = Double.parseDouble(product[1]);
                int quantProduct = Integer.parseInt(product[2]);

                products.add(new Product(nameProduct, priceProduct, quantProduct));
                line = br.readLine();
            }

            // Creating a new folder
            String strPathNewFolder = "/home/israel/Documents/Java/Aprendendo/src/application/Arquivos/";
            boolean newFolder = new File(strPathNewFolder + "out/").mkdir();

            // Creating a new file
            String strPathNewFile = "/home/israel/Documents/Java/Aprendendo/src/application/Arquivos/out/summary.csv";
            File pathNewFile = new File(strPathNewFile);

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathNewFile))){
                for(Product p : products){bw.write(p + "\n");}
            }
        } catch(IOException e){
            IO.println("Error! The file don't exist!");
        }
        
        sc.close();
    }
}
