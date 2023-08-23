package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Imported_product;
import entities.Product;
import entities.Used_product;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> productsList = new ArrayList<Product>();
        
	    System.out.print("Digite quantos produtos a processar: ");
	    int n = sc.nextInt();
	   
	    for (int i = 0 ; i<n ; i++) {
		  System.out.println();
	      System.out.println("Dados do produto #" + (i+1));
	      System.out.print("Produto comum/importado ou usado? c/i/u : ");
	      char ch = sc.next().charAt(0);
	      System.out.println("Nome do produto: ");
	      sc.nextLine();
	      String name = sc.nextLine();
	      System.out.println("Digite o preço do produto: ");
	      Double price = sc.nextDouble();
	       
	        if (ch == 'c') { 
	    	    productsList.add(new Product (name, price));
	            }
	      
	        if (ch == 'i') {
	    	   System.out.println("Qual a taxa de importação?");
	    	   double tax = sc.nextDouble();
	    	   productsList.add(new Imported_product(name, price, tax));
	           }
	        
	        if (ch == 'u') {
	    	   System.out.println("Qual a data de fabricação? dd/MM/yyyy");
	    	   sc.nextLine();
	    	   String date = sc.nextLine();
	    	   Date y1 = sdf1.parse(date);
	    	   productsList.add(new Used_product(name, price, y1));
	       }
	   }
	    
	   System.out.println("Produtos cadastrados: ");
	   for (Product product : productsList) {
		   System.out.println(product.priceTag());
		   System.out.println();
	   }
	    
	
	sc.close();
	}

}
