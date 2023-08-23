package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Pessoa_fisica;
import entities.Pessoa_juridica;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes deseja registrar? ");
		int n = sc.nextInt();

		System.out.println();
		for (int i = 0 ; i<n ; i++) {
			System.out.println("Dados do Contribuinte #" + (i+1));
			System.out.print("O contribuinte é Pessoa Juridica ou fisica? PF/PJ ");
			char ch = sc.next().charAt(1);
			System.out.println("Qual nome do contribuinte?");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Qual a renda anual do contribuinte?");
			double renda = sc.nextDouble();
			
			if (ch == 'F') {
			   System.out.println("Qual gasto com saúde?");
			   Double gasto = sc.nextDouble();
			   list.add(new Pessoa_fisica(name, renda, gasto));
			   }
		    if (ch == 'J') {
		    	System.out.println("Qual o número de funcionários registrados?");
		    	int funcionarios = sc.nextInt();
		    	list.add(new Pessoa_juridica(name, renda, funcionarios));
		    }
		}
	   System.out.println();
 	   System.out.println("Impostos pagos: ");
	   
	   double totalTaxes = 0;
	 
	   for (Contribuinte con : list) {
		   System.out.printf("%s : $ %.2f", con.getNome(), con.impostoPago());
	       totalTaxes += con.impostoPago();
	       System.out.println();
	       }
	   
	   System.out.println();
	   System.out.println("Total Taxes: $ " + totalTaxes);
	
	
  sc.close();	
  }
}
