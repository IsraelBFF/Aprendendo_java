package application.Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.entities_poster.*;


public class Exercicio_poster {
    static void main(String[] args){

        try{
            SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            // 1º poster
            
            Date d1 = f1.parse("21/06/2028 13:05:44");
            Poster poster1 = new Poster(d1, "Traveling to New Zeland", "I'm going to visit this wonderful country!", 12);
            poster1.addComment("Have a nice trip!");
            poster1.addComment("Wow that's awesome!");
            
            // 2º poster

            Date d2 = f1.parse("28/07/2028 23:14:19");
            Poster poster2 = new Poster(d2, "Good night guys", "See you tomorrow", 5);
            poster2.addComment("Good night");
            poster2.addComment("May the Force be with you");

            // Output 1º poster

            System.out.println(poster1.getTitle());
            System.out.println(poster1.getLikes() + " Likes - " + poster1.getMoment());
            System.out.println(poster1.getContent());
            
            System.out.println("Comments:");
            for(Comment c : poster1.getComments()){
                System.out.println(c.getText());
            }
            //

            System.out.println();

            // Output 2º poster

            System.out.println(poster2.getTitle());
            System.out.println(poster2.getLikes() + " Likes - " + poster2.getMoment());
            System.out.println(poster2.getContent());
            
            System.out.println("Comments:");
            for(Comment c : poster2.getComments()){
                System.out.println(c.getText());
            }

        } catch (ParseException e){

        }

    }
}
