package app;

import java.util.Scanner;

import services.PrintService;

public class Program {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("How many values? ");
        int qntdValues = sc.nextInt();

        PrintService ps = new PrintService();

        for(int i = 0 ; i < qntdValues ; i++) {ps.addValue(sc.nextInt());}

        ps.print();
        IO.println("First: " + ps.first());        

        sc.close();
    }
}
