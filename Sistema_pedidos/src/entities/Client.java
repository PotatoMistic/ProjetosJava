package entities;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Client {

private String name;
private String Email;
private Date BirthDate;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Date getBirthDate() {
	return BirthDate;
}
public void setBirthDate(Date birthDate) {
	BirthDate = birthDate;
}


public Client(String name, String email, Date Birth) {
	super();
	this.name = name;
	Email = email;
    this.BirthDate = Birth;
}

public Client () {


}

public String toString() {
	return 
	"Client: "
	+ getName()
	+ " // Data de Nascimento: "
	+  new SimpleDateFormat("dd 'de' MMMM 'de' yyyy").format(getBirthDate())
	+ " - "
	+ getEmail()
	;
	
}
}
