package Main;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas existirão na matriz?");
		int m = sc.nextInt();
		System.out.println("Quantas colunas existirão nessa mesma matriz?");
		int n = sc.nextInt();
		
		int[][] matriz = new int [m][n];
		
		System.out.println("Digite os dados da matriz a seguir: ");
		
		for (int i = 0 ; i<m ; i++) {
			for (int z = 0 ; z<n ; z++) {
				matriz [i][z] = sc.nextInt();
			}
		}

        System.out.println();
		System.out.println("Qual número deseja 'pescar' na matriz?");
        int x = sc.nextInt();
        
        for (int i = 0 ; i<m ; i++) {
        	for (int z = 0 ; z<n ; z++) {
        		 
        		  if ( matriz[i][z] == x) {
        			  System.out.println();
        			  System.out.println("Posicão: " + i + (",") + z);
        		 
        			if (z > 0) {
  						System.out.println("Esquerda: " + matriz[i][z-1]);
  					}
  					if (i > 0) {
  						System.out.println("Acima: " + matriz[i-1][z]);
  					}
  					if (z < matriz[i].length-1) {
  						System.out.println("Direita: " + matriz[i][z+1]);
  					}
  					if (i < matriz.length-1) {
  						System.out.println("Abaixo: " + matriz[i+1][z]);
  					}
        		
        	}
        }
		
		
		
		
		
	sc.close();
	}

}
}

