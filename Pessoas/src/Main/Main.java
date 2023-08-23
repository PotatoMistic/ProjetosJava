package Main;

import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas deseja digitar?");
		int n = sc.nextInt();
		
		double soma = 0;
		
		String[] names = new String[n];
		int[] ages = new int [n];
		double[] heights = new double[n];
		
		
		for (int i = 0 ; i < n ; i++) {
			
			int pessoa = i + 1;
			System.out.println("Dados da " + pessoa + "a pessoa");
			
			sc.nextLine();
			System.out.print("Nome: ");
			names[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			heights[i] = sc.nextDouble();
		
		    soma = soma + heights[i];
		}
        double menores = 0;
		double somaIdade = 0;
        
		System.out.println("Altura média = " + soma/n);
       
		System.out.println("Pessoas menores de 16: ");
		
		for (int i = 0; i<n; i++) {
		      if (ages[i] < 16) {
	             System.out.print(names[i] + " ");
		      }
		      }
        
		
		for (int i = 0; i<n; i++) {
			    if (ages[i] < 16) {
		            menores = menores + 1;
		            }
		    somaIdade = somaIdade + 1;
		    }
		
		
		double media = (menores/n) * 100;
		
		 if (menores > 1) {
		       System.out.println();
			   System.out.println("Representando: " + media + "%" );
		    }
        

	
	sc.close();	
	}

}
