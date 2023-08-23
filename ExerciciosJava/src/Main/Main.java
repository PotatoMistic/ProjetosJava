package Main;
import java.util.Locale;
import Entities.Employee;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	
   Employee Employee = new Employee();
	
   System.out.println("Insira o nome do Empregado");
	Employee.name = sc.nextLine();
	
   System.out.println("Agora, insira o salário do funcionário: ");
    Employee.salario_bruto = sc.nextDouble();
    
   System.out.println("Insira a quantidade paga de imposto atual: ");
    Employee.tax = sc.nextDouble();
   
   System.out.println("Deseja modificar o salário deste empregado? Digite S/N");
   String answer = sc.next();
   
   ///
   System.out.println("Deseja aumentar ou diminuir? Digite A/D");
   String answer2 = sc.next();

   
       if ( answer.equals("S")) {
    	  if (answer2.equals("A")) {
    	                System.out.println("quantos % deseja aumentar?");
    	                Employee.percentage = sc.nextDouble();
    	                Employee.addPercentage(Employee.percentage, Employee.salario_bruto, Employee.tax );
    	                System.out.printf("O salário atual do funcionário %s é de %.2f", Employee.name, Employee.salario_liquido);
       }
    	  else if (answer2.equals("D")) {
    		           System.out.println("quantos % deseja diminuir?");
  	                   Employee.percentage = sc.nextDouble();
  	                   Employee.removePercentage(Employee.percentage, Employee.salario_bruto, Employee.tax );
  	                   System.out.printf("O salário atual do funcionário %s é de %.2f", Employee.name, Employee.salario_liquido);
    	  }
       }
       else if (answer.equals("N")) {
    	   System.out.printf("Salário não alterado, funcionário %s permanece com R$ %.2f reais", Employee.name, Employee.salario_liquido);
       }

	
	
	 
sc.close();
}

}
