package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Used_product extends Product {

public Date manufactureDate;

public Date getManufactureDate() {
	return manufactureDate;
}

public void setManufactureDate(Date manufactureDate) {
	this.manufactureDate = manufactureDate;
}

public Used_product () {
	
}

public Used_product(String name, Double price, Date manufactureDate) {
	super(name, price);
	this.manufactureDate = manufactureDate;
}

@Override 
public String priceTag () {
return getName() 
	   + " (Used) $: "
	   + String.format("%.2f", super.getPrice())
	   + " (Manufacture date: "
	   + new SimpleDateFormat("dd/MM/yyyy").format(getManufactureDate())
       + ")";
}


}
