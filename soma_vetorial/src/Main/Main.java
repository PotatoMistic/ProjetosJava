package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantos valores terão cada vetor?");
	int n = sc.nextInt();
   
	System.out.println("Digite o valores do vetor A: ");
    int[] vectA = new int[n];
    
    for (int i = 0; i<n;  i++) {
    	
    	vectA[i] = sc.nextInt();
    }
	
	
    System.out.println("Digite agora os valores do vetor B");
	int[] vectB = new int[n];
	
	for (int i = 0; i<n; i++) {
	
		vectB[i] = sc.nextInt();
	}
	
	System.out.println();
	System.out.println("Vetor C (Soma) resultante: ");
	
	for (int i = 0 ; i<n ; i++) {
		System.out.println( (vectA[i] + vectB[i]) );
	}
	
	
	
	
	
	sc.close();
	}

}
