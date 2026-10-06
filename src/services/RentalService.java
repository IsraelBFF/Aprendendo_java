package services;

import java.time.Duration;

import entities.entities_interfaces.CarRental;
import entities.entities_interfaces.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    // Builder 

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService){
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    // Method

    public void processInvoice(CarRental carRental){
        Duration duration = Duration.between(carRental.getStart(), carRental.getFinish());

        double hoursDuration = duration.toMinutes();

        double basicPayment;
        if (hoursDuration/60 <= 12) {basicPayment = Math.ceil(hoursDuration/60) * pricePerHour;}
        else {basicPayment = Math.ceil(hoursDuration/60/24) * pricePerDay;}

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
