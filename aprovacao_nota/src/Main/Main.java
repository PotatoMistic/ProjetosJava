package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		double[] vectGrade = new double[n];
		double[] vectGrade2 = new double[n];
		String[] vectName = new String[n];
	
			
		
		
		for (int i = 0 ; i<n ; i++) {
            sc.nextLine();
			System.out.print("Nome da " + (i+1) + "a pessoa: ");
            vectName[i] = sc.nextLine();
			System.out.print("Nota 1 : ");
			vectGrade[i] = sc.nextDouble();
			System.out.print("Nota 2 : ");
			vectGrade2[i] = sc.nextDouble();
		}
 
		
	   System.out.println("Alunos aprovados: ");
	
	   for (int i = 0 ; i<n ; i++) {
		    if ( (vectGrade[i] + vectGrade2[i] / 2)  >= 6) {
			   System.out.print(vectName[i]);
			   System.out.println();
		      }
	       }
	
	
	sc.close();
	}

}
