package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountInfo;

    

public class Program {

	public static void main(String[] args) {
		// user interface

	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
		
		AccountInfo conta = new AccountInfo(); 
	   
		System.out.println("Digite o número de conta a ser aberto: ");
	    conta.setAccountNumber(sc.nextInt());
	    System.out.println("Agora, digite o nome do beneficiário: ");
	    conta.name = sc.next();
	    System.out.println("Deseja fazer um depósito inicial? Responda S/N");
	    String answer = sc.next();
	     
	     if ( answer.equals("S") ) {
	    	
	    	 System.out.println("Qual valor do depósito?: ");
	    	 conta.initialBalance(sc.nextDouble());
	    	 System.out.println(conta); 
	     }
	     
	     else {
	       System.out.println("Account data: ");
	       System.out.println(conta);
	     } 
		 
	     System.out.println();
	     System.out.println("Digite o valor de depósito: ");
	     conta.setDeposit(sc.nextDouble());
	     System.out.println(conta);
	    
	     System.out.println();
	     System.out.println("Digite o valor de saque: ");
	     double saque = sc.nextDouble();
	     conta.setWithdraw(saque);
	     System.out.println(conta);
	     
	   
	
	     
	     sc.close();
	}

}
