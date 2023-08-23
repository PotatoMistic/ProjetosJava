package Main;

import java.util.Locale;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite quantos números deseja Adicionar a esse vetor?:  ");
    int n = sc.nextInt();
    int [] vetor = new int[n];
    
      for (int i = 0; i<n; i++) {
    	System.out.println("Digite um valor: ");
    	vetor[i] = sc.nextInt();
        }
    
    double soma = 0;
    System.out.println("Valores: ");
      for (int i = 0; i < n; i++) {
    	  System.out.print(vetor[i] + " ");
    	  soma += vetor[i];
    	  }
    
      double media = soma/n;
      
      System.out.println(" Soma = " + soma + " Média dos Valores: " + media);
      
      
      
      sc.close();
	}

}
