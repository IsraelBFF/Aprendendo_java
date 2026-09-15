package application.Exceções;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.exceções.*;

import java.util.Scanner;

public class very_bad_solution {
    static void main(String[] args) throws ParseException{
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        
        IO.print("Room number: ");
        int roomNumber = sc.nextInt();

        IO.print("Check-in date: ");
        Date checkin = f1.parse(sc.next()); // É aqui onde acontece o ParseException

        IO.print("Check-out date: ");
        Date checkout = f1.parse(sc.next());

        if(!checkout.after(checkin)){
            IO.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation r1 = new Reservation(roomNumber, checkin, checkout);
            IO.print(r1);

            IO.println("\n");

            IO.println("Enter data to update the reservation");
            IO.print("Check-in date: ");
            checkin = f1.parse(sc.next());
            IO.print("Check-out date: ");
            checkout = f1.parse(sc.next());

            Date now = new Date();

            if(checkin.before(now) || checkout.before(now)){
                IO.println("Error in reservation: Reservation dates for update must be future dates");
            } else if (checkout.before(checkin)){
                IO.println("Error in reservation: Check-out date must be after check-in date");
            } else {
                r1.updateDates(checkin, checkout);
                IO.println(r1);
            }
        }
        sc.close(); 
    }
}
