package entities.entities_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private ArrayList<Installment> installments = new ArrayList<>();

    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Builders

    public Contract(){}

    public Contract(Integer number, LocalDate date, Double totalValue){
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    // Methods getters and setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public void addInstallment(Installment installment){
        installments.add(installment);
    }

    public Installment getInstallment(int indexInstallment){
        return installments.get(indexInstallment-1);
    }

}
