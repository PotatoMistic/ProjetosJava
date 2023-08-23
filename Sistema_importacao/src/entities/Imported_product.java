package entities;

public final class Imported_product extends Product {

public Double customFee;	

public Imported_product () {
	super();
}

public double totalPrice() {
	return customFee + super.getPrice();
}
public Imported_product(String name, Double price, Double customFee) {
	super(name, price);
	this.customFee = customFee;
}

public Double getCustomFee() {
	return customFee;
}

public void setCustomFee(Double customFee) {
	this.customFee = customFee;
}

@Override
public String priceTag () {
return getName() 
	   + " $: "
	   + String.format("%.2f", totalPrice())
	   + "(Custom fee: $ "
	   + String.format("%.2f", getCustomFee())
	   + ")";


} 




}