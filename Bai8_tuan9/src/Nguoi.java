
public class Nguoi {
private String lastName;
private String firstNmae;
public Nguoi(String lastName, String firstNmae) {
	
	this.lastName = lastName;
	this.firstNmae = firstNmae;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstNmae() {
	return firstNmae;
}
public void setFirstNmae(String firstNmae) {
	this.firstNmae = firstNmae;
}
@Override
public String toString() {
	return "Nguoi [lastName=" + lastName + ", firstNmae=" + firstNmae + ", getLastName()=" + getLastName()
			+ ", getFirstNmae()=" + getFirstNmae() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
