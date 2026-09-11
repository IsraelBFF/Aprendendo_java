package application.Enum;

import entities.Exercicio_poster.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Exercicio_poster {
    static void main(String[] args){

        try{
            SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            // 1º poster
            
            Date d1 = f1.parse("21/06/2028 13:05:44");
            Poster poster1 = new Poster(d1, "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
            poster1.addComment("Have a nice trip!");
            poster1.addComment("Wow that's awesome!");
            
        } catch (ParseException e){

        }

    }
}
