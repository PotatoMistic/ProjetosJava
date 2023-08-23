package Main;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class main {

	public static void main(String[] args) {
		
		
		// Currency calc Interface

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Digite o preço atual do dólar: ");
		double currency = sc.nextDouble();
		System.out.println("Digite o valor de dólares a ser comprado: ");
		double dolar_qnt = sc.nextDouble();
	    double value = CurrencyConverter.converter(currency, dolar_qnt);
		System.out.printf("O valor pago em reais, será de R$ %.3f reais", value );
		
		
		
		
		
		sc.close();

	}

}
