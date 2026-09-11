package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private ArrayList<HourContract> contracts = new ArrayList<>();
    private Department department;

    // Construtor

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // Métodos getters e setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getWorkerLevel(){
        return level;
    }

    public void setWorkerLevel(WorkerLevel level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public ArrayList<HourContract> getHourContract(){
        return contracts;
    }

    public Department getDepartment(){
        return  department;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
    
    // toString

    public String toString(){
        return "Worker (Name = " + name + ", Level = " + level + ", Base  salary = R$ " + baseSalary + ")";
    }

    // Methods

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double getIncome(int year, int month){
        double sum = baseSalary;

        Calendar cal = Calendar.getInstance();

        for(HourContract c : contracts){
            cal.setTime(c.getDate());

            int c_month = 1 + cal.get(Calendar.MONTH);
            int c_year = cal.get(Calendar.YEAR);

            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }

        return sum;
    }
}
