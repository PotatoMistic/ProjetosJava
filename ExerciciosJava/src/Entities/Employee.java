package Entities;

public class Employee {

	public String name;
	public double salario_bruto;
	public double percentage;
	public double tax;
	public double salario_liquido;
	
	public void addPercentage (double percentage, double salario, double tax)    {
		this.salario_liquido = salario + (salario/100 * percentage) - tax;
	}
	public void removePercentage (double percentage, double salario, double tax) {
		this.salario_liquido = salario - (salario * percentage) - tax;
	}
	
}
 