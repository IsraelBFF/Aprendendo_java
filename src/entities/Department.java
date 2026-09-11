package entities;

public class Department {
    private String name;

    // Constructors

    public Department(){

    }

    public Department(String name){
        this.name = name;
    }

    // Methods Getters and Setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Method toString

    public String toString(){
        return name;
    }
}
