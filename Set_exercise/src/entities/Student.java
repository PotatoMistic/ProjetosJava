package entities;

import java.util.Objects;

public class Student {

private Integer studentCode;

public Integer getStudentCode() {
	return studentCode;
}

public void setStudentCode(Integer studentCode) {
	this.studentCode = studentCode;
}

public Student(Integer studentCode) {
	super();
	this.studentCode = studentCode;
}

@Override
public int hashCode() {
	return Objects.hash(studentCode);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(studentCode, other.studentCode);
}






}
