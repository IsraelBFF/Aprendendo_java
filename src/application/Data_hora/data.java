package application.Data_hora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

public class data {
    static void main(String[] args){
        // Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        // SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // System.out.println("d1 = " + d1);
        // System.out.println("d1 formatado = " + sdf1.format(d1));
        // System.out.println("d1 formatado c/ hora = " + sdf2.format(d1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Data: ");
        String data = sc.next();

        Date d1 = Date.from(Instant.parse());

        System.out.println(d1);
        
        sc.close();
    }
    
}
