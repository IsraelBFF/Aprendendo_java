package entities.exceções;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation2{
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");

    // Builder

    public Reservation2(){}

    public Reservation2(Integer roomNumber, Date checkin, Date checkout){
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    // Methods getters and setters 

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    // Methods

    public long duration(){
        long diff = checkout.getTime() - checkin.getTime(); 
        // atribui a diferença entre as datas em milisegundos

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        // converte a data de milisegundos para dias 
    }

    public String updateDates(Date checkin, Date checkout){
        Date now = new Date();

        if(checkin.before(now) || checkout.before(now)){
            return "Error in reservation: Reservation dates for update must be future dates";
        } else if (checkout.before(checkin)){
            return "Error in reservation: Check-out date must be after check-in date";
        } else {
            this.checkin = checkin;
            this.checkout = checkout;

            return null;
        }
    }

    @Override 
    public String toString(){
        return "Reservation: Room "
            + roomNumber 
            + ", checkin: "
            + f1.format(checkin)
            + ", checkout: "
            + f1.format(checkout)
            + " "
            + duration()
            + " nights";
    }
}