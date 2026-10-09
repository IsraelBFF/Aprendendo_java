package services.interfac;

import entities.entities_interfaces.Contract;
import entities.entities_interfaces.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContractService {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private OnlinePaymentService onlinePaymentService;

    // Builders

    public ContractService(){}

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }



    public void processContract(Contract contract, Integer months, OnlinePaymentService service){
        double baseValue = contract.getTotalValue()/months;
        
        LocalDate dateContract = contract.getDate();
        
        for(int i = 1; i <= months ; i++) {
            double firstValue = baseValue + service.interest(baseValue, i);
            double finalValue = firstValue + service.paymentFee(firstValue);

            LocalDate dateInstallment = dateContract.plusMonths(i);
            contract.addInstallment(new Installment(dateInstallment,finalValue));

            String dateFormatedInstallment = dateInstallment.format(f1);
            IO.println(dateFormatedInstallment + " - " + String.format("%.2f", finalValue));
        }
    }
}
