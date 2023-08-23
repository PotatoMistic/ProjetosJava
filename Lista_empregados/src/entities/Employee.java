package entities;

public class Employee {
private Integer id;
public String name;
private Double salario;

public Employee() {
}
public Employee(int id, String name, double salario) {
	this.id = id;
	this.name = name;
	this.salario = salario;
}
public int getId() {
	return id;
}
public  void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalario() {
	return salario;
}

public  void setIncrease(double percentage) {
	salario = salario + (salario * percentage /100);
}

public String toString() {
	return id + (" ,") + name + (" ,") + salario;
			
}

 }