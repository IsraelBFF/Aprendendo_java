package application.Herança_e_Polimorfismo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import entities.entities_heranca_polimorfismo.*;
import entities.enums.heranca_polimorfismo.*;

public class Program3 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of shape: ");
        int qntdShape = sc.nextInt();
        
        List<Shape> shapes = new ArrayList<>();

        for(int i = 0 ; i < qntdShape ; i++){
            System.out.println("\nShape #" + (i+1) + " data:");
            
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.next().charAt(0);

            System.out.print("Color (BLACK/ BLUE/ RED): ");
            String colorStr = sc.next();

            if(shape == 'r'){
                System.out.print("Width: ");
                double w = sc.nextDouble();

                System.out.print("Height: ");
                double h = sc.nextDouble();

                shapes.add(new Rectangle(Color.valueOf(colorStr), w, h));
            } else if(shape == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shapes.add(new Circle(Color.valueOf(colorStr), radius));
            }
        }   

        System.out.println("\nSHAPE AREAS:");

        for(Shape s : shapes){
            System.out.printf("%.2f\n",s.area());
        }

        sc.close();
    }
}
