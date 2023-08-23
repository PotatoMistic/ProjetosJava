package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		
		try {
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data do contrato (dd/MM/yyyy) : ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double amount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, amount);
		
		ContractService contractService = new ContractService( new PaypalService());
		
		System.out.print("Entre com a quantidade de parcelas: ");
		int parcelas = sc.nextInt();
		
		contractService.processContractService(contract, parcelas);
		
		
		System.out.println("Parcelas: "); 
		  
		  for (Installment installment : contract.installment) {
			  System.out.println(installment);
		  }
		}
		
		
		catch (RuntimeException e) {
			System.out.println("Erro inesperado, favor reiniciar :(");
		}

	
	
	
	 sc.close();
	}

}
