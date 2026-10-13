package models.services;

import models.interfaces.InterestService;

public class UsaInterestService implements InterestService{
    private Double interestRate;

    // Builder

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    // Methods Getters and Setters

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override 
    public double payment(Double amount, Integer months){
        return amount * Math.pow(1 + interestRate / 100, months);
    }

    
}
