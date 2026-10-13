package models.services;

import models.interfaces.InterestService;

public class BrazilInterestService implements InterestService{
    private Double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

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
