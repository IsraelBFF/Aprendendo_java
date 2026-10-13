package app;

import models.entities.Circle;
import models.entities.Rectangle;
import models.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("How many figures you have? ");
        int qntdFigures = sc.nextInt();

        List<Shape> figures = new ArrayList<>();

        for(int i = 0 ; i < qntdFigures ; i++){
            IO.print("\nWhich is your figure?\n[1] Rectangle\n[2] Circle\n: ");
            int opFigure = sc.nextInt();

            switch (opFigure){
                case 1: 
                    IO.print("\nWidth: ");
                    double width = sc.nextDouble();
                    IO.print("Height: ");
                    double height = sc.nextDouble();

                    Rectangle r = new Rectangle(width, height);
                    figures.add(r);
                    break;   
                case 2:
                    IO.print("\nRadius: ");
                    double radius = sc.nextDouble();

                    Circle c = new Circle(radius);
                    figures.add(c);
                    break;
            }
        }

        double sumAreas = totalArea(figures);

        IO.println(String.format("\nTotal area: %.2f", sumAreas));
        sc.close();
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
       
        for (Shape shape : list){
            sum += shape.area();
        }

        return sum;
    }
}
