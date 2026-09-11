package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    // Constructor

    public HourContract(){
        
    }

    public HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    // Getters and Setters

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours(){
        return hours;
    }

    public void setHours(Integer hours){
        this.hours = hours;
    }

    // Method toString

    public String toString(){
        return "Contract (Date: " + date + ", Value per hour: R$ " + valuePerHour + ", Hours : " + hours + ")";
    }

    // Methods

    public Double totalValue(){
        return valuePerHour * hours;
    }

}
