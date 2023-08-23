package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
    int[] vectQuartos = new int[9];
  
    System.out.println("Quantas pessoas desejam alugar quartos?");
    int n = sc.nextInt();
   
    String[] vectNomes = new String[n];
    String[] vectEmails = new String[n];
    
    for (int i = 0 ; i<n ; i++) {
    	System.out.print("Digite o nome do " + (i+1) + "o cliente: " );
    	sc.nextLine();
    	vectNomes[i] = sc.nextLine();
    	
    	System.out.print("Digite o email do cliente: ");
    	vectEmails[i] = sc.nextLine();
    	System.out.print("Quarto designado: ");
    	vectQuartos[i] = sc.nextInt();
        }
   
   System.out.println(); 
   System.out.println("Quartos alugados:");
    
    for (int i = 0 ; i<9 ; i++) {
    	if (vectQuartos[i] != 0) { 
    	   System.out.print("Quarto " +  vectQuartos[i] + ": " + vectNomes[i] + ", " + vectEmails[i] );
    	   System.out.println();
    	}
    }
    
	
	
	
	
	
	
	
	
	
	
	
	sc.close();
	}

}
