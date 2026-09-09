package application.Data_hora;

import java.util.*;
import java.text.*;
import java.time.*;

public class data {
    static void main(String[] args){
        // Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        // SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        // System.out.println("d1 = " + d1);
        // System.out.println("d1 formatado apenas data = " + sdf1.format(d1));
        // System.out.println("d1 formatado c/ hora = " + sdf2.format(d1));


        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
            String dataNasc = sc.next();

            Date dNasc = sdf1.parse(dataNasc);
            System.out.println(sdf1.format(dNasc));

            Date d1 = new Date();

            System.out.println("Loucura");

            
        } catch (ParseException e) {
            System.out.println("Formato de data inválido.");
        }

        
        
        sc.close();
    }
    
}
