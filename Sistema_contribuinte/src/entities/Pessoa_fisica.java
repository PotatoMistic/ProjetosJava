package entities;

public final class Pessoa_fisica extends Contribuinte {

public double gastosComSaude;


public double getGastosComSaude() {
	return gastosComSaude;
}

public void setGastosComSaude(double gastosComSaude) {
	this.gastosComSaude = gastosComSaude;
}

public Pessoa_fisica () {
	super();
}

public Pessoa_fisica(String nome, Double rendaAnual, double gastosComSaude) {
	super(nome, rendaAnual);
	this.gastosComSaude = gastosComSaude;
}


@Override
public double impostoPago() {
	double taxToPay = 0;
	if (getRendaAnual() < 20000) {
		if (getGastosComSaude() > 0) {
			taxToPay = getRendaAnual() * 0.15 - ( getGastosComSaude() * 0.5);
		   }
	    if (getGastosComSaude() == 0) {
	    	taxToPay = getRendaAnual() * 0.15;
	       }
	   }
   
	if (getRendaAnual() > 20000) {
    	if (getGastosComSaude() > 0) {
    		taxToPay = getRendaAnual() * 0.25 - ( getGastosComSaude() * 0.5);
    	   }
       if (getGastosComSaude() == 0) {
    	   taxToPay = getRendaAnual() * 0.25;
           }
	   }
      
    return taxToPay;
}}
