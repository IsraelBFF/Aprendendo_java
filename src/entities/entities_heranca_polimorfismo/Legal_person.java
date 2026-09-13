package entities.entities_heranca_polimorfismo;

public class Legal_person extends Taxpayer {
    private Integer qntdEmployee;

    // Builder 

    public Legal_person(){}

    public Legal_person(String name, Double annual_income, Integer qntdEmployee){
        super(name, annual_income);
        this.qntdEmployee = qntdEmployee;
    }

    // Methods getters and setters
    
    public Integer getQntdEmployee() {
        return qntdEmployee;
    }

    public void setQntdEmployee(Integer qntdEmployee) {
        this.qntdEmployee = qntdEmployee;
    }

    // Methods 

    @Override 
    public double valueTax(){
        double tax = getAnnual_income() * 0.16;

        if (qntdEmployee > 10){
            tax = getAnnual_income() * 0.14;
        }

        return tax;
    }
}
