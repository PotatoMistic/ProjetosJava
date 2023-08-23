package Main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
    try {
		System.out.println("Entre com os dados da conta: ");
		
		System.out.println();
		System.out.println("Qual será o número da conta? ");
		int accountNumber = sc.nextInt();

        System.out.println("Qual nome do beneficiário?");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Qual saldo inicial? ");
		double balance = sc.nextDouble();
		
		System.out.println("Qual será o limite de saque?");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(accountNumber, holder, balance, withdrawLimit);
		
	
		System.out.println("Quanto deseja sacar?");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Novo saldo de conta: " + account.getBalance());
		}
		
        catch (InputMismatchException e){
			System.out.println("Erro: " + e.getMessage());
		}
	    catch (RuntimeException e) {
	    	System.out.println("Erro inesperado, por favor confira os dados");
	    }
	
	
	sc.close();
	}

}
