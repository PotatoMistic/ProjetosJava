package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

private Integer roomNumber;
private Date checkIn;
private Date checkOut;

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


public Integer getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(Integer roomNumber) {
	this.roomNumber = roomNumber;
}
public Date getCheckIn() {
	return checkIn;
}
public void setCheckIn(Date checkIn) {
	this.checkIn = checkIn;
}
public Date getCheckOut() {
	return checkOut;
}
public void setCheckOut(Date checkOut) {
	this.checkOut = checkOut;
}

public void updateReservation (Date checkIn , Date checkOut) {
	Date now = new Date();
	if (checkIn.before(now) || checkOut.before(now) ) {
		throw new IllegalArgumentException("A reserva deve ser para datas futuras");
	}
	if (!checkOut.after(checkIn)) {
		throw new IllegalArgumentException("A data de checkout deve ser após a a data de checkIn");
	}
	
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}

public Long duration () {
	long diff = getCheckOut().getTime() - getCheckIn().getTime();
	return TimeUnit.DAYS.convert(diff , TimeUnit.MILLISECONDS);
}

public Reservation () {
	
}

public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
	super();
	this.roomNumber = roomNumber;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
}



}
