package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
private OnlinePaymentServices onlinePaymentService;


	
	
public ContractService ( OnlinePaymentServices onlinePaymentService) {
	this.onlinePaymentService = onlinePaymentService;
	}



public void processContractService (Contract contract, int months) {
	
	Double basicQuota = contract.getTotalValue() / months;
	
	for (int i = 1 ; i<months ; i++) {
		
		LocalDate dueDate = contract.getContractDate().plusMonths(i);
	    
		Double interest = onlinePaymentService.interest(basicQuota, i);
	    
	    Double paymentFee = onlinePaymentService.paymentFee(basicQuota);
	    
	    Double totalQuota = basicQuota + interest + paymentFee;
	    
	    contract.getInstallment().add(new Installment (dueDate, totalQuota));
	
	
	}
}




}
