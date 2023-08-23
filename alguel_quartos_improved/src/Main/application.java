package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		try {
		
		System.out.print("Número do quarto: ");
		int roomNumber = sc.nextInt();
		
		System.out.print("Data do checkIn: (dd/MM/yyy) : ");
		String date = sc.next();
		Date checkIn = sdf.parse(date);
		
		System.out.print("Data do checkOut: (dd/MM/yyy) : ");
		String date2 = sc.next();
		Date checkOut = sdf.parse(date2);

		Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
		
		// Atualização da reserva>>
		
		System.out.println();
		System.out.println("Entre com os dados para atualizar a reserva: ");
		
		System.out.print("Data do checkIn: (dd/MM/yyy) : ");
		String updtdate = sc.next();
		Date updtCheckIn = sdf.parse(updtdate);
		
		System.out.print("Data do checkOut: (dd/MM/yyy) : ");
		String updtdate2 = sc.next();
		Date updtCheckOut = sdf.parse(updtdate2);
		
		reservation.updateReservation(updtCheckIn, updtCheckOut);
	}
	catch (ParseException e) {
		System.out.println("Formato de data inválido");
	}
	catch (IllegalArgumentException e) {
			System.out.println("Erro na Reserva " + e.getMessage());
    }	
	catch (RuntimeException e) {
		System.out.println("Erro inesperado :(");
	}
	
	
	
	sc.close();
	}
}
