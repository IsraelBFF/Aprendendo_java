package entities.entities_heranca_polimorfismo;

public class Employee{
    private String name;
    protected  Integer hour;
    protected  Double valuePerHour;

    // Builder

    public Employee(){

    }

    public Employee (String name, Integer hour, Double valuePerHour){
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    // Methods getters and setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getHour(){
        return hour;
    }

    public void setHour(Integer hour){
        this.hour = hour;
    }

    public Double getValuePerHour(){
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }

    // Methods

    public Double payment(){
        return hour * valuePerHour;
    }
}