package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Employee;

public class application {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos empregados deseja cadastrar?");
    int n = sc.nextInt();
    
    List <Employee> employeeList =  new ArrayList<>(n); 
    
    for (int i=0 ; i<n ; i++ ) {
	   
	   System.out.println("Funcionário #" +(i+1) + (":"));
	 
	   sc.nextLine();
	   
	   System.out.print("Nome: ");
       String name = sc.nextLine();
     
	   System.out.print("Qual será o ID deste funcionário? ");
	   Integer employeeId = sc.nextInt();
	  
	   System.out.print("Digite o salário do funcionário: ");
	   Double employeeRent = sc.nextDouble();
	 
	   Employee emp = new Employee(employeeId, name, employeeRent);
	   
	   employeeList.add(emp);
	   
	   }
    
   System.out.println("Digite qual ID do funcionário que receberá um aumento: ");
   Integer idSearch = sc.nextInt();
   
   if (position(employeeList, idSearch) == null) {
	   System.out.println("Não existe um funcionário com este ID");
	   System.out.println();
   }
   else {
	   int x = position(employeeList, idSearch);
	   System.out.println("Qual a porcentagem que deseja aumentar deste funcionário?");
	   double porcentagem = sc.nextDouble();
       employeeList.get(x).setIncrease(porcentagem);
   }
	
   for (Employee emp : employeeList) {
	   System.out.print(emp);
	   System.out.println();
   }
	
sc.close();
}
public static Integer position (List <Employee> list, int id) {
	
    for (int i = 0 ; i < list.size(); i++) {
    	if (list.get(i).getId() == id) {
    		return i;
    	   }
        }
            return null;
    	
   }  
 } 