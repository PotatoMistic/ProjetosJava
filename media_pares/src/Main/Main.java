package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos elementos terão o vetor? ");
    int n = sc.nextInt();
    int[] vect = new int[n];
    
    for (int i = 0 ; i<n ; i++) {
    	System.out.print("Digite um valor: ");
    	vect[i] = sc.nextInt();
    	}
	 
    int somaPares = 0;
    int quantidadePares = 0;
    
    for (int i=0 ; i < n ; i++) {
    	if ( vect[i] % 2 == 0) {
    		somaPares = somaPares + vect[i];
    		quantidadePares += 1;
    	}
    }
	
    if (somaPares > 0) {
    	System.out.println("A média dos números pares é de " + somaPares/quantidadePares);
    }
    else {
    	System.out.println("Não existem números pares para realizar uma média :(");
    }
	
	sc.close();
	}

}
