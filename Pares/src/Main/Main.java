package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite quantos números deseja calcular: ");
	int n = sc.nextInt();
	int[] vect = new int[n];
	
	for (int i = 0; i<n; i++) {
		System.out.print("Digite um valor númerico inteiro: ");
		vect[i] = sc.nextInt();
	    }
	
    System.out.println();
	System.out.println("Números pares: ");
	
    int pares = 0;
    
	for (int i = 0; i<n; i++) {
		if (vect[i] % 2 == 0) {
			System.out.print(vect[i] + " ");
			pares = pares + 1;
	       }
	}
	System.out.println();
	System.out.println();
	System.out.print("Com " + pares  + " números pares");
	
	sc.close();
	}

}
