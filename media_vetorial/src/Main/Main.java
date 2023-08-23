package Main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Quantos valores terá esse vetor?");
    int n = sc.nextInt();
    double[] vect = new double[n];
    
    for (int i = 0; i<n; i++) {
    	System.out.print("Digite um valor inteiro: ");
    	vect[i] = sc.nextDouble();
    }
	
    
    double somaVetores = 0;
    for (int i = 0 ; i<n ; i++) {
    	somaVetores = somaVetores + vect[i];
    }
	
    double media = somaVetores/n;
    
    System.out.println("Média dos valores é de " + media);
    System.out.println("Valores abaixo da média: ");
    
    for (int i = 0; i<n; i++) {
    	if(vect[i] < media) {
    		System.out.print(vect[i] + " ,");
    	}
    }
    
	
	
    sc.close();
	}

}
