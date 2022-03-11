package copyconstructor;

public class Address {
String city;
String state;
int pinCode;
public Address() {
	super();
}
public Address(String city, String state, int pinCode) {
	super();
	this.city = city;
	this.state = state;
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", State=" + state + ", pinCode=" + pinCode + "]";
}


}
