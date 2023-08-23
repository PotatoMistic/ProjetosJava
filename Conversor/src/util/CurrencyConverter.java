package util;

public class CurrencyConverter {

	
    public static double converter(double currency, double quantity) {
		double value_dolar = currency * quantity;
		double final_value = value_dolar + (value_dolar * 0.06); // Dollar + taxes
	    
		return final_value ;
    }
}
