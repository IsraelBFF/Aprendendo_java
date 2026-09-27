package test.Exceções;

import java.util.Scanner;

public class assertiva {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        IO.print("Digite um número de 0 a 10: ");
        int num = sc.nextInt();

        assert (num >= 0 && num <= 10) : num;
        
        IO.println("You entered " + num);
        sc.close();
    }    
}
