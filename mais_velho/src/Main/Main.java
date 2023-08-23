package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		String[] vectName = new String[n];
		int[] vectAge = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa");
			System.out.print("Nome: ");
			vectName[i] = sc.next();
			System.out.print("Idade: ");
			vectAge[i] = sc.nextInt();
		}
		
       double maiorIdade = vectAge[0];
       String pessoaMaisVelha = vectName[0];
       
       for (int i=0 ; i<n ; i++) {
    	   if (vectAge[i] > maiorIdade) {
    		  maiorIdade = vectAge[i]; 
    		  pessoaMaisVelha = vectName[i];
    	      }
           }
	
      System.out.println("A pessoa mais velha é " + pessoaMaisVelha + " com " + maiorIdade + " anos"); 
		
	sc.close();
	}

}
