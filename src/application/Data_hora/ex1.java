package application.Data_hora;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ex1{
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual sua data de nascimento (dd/mm/aaaa)? ");
        String nascString = sc.next();
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascDate = LocalDate.parse(nascString, f1 );

        System.out.println("Data de nascimento (formatado): " + nascDate.format(f1)); 
        System.out.println("Data de nascimento (ISO 8601): " + nascDate); 
        sc.close();
    }
}