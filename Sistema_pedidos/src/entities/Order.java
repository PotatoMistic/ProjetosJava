package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities_enum.OrderStatus;



public class Order {

private Client client;
private Date date;
private OrderStatus status;
private List<OrderItem> items = new ArrayList<OrderItem>();


public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public OrderStatus getStatus() {
	return status;
}
public void setStatus(OrderStatus status) {
	this.status = status;
}

public Order () {
	
}
public Order(Client client, Date date, OrderStatus status) {
	super();
	this.client = client;
	this.date = date;
	this.status = status;
}

public void addItem(OrderItem item) {
	items.add(item);
}
public void removeItem(OrderItem item) {
	items.remove(item);
}
public double total() {
	double sum = 0;
	for (OrderItem it : items) {
		sum += it.subTotal();
		}
return sum;
}

	
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Sumário da ordem de pedido:  \n");
	sb.append("Momento do pedido: ");
	sb.append(getDate() );
	sb.append(" \nStatus do pedido: ");
	sb.append(getStatus());
	sb.append("\n");
	sb.append(getClient());
	sb.append("\nItens pedidos: \n");
	for (OrderItem it : items) {
		sb.append(it + "\n");
		}
	sb.append("Total: ");
	sb.append(total());
	return sb.toString();
        
}


}
