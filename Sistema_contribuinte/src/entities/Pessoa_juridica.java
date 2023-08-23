package entities;

public final class Pessoa_juridica extends Contribuinte {

private Integer numeroDeFuncionarios;

public Pessoa_juridica () {
	super();
}

public Pessoa_juridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
	super(nome, rendaAnual);
	this.numeroDeFuncionarios = numeroDeFuncionarios;
}

public Integer getNumeroDeFuncionarios() {
	return numeroDeFuncionarios;
}

public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
	this.numeroDeFuncionarios = numeroDeFuncionarios;
}

@Override
public double impostoPago() {
	double taxToPay = 0;
	if (getNumeroDeFuncionarios() > 10) {
		taxToPay = getRendaAnual() * 0.14;
	 }
    if (getNumeroDeFuncionarios() < 10) {
    	taxToPay = getRendaAnual() * 0.16;
    }
   return taxToPay; 
}}
