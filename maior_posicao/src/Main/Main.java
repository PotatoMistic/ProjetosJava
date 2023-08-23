package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números deseja avaliar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um valor real: ");
			vect[i] = sc.nextDouble();
			}
        
		
		int maiorposicao = 0;
		double maior = vect[0];
		
	    System.out.println();
		System.out.println("O maior valor é: ");
		
		for (int i = 0; i < n ; i++) {
			if (vect[i] > maior) {
			   maior = vect[i];
			   maiorposicao = i;
			   }  
				
			}
		
        System.out.print(  maior  + ", na posição vetorial  " + maiorposicao);
	
	
	
	sc.close();
	}

}
