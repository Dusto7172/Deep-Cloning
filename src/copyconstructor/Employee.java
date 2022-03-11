package copyconstructor;

public class Employee {
int id;
String name;
Address address;

public Employee() {
	super();
}

public Employee(int id, String name, Address address) {
	this.id = id;
	this.name = name;
	this.address = address;
}


public Employee(Employee emp) {
	this.id =emp.id;
	this.name =emp.name;
	
	Address addDummy = new Address();
	addDummy.city=emp.address.city;
	addDummy.state=emp.address.state;
	addDummy.pinCode=emp.address.pinCode;
	this.address=addDummy;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
