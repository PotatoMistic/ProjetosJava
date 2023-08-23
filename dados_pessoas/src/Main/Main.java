package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		String[] vectGender = new String[n];
		double[] vectHeight = new double[n];
		
		for (int i = 0 ; i<n ; i++) {
			System.out.print("Qual genero da " + (i+1) +  "a pessoa? F/M ");
			vectGender[i] = sc.next();
			System.out.print("Qual altura desta pessoa? ");
			vectHeight[i] = sc.nextDouble();
		}
		
        double menorAltura = vectHeight[0];
        double maiorAltura = vectHeight[0];
         
        for (int i = 0 ; i<n ; i++) {
        	if( vectHeight[i] < menorAltura ) {
        		menorAltura = vectHeight[i];
        	  }
            if (vectHeight[i] > maiorAltura ) {
            	maiorAltura = vectHeight[i];
              }
           }
        		
	   int quantidadeMulheres = 0;
	   int quantidadeHomens = 0;
	   Double somaAlturaMulheres = 0.0;
        
        for (int i = 0 ; i<n ; i++) {
		    if (vectGender[i].equals("F") ) {
		       quantidadeMulheres = quantidadeMulheres + 1;
		       somaAlturaMulheres += vectHeight[i];
		       }
	        if (vectGender[i].equals("M") ) {
	        	quantidadeHomens = quantidadeHomens + 1;
	           }
            }
	
	double mediaAlturaMulheres = somaAlturaMulheres/quantidadeMulheres;
    
    System.out.println("Menor altura: " + menorAltura);
	System.out.println("Maior altura: " + maiorAltura);
	System.out.printf("Média de altura das mulheres: %.1f", mediaAlturaMulheres);
	System.out.println("Quantidade de homens na amostra: " + quantidadeHomens);
	
        sc.close();
	}

}
