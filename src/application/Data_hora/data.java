package application.Data_hora;

import java.util.*;
import java.text.*;

public class data {
    static void main(String[] args){
        Date d1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy");

        System.out.println("d1 = " + d1);
        System.out.println("d1 formatado = " + sdf1.format(d1));

    }
    
}
