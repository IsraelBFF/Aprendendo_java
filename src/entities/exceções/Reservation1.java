package entities.exceções;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation1{
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");

    // Builder

    public Reservation1(){}

    public Reservation1(Integer roomNumber, Date checkin, Date checkout){
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

    public void updateDates(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
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