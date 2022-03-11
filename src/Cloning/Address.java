package Cloning;

public class Address implements Cloneable {
String city;
String State;
int pinCode;
public Address() {
	super();
}
public Address(String city, String state, int pinCode) {
	super();
	this.city = city;
	State = state;
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", State=" + State + ", pinCode=" + pinCode + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
