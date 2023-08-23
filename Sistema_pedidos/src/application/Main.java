package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite os dados do cliente:  ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de nascimento: dd/MM/yyyy ");
		String BirthScan = sc.nextLine();
		Date y1 = sdf1.parse(BirthScan);
		
		Client client = new Client (name, email, y1);
 
		System.out.println("Qual o estado da ordem de pedido? PENDING_PAYMENT/PROCESSING/SHIPPED/DELIVERED");
				
		OrderStatus Status = OrderStatus.valueOf(sc.next() );	
		
		Order od = new Order (client, new Date(), Status);
		
		System.out.println("Quantos produtos nesse pedido? ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i<n ; i++) {
			
			System.out.println("Digite os dados do produto #" +(i+1) + ": ");
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Digite o valor do produto: ");
			Double productPrice = sc.nextDouble();
			System.out.println("Qual a quantidade desse produto ?");
			int quantidade = sc.nextInt();
			System.out.println();
			
			Product product = new Product (productName, productPrice );
			OrderItem orderItem = new OrderItem(quantidade, product.getPrice(), product);
		    od.addItem(orderItem);
		}
	       
		System.out.println(od);
		
		
		
		
		
		sc.close();
	}

}
